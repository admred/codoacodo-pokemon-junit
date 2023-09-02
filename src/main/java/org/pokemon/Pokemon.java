package org.pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Pokemon {
    private final String nombre;
    private final List<String> ataques = new ArrayList<>();
    private int vida = 20;
    private int nivel = 0;

    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    public Pokemon(String nombre, String[] ataques) {
        this.nombre = nombre;
        this.nivel = 0;
        this.ataques.addAll(List.of(ataques));
        for (String a : ataques) {
            if (Ataques.containsAtaque(a)) {
                this.nivel += Ataques.getPotencia(a);
            }
        }
    }

    public boolean entrenar(String ataque) {
        if (!estaVivo()) {
            System.out.println(this.nombre + " esta muerto!");
            return false;
        }
        return aprenderAtaque(ataque);
    }

    public boolean recibeDanio(int danio) {
        if (!estaVivo()) {
            System.out.println(this.nombre + " esta muerto!");
            return false;
        }
        System.out.println(this.nombre + " recibe " + danio + " puntos de daño");
        this.vida = Integer.max(0, vida - danio);
        if (this.vida == 0) {
            System.out.println(this.nombre + " fallece en el acto ✝");
        }
        return true;
    }

    public boolean ataca(Pokemon pokemon) {
        if (!estaVivo()) {
            System.out.println(this.nombre + " esta muerto!");
            return false;
        }
        System.out.println(this.nombre + " castiga a " + pokemon.getNombre());
        pokemon.recibeDanio(this.nivel);
        return true;
    }

    public boolean aprenderAtaque(String ataque) {
        if (!estaVivo()) {
            System.out.println(this.nombre + " esta muerto!");
            return false;
        }
        if (!Ataques.containsAtaque(ataque)) {
            System.out.println("El ataque " + ataque + " no existe en la base de datos Ataques");
            return false;
        }
        this.ataques.add(ataque);
        this.nivel += Ataques.getPotencia(ataque);
        return true;
    }

    public boolean olvidarAtaque(String ataque) {
        if (!estaVivo()) {
            System.out.println(this.nombre + " esta muerto!");
            return false;
        }
        if (!entiende(ataque)) {
            System.out.println(this.nombre + " no conoce el ataque" + ataque);
            return false;
        }
        this.ataques.remove(ataque);
        this.nivel = Integer.max(0, this.nivel - Ataques.getPotencia(ataque));
        return true;
    }

    public boolean entiende(String ataque) {
        return ataques.contains(ataque);
    }

    public int getVida() {
        return vida;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    protected String getPrimerAtaque() {
        return ataques.get(0);
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(nombre, pokemon.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}

