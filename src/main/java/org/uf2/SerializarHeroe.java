package org.uf2;

import java.io.*;

public class SerializarHeroe {

    // Nombre fijo del archivo para serializar los héroes
    private static final String NOMBRE_ARCHIVO = "listadoHeroesx.ser";

    public static void serializarHeroes(DatosHeroes datosHeroes) {
        try (FileOutputStream archivo = new FileOutputStream(NOMBRE_ARCHIVO);
             ObjectOutputStream objectOutput = new ObjectOutputStream(archivo)) {
            objectOutput.writeObject(datosHeroes);
            System.out.println("Héroes serializados");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static DatosHeroes deserializarHeroes() {
        DatosHeroes datosHeroes = null;

        // Verificar si el archivo existe antes de intentar deserializar
        File archivo = new File(NOMBRE_ARCHIVO);
        if (archivo.exists()) {
            try (FileInputStream fileInputStream = new FileInputStream(archivo);
                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                datosHeroes = (DatosHeroes) objectInputStream.readObject();
                System.out.println("Héroes deserializados correctamente");
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                System.out.println("Error al leer el archivo, inicializándolo de nuevo");
                datosHeroes = new DatosHeroes();
            }
        } else {
            // Si el archivo no existe, inicializar una nueva instancia
            System.out.println("No se encontró el archivo, creando uno nuevo...");
            datosHeroes = new DatosHeroes();
        }

        return datosHeroes;
    }
}



//    public void eliminarArchivoSerializado() {
//        File archivo = new File("listadoHeroes.ser");
//        if (archivo.exists()) {
//            if (archivo.delete()) {
//                System.out.println("Archivo serializado eliminado con éxito.");
//            } else {
//                System.out.println("Error al eliminar el archivo serializado.");
//            }
//        } else {
//            System.out.println("El archivo serializado no existe.");
//        }
//    }

