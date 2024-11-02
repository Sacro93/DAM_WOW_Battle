package org.uf2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SerializarHeroe serializarHeroe = new SerializarHeroe();

        // Eliminar el archivo serializado si es necesario

       // serializarHeroe.eliminarArchivoSerializado();

        DatosHeroes datosHeroes = serializarHeroe.deserializarHeroes();

        //consultado a IA =>
        if (datosHeroes == null) {
            datosHeroes = new DatosHeroes();

            boolean salir = false;
            Scanner sc = new Scanner(System.in);

            int opcion = 0;

            while (!salir) {


                System.out.println("1- Crear Personaje");
                System.out.println("2-Borrar personaje");
                System.out.println("3-Listar Personajes ");
                System.out.println("4-Añade Superpoderes +100 fuerza , +100 Inteligencia, -50 Puntos de batalla");
                System.out.println("5-Batalla");


                try {
                    opcion = sc.nextInt();
                    sc.nextLine();

                    switch (opcion) {

                        case 1:
                            Heroe.crearHeroe(datosHeroes);
                            serializarHeroe.serializarHeroes(datosHeroes);
                            break;
                        case 2:
                            //Borrar Personaje: El programa leerá los personajes del archivo y permitirá eliminar
                            // un personaje existente. Una vez eliminado, actualizará la información del archivo.
                            datosHeroes.listarPersonajesNombre();

                            System.out.println("Ingresar el nombre del personaje a eliminar, ser preciso: ");
                            String personajeAEliminar = sc.nextLine();
                            datosHeroes.eliminarPersonajes(personajeAEliminar);
                            serializarHeroe.serializarHeroes(datosHeroes);

                            break;
                        case 3:
                            datosHeroes.listarPersonajes();
                            break;
                        case 4:

                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("opciones de 1  a 5 ");
                    }
                } catch (Exception e) {
                    System.out.println("Numero invalido");
                    sc.nextLine();
                }

            }

            sc.close();
        }

    }
}