package org.pokemon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PsyduskTest {

    @Test
    public void testCrearPsydusk() {
        Psyduck psyduck = new Psyduck();
        assertNotNull(psyduck);
        assertEquals(psyduck.getNombre(), "Psyduck");
    }

    @Test
    public void testPsyduckEsDestruidoPorPikachu() {
        Psyduck psyduck = new Psyduck();
        Pikachu pikachu = new Pikachu();

        pikachu.ataca(psyduck);
        pikachu.ataca(psyduck);
        pikachu.ataca(psyduck);
        pikachu.ataca(psyduck);

        assertFalse(psyduck.estaVivo());

    }
}
