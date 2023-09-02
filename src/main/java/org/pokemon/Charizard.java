package org.pokemon;

public class Charizard extends Pokemon {


    public Charizard() {
        super("Charizard",new String[]{"Lanzallamas"});
    }


    @Override
    public boolean aprenderAtaque(String ataque) {
        String ataqueViejo = super.getPrimerAtaque();
        olvidarAtaque(ataqueViejo);
        if(!super.aprenderAtaque(ataque)) {
            return false;
        }
        System.out.println("Charizard aprende " + ataque + " y se olvida " + ataqueViejo);
        return true;
    }
}
