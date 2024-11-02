package org.uf2;

import java.io.*;

public class SerializarHeroe {

    public static void serializarHeroes(DatosHeroes datosHeroes) {
        try (FileOutputStream archivo = new FileOutputStream("listadoHeroes.ser");
             ObjectOutputStream objectOutput = new ObjectOutputStream(archivo)) {
            objectOutput.writeObject(datosHeroes);
            System.out.println("Héroes serializados");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static  DatosHeroes deserializarHeroes() {
        DatosHeroes datosHeroes = null;
        try (FileInputStream fileInputStream = new FileInputStream("listadoHeroes.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            datosHeroes = (DatosHeroes) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error leyendo archivo , inicializandolo de nuevo");
            datosHeroes =new DatosHeroes();
        }
        return datosHeroes;
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
}
