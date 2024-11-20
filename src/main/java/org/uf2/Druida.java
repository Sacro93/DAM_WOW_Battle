package org.uf2;

import java.io.Serializable;

public class Druida extends Heroe implements Serializable {

    public Druida(String nombre) {

        super(
                nombre,
                fuerzaHeroe(7, 3),
                0,
                agilidadHeroe(5, 4),
                inteligenciaHeroe(4, 4),
                resistenciaHeroe(1, 1),
                puntosVidaHeroe(70, 21),
                0,
                0
        );
    }

    @Override
    public String toString() {
        return "Druida{" +
                "nombre='" + nombre + '\'' +
                ", fuerza=" + fuerza +
                ", defensa=" + defensa +
                ", agilidad=" + agilidad +
                ", inteligencia=" + inteligencia +
                ", resistencia=" + resistencia +
                ", puntosVida=" + puntosVida +
                ", combatesGanados=" + combatesGanados +
                ", combatesPerdidos=" + combatesPerdidos +
                ", puntosBatalla=" + puntosBatalla +
                '}';
    }
}
