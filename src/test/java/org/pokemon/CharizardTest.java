package org.pokemon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharizardTest {

    @Test
    void testCrearCharizard() {
        Charizard charizard = new Charizard();
        assertNotNull(charizard);
        assertEquals(charizard.getNombre(), "Charizard");
    }

    @Test
    void testCharizardAprendeUnAtaque() {
        Charizard charizard = new Charizard();
        charizard.aprenderAtaque("Cola de hierro");
        assertTrue(charizard.entiende("Cola de hierro"));
    }

    @Test
    void testCharizardSoloPuedeAprenderUnAtaque() {
        Charizard charizard = new Charizard();

        assertTrue(charizard.entiende("Lanzallamas"));
        charizard.aprenderAtaque("Cola de hierro");
        assertEquals(charizard.getPrimerAtaque(), "Cola de hierro");
        assertEquals(false, charizard.entiende("Lanzallamas"));
    }

}
