package org.pokemon;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPikachu {

    @Test
    void testCrearPikachu(){
        Pikachu pikachu=new Pikachu();
        assertNotNull(pikachu);
        assertEquals(pikachu.getNombre(),"Pikachu");
    }
    @Test
    void testPicachuAtacaACharizard(){
        Pikachu pikachu=new Pikachu();
        Charizard charizard=new Charizard();
        int vidaInicialCharizard=charizard.getVida();
        boolean ok=pikachu.ataca(charizard);
        assertTrue(ok);
        assertEquals(pikachu.getNivel()+charizard.getVida(),vidaInicialCharizard);
    }

    @Test
    void testPikachuAprendeLanzallamas(){
        Entrenador ethan=new Entrenador("Ethan");
        Pokemon pikachu=new Pikachu();
        ethan.atrapar(pikachu);
        ethan.entrenarPokemon(pikachu,"Lanzallamas");
        assertTrue(pikachu.entiende("Lanzallamas"));
    }
}
