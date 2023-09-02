package org.pokemon;

import java.util.HashSet;
import java.util.Set;

public class Entrenador {
    private final String nombre;
    private final Set<Pokemon> pokebola = new HashSet<>();

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }

    public boolean entrenarPokemon(Pokemon pokemon, String ataque) {
        if (pokebola.contains(pokemon)) {
            System.out.println(nombre + " entrena a " + pokemon.getNombre() + " con " + ataque);
            pokemon.entrenar(ataque);
            return true;
        }
        System.out.println(nombre + " no encuentra a " + pokemon.getNombre() + " en la pokebola...");
        return false;
    }

    public Pokemon getPokemon(String pokemon) {
        for (Pokemon p : pokebola) {
            if (pokemon.equals(p.getNombre())) {
                return p;
            }
        }
        System.out.println(this.nombre + " no encuentra a " + pokemon + " en la pokebola...");
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void atrapar(Pokemon pokemon) {
        if (!pokemon.estaVivo()) {
            System.out.println(pokemon.getNombre() + " este pokemon esta muerto!");
            return;
        }
        pokebola.add(pokemon);
    }

}
