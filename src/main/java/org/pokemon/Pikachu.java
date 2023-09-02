package org.pokemon;

import javax.annotation.processing.SupportedAnnotationTypes;

public class Pikachu extends Pokemon {

    public Pikachu() {
        super("Pikachu",new String[]{"Agilidad","Trueno","Cola de hierro"});
    }


    @Override
    public boolean aprenderAtaque(String ataque) {
        if(!super.aprenderAtaque(ataque)) return false;
        System.out.println("Pikachu aprende " + ataque);
        return true;
    }

    @Override
    public boolean olvidarAtaque(String ataque) {
        if (!super.olvidarAtaque(ataque)) return false;
        System.out.println("Pikachu olvida " + ataque);
        return true;
    }
}
