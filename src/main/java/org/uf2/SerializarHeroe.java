package org.uf2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializarHeroe {

    public void serializarHeroes(DatosHeroes datosHeroes) {
        try (FileOutputStream archivo = new FileOutputStream("listadoHeroes.ser");
             ObjectOutputStream objectOutput = new ObjectOutputStream(archivo)) {
            objectOutput.writeObject(datosHeroes);
            System.out.println("Héroes serializados");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public DatosHeroes deserializarHeroes() {
        DatosHeroes datosHeroes = null;
        try (FileInputStream fileInputStream = new FileInputStream("listadoHeroes.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            datosHeroes = (DatosHeroes) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return datosHeroes;
    }
}
