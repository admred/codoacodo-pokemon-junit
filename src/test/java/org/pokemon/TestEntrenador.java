package org.pokemon;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class TestEntrenador {

    @Test
    void testCreateEntrenador(){
        Entrenador ethan=new Entrenador("Ethan");
        assertNotNull(ethan);
        assertEquals(ethan.getNombre(),"Ethan");
    }

    @Test
    void testEntrenadorAtrapaPikachu(){
        Entrenador ethan=new Entrenador("Ethan");
        Pokemon pikachu=new Pikachu();
        ethan.atrapar(pikachu);
        assertEquals(pikachu,ethan.getPokemon("Pikachu"));
    }

    @Test
    void testEntrenadorEntrenaPikachu(){
        Entrenador ethan=new Entrenador("Ethan");
        Pokemon pikachu=new Pikachu();
        ethan.atrapar(pikachu);
        ethan.entrenarPokemon(pikachu,"Lanzallamas");
    }

    @Test
    void testEntrenadorNoEncuentraPokemon(){
        Entrenador ethan=new Entrenador("Ethan");
        assertEquals(null,ethan.getPokemon("Pikachu"));
    }
}
