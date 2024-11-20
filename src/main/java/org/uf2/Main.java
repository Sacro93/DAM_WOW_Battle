package org.uf2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SerializarHeroe serializarHeroe = new SerializarHeroe();
        DatosHeroes datosHeroes = serializarHeroe.deserializarHeroes();


        // Si los datos deserializados son nulos, inicializamos nuevos datos de héroes
       if (datosHeroes == null) {
            datosHeroes = new DatosHeroes(); }

            boolean salir = false;
            Scanner sc = new Scanner(System.in);


            while (!salir) {

                System.out.println("1- Crear Personaje");
                System.out.println("2-Borrar personaje");
                System.out.println("3-Listar Personajes ");
                System.out.println("4-Añade Superpoderes +100 fuerza , +100 Inteligencia, -50 Puntos de batalla");
                System.out.println("5-Batalla");
                System.out.println("6-Salir");


                try {
                    int opcion = sc.nextInt();
                    sc.nextLine();

                    switch (opcion) {

                        case 1:
                            Heroe.crearHeroe(datosHeroes);
                            serializarHeroe.serializarHeroes(datosHeroes);
                            break;
                        case 2:
                            datosHeroes.listarPersonajesNombre();

                            System.out.println("Ingresar el nombre del personaje a eliminar, ser preciso: ");
                            String personajeAEliminar = sc.nextLine();
                          boolean eliminado =  datosHeroes.eliminarPersonajes(personajeAEliminar);

                            if (eliminado) {
                                System.out.println("Personaje eliminado correctamente.");
                                serializarHeroe.serializarHeroes(datosHeroes);
                            } else {
                                System.out.println("No se encontró el personaje indicado.");
                            }
                            break;

                        case 3:
                            datosHeroes.listarPersonajes();
                            break;
                        case 4:
                            datosHeroes.listarPersonajes();
                            System.out.println("Ingresar numero del heroe al que deseas aplicar super poder");
                            int numeroElegido = Integer.parseInt(sc.nextLine()); // Lee el número de héroe elegido
                            boolean actualizado = datosHeroes.superPoder(numeroElegido);
                            if (actualizado) {
                                System.out.println("Superpoder aplicado correctamente.");
                                serializarHeroe.serializarHeroes(datosHeroes);
                            } else {
                                System.out.println("No se encontró el héroe.");
                            }
                            break;
                        case 5:
                            datosHeroes.listarPersonajes();
                            System.out.println("Selecciona el número del primer héroe:");
                            int numeroHeroe1 = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Selecciona el número del segundo héroe:");
                            int numeroHeroe2 = sc.nextInt();
                            sc.nextLine();

                            Heroe heroe1 = datosHeroes.numeroHeroe(numeroHeroe1);
                            Heroe heroe2= datosHeroes.numeroHeroe(numeroHeroe2);

                            if (heroe1!= null && heroe2 != null){
                                Batalla.batalla(heroe1, heroe2);
                                serializarHeroe.serializarHeroes(datosHeroes);
                            }
                                else {
                                System.out.println("No existe alguno de los heroes que mencionas");
                            }
                            break;
                        case 6 :
                            System.out.println("Salir programa");
                            salir=true;
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
