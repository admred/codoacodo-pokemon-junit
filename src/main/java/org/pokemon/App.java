package org.pokemon;

public class App {
    public static void main(String[] args) {
        Entrenador ethan = new Entrenador("Ethan");
        Entrenador silver = new Entrenador("Silver");
        Pikachu pikachu = new Pikachu();
        Charizard charizard = new Charizard();
        Psyduck psyduck = new Psyduck();

        ethan.atrapar(pikachu);
        silver.atrapar(charizard);
        silver.atrapar(psyduck);

        charizard.ataca(psyduck);
        charizard.ataca(psyduck);
        charizard.ataca(psyduck);
        charizard.ataca(psyduck);
        charizard.ataca(psyduck);

        silver.entrenarPokemon(psyduck,"Lanzallamas");
        silver.entrenarPokemon(pikachu,"Lanzallamas");
        ethan.entrenarPokemon(pikachu,"Lanzallamas");
    }
}
