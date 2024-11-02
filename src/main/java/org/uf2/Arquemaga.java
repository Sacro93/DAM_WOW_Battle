package org.uf2;

/*Arquemaga:
 ○ Atributos:
 ■ Nombre
 ■ Inteligencia: Entre 8 y 10 (valor aleatorio).
 ■ Resistencia Arcana: Entre 5 y 8 (valor aleatorio).
 ■ Agilidad: Entre 4 y 7 (valor aleatorio).
 ■ Puntos de Vida (PV): Entre 60 y 80 (valor aleatorio).
 ■ Combates ganados: Inicialmente 0.
 ■ Combates perdidos: Inicialmente 0.
 ■ Puntos de batalla: Inicialmente 100.*/
public class Arquemaga extends Heroe {

    public Arquemaga(String nombre) {

        super(nombre, 0,
                0,
                inteligenciaHeroe(8, 3),
                resistenciaHeroe(5, 4),
                agilidadHeroe(4, 4),
                puntosVidaHeroe(60, 30),
                0,
                0);

    }

    @Override
    public String toString() {
        return "Arquemaga{" +
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
