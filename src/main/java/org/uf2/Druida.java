package org.uf2;

public class Druida extends Heroe {

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
}
