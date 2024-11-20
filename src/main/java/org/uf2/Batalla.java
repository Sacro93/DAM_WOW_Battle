package org.uf2;

import java.util.Random;

public class Batalla {

    public static void batalla(Heroe heroe1, Heroe heroe2) {

        Random suerteRandom = new Random();
        int suerteDelHeroe1 = suerteRandom.nextInt(10) + 1;
        int suerteDelHeroe2 = suerteRandom.nextInt(10) + 1;

        System.out.println(heroe1.getNombre() + " VS " + heroe2.getNombre());
        System.out.println(heroe1.getNombre() + " Puntos Vida: " + heroe1.getPuntosVida() +
                " Factor suerte: " + suerteDelHeroe1);
        System.out.println(heroe2.getNombre() + " Puntos Vida: " + heroe2.getPuntosVida() +
                " Factor suerte: " + suerteDelHeroe2);

        int round = 1;
        while (heroe1.getPuntosVida() > 0 && heroe2.getPuntosVida() > 0) {
            System.out.println("\nRound numero: " + round);

            int ataqueHeroe1 = (int) ((heroe1.getFuerza() + heroe1.getAgilidad() + suerteDelHeroe1) / 2);
            int ataqueHeroe2 = (int) ((heroe2.getFuerza() + heroe2.getAgilidad() + suerteDelHeroe2) / 2);

            heroe2.setPuntosVida((int) (heroe2.getPuntosVida() - ataqueHeroe1));
            System.out.println(heroe1.getNombre() + " ataca con " + ataqueHeroe1 + " a " + heroe2.getNombre() + ", le restan " + heroe2.getPuntosVida() + " puntos de vida");

            if (heroe2.getPuntosVida() <= 0) break;

            heroe1.setPuntosVida((int) (heroe1.getPuntosVida() - ataqueHeroe2));
            System.out.println(heroe2.getNombre() + " ataca con " + ataqueHeroe2 + " a " + heroe1.getNombre() + ", le restan " + heroe1.getPuntosVida() + " puntos de vida");

            if (heroe1.getPuntosVida() <= 0) break;
            round++;
        }

        if (heroe1.getPuntosVida() > 0) {
            System.out.println(heroe1.getNombre() + " es el ganador");
            heroe1.sumarCombateGanados();
            heroe2.sumarCombatesPerdidos();
        } else {
            System.out.println(heroe2.getNombre() + " es el ganador");
            heroe1.sumarCombatesPerdidos();
            heroe2.sumarCombateGanados();
        }


        heroe1.sumarPuntosDeBatalla(heroe1.getPuntosVida() > 0 ? 50 : 0);
        heroe2.sumarPuntosDeBatalla(heroe2.getPuntosVida() > 0 ? 50 : 0);
    }
}
