package org.uf2;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Heroe implements Serializable {
    private static final long serialVersionUID = 8875008047544007813L;
    public String nombre;
    public int fuerza;
    public int defensa;
    public int agilidad;
    public int inteligencia;
    public int resistencia;
    public int puntosVida;
    public int combatesGanados;
    public int combatesPerdidos;
    public int puntosBatalla;

    public Heroe(String nombre, int fuerza, int defensa,
                 int agilidad, int inteligencia, int resistencia,
                 int puntosVida, int combatesGanados, int combatesPerdidos) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.defensa = defensa;
        this.agilidad = agilidad;
        this.inteligencia = inteligencia;
        this.resistencia = resistencia;
        this.puntosVida = puntosVida;
        this.combatesGanados = combatesGanados;
        this.combatesPerdidos = combatesPerdidos;
        this.puntosBatalla = 100;
    }

    static Random random = new Random();

    public static int fuerzaHeroe(int a, int b) {
        return a + random.nextInt(b);
    }

    public static int defensaHeroe(int a, int b) {
        return a + random.nextInt(b);
    }

    public static int agilidadHeroe(int a, int b) {
        return a + random.nextInt(b);
    }

    public static int inteligenciaHeroe(int a, int b) {
        return a + random.nextInt(b);
    }

    public static int resistenciaHeroe(int a, int b) {
        return a + random.nextInt(b);
    }

    public static int puntosVidaHeroe(int a, int b) {
        return a + random.nextInt(b);
    }


    public static void crearHeroe(DatosHeroes datosHeroes) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una opción:\n" + "1 - Druida\n" + "2 - Arquemaga\n" + "3 - Guerrero Orco");

        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                String nombreDruida;
                Druida druidaNuevo;
                do {
                    System.out.println("Elegiste Druida, ingresale un nombre");
                    nombreDruida = sc.nextLine();
                    druidaNuevo = new Druida(nombreDruida);
                    if (datosHeroes.personajeExistente(druidaNuevo)) {
                        System.out.println("Personaje ya existente, reintentar con otro nombre.");
                    }
                } while (datosHeroes.personajeExistente(druidaNuevo));
                datosHeroes.agregarDruida(druidaNuevo);
                break;
            case 2:
                String nombreArquemaga;
                Arquemaga nuevaArquemaga;
                do {
                    System.out.println("Elegiste Arquemaga, ingresale un nombre");
                    nombreArquemaga = sc.nextLine();
                    nuevaArquemaga = new Arquemaga(nombreArquemaga);
                    if (datosHeroes.personajeExistente(nuevaArquemaga)) {
                        System.out.println("Personaje ya existente, reintentar con otro nombre.");
                    }
                } while (datosHeroes.personajeExistente(nuevaArquemaga));
                datosHeroes.agregarArquemaga(nuevaArquemaga);
                break;
            case 3:
                String nombreGuerrero = sc.nextLine();
                GuerreroOrco nuevoGuerrero;
                do {
                    System.out.println("Elegiste Guerrero Orco, ingresale un nombre");
                    nuevoGuerrero = new GuerreroOrco(nombreGuerrero);
                    if (datosHeroes.personajeExistente(nuevoGuerrero)) {
                        System.out.println("Personaje ya existente, reintentar con otro nombre.");
                    }
                } while (datosHeroes.personajeExistente(nuevoGuerrero));
                datosHeroes.agregarGuerrero(nuevoGuerrero);
                break;
            default:
                System.out.println("Ingrece una opcion valida");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public double getFuerza() {
        return fuerza;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public double getPuntosVida() {
        return puntosVida;
    }

    public int getCombatesGanados() {
        return combatesGanados;
    }

    public int getCombatesEmpatados() {
        return combatesPerdidos;
    }

    public int getCombatesPerdidos() {
        return puntosBatalla;
    }
}
