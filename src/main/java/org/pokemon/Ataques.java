package org.pokemon;

import java.util.HashMap;
import java.util.Map;

public class Ataques {
    private static final Map<String, Integer> ataques;

    static {
        ataques = new HashMap<>();
        ataques.put("Lanzallamas", 5);
        ataques.put("Agilidad", 1);
        ataques.put("Trueno", 3);
        ataques.put("Cola de hierro", 2);
    }

    public static int getPotencia(String nombre) {
        return ataques.get(nombre);
    }

    public static boolean containsAtaque(String nombre) {
        return ataques.containsKey(nombre);
    }
}
