package org.uf2;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Heroe implements Serializable {
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
        System.out.println("Ingresa una opcion " +
                "1 - Druida/n" +
                "2-Arquemaga/n" +
                "3-Guerrero Orco/n");

        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Elegiste Druida, ingresale un nombre");
                String nombreDruida = sc.nextLine();
                Druida druidaNuevo = new Druida(nombreDruida);
                datosHeroes.agregarDruida(druidaNuevo);
                break;
            case 2:
                System.out.println("Elegiste Arquemaga, ingresale un nombre");
                String nombreArquemaga = sc.nextLine();
                Druida arquemagaNueva = new Druida(nombreArquemaga);
                datosHeroes.agregarDruida(arquemagaNueva);
                break;
            case 3:
                System.out.println("Elegiste Guerrero Orco, ingresale un nombre");
                String nombreGuerrero = sc.nextLine();
                Druida guerreroNuevo = new Druida(nombreGuerrero);
                datosHeroes.agregarDruida(guerreroNuevo);
                break;

            default:
                System.out.println("Ingrece una opcion valida");
        }

        //leer que no sea duplicado al que este dentro del listado

        // guardar al archivo serializado "listadoHeroes.ser"
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
