package org.pokemon;

public class Psyduck extends Pokemon {

    public Psyduck() {
        super("Psyduck");
    }


    @Override
    public boolean entrenar(String ataque){
        System.out.println("Psyduck entrena pero no aprende nada");
        return true;
    }

    @Override
    public boolean aprenderAtaque(String ataque) {
        System.out.println("Psyduck no aprende...");
        return true;
    }

    @Override
    public boolean olvidarAtaque(String ataque) {
        System.out.println("Psyduck no tiene ataques.");
        return true;
    }
}
