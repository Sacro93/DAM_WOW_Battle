package org.uf2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DatosHeroes implements Serializable {
    private static final long serialVersionUID = 1L;
    private static List<Druida> druidas = new ArrayList<>();
    private static List<Arquemaga> arquemagas = new ArrayList<>();
    private static List<GuerreroOrco> guerreros = new ArrayList<>();


    public DatosHeroes() {
        cargarDatosHeroes();
    }

    public void cargarDatosHeroes() {

        druidas.add(new Druida("Sylvathorn "));
        druidas.add(new Druida("Verdeluz "));
        druidas.add(new Druida("Raízombra "));
        druidas.add(new Druida("Aquelanza "));


        arquemagas.add(new Arquemaga("Místralia"));
        arquemagas.add(new Arquemaga("Astraleth"));
        arquemagas.add(new Arquemaga("Flamyr"));
        arquemagas.add(new Arquemaga("Arcárina"));


        guerreros.add(new GuerreroOrco("Krulgath"));
        guerreros.add(new GuerreroOrco("Gor'Gahn"));
        guerreros.add(new GuerreroOrco("Thra'gol"));
        guerreros.add(new GuerreroOrco("Vargnash"));


    }

    //metodo para comparar si el personaje que se quiere crear
// tiene el mismo nombre que uno que ya este en la lista
    public boolean personajeExistente(Heroe comparar) {
        for (Druida druida : druidas) {
            if (druida.getNombre().equals(comparar.getNombre())) {
                return true;
            }
        }
        for (Arquemaga arquemaga : arquemagas) {
            if (arquemaga.getNombre().equals(comparar.getNombre())) {
                return true;
            }
        }
        for (GuerreroOrco guerreroOrco : guerreros) {
            if (guerreroOrco.getNombre().equals(comparar.getNombre())) {
                return true;
            }
        }
        return false;
    }

    //metodo para borrar
    //Borrar Personaje: El programa leerá los personajes del archivo y permitirá eliminar
    // un personaje existente. Una vez eliminado, actualizará la información del archivo.


    public  void listarPersonajesNombre() {
        System.out.println("Listado de Druidas:");
        for (Druida druida : druidas) {
            System.out.println(druida.getNombre());
        }

        System.out.println("\nListado de Arquemagas:");
        for (Arquemaga arquemaga : arquemagas) {
            System.out.println(arquemaga.getNombre());
        }

        System.out.println("\nListado de Guerreros Orco:");
        for (GuerreroOrco guerreroOrco : guerreros) {
            System.out.println(guerreroOrco.getNombre());
        }
    }

    public void listarPersonajes(){
        System.out.println("Listado de Druidas:");
        for (Druida druida : druidas) {
            System.out.println(druida);
        }

        System.out.println("\nListado de Arquemagas:");
        for (Arquemaga arquemaga : arquemagas) {
            System.out.println(arquemaga);
        }

        System.out.println("\nListado de Guerreros Orco:");
        for (GuerreroOrco guerreroOrco : guerreros) {
            System.out.println(guerreroOrco);
        }
    }

    public  void eliminarPersonajes(String nombreEliminar) {


        for (int i = 0; i < druidas.size(); i++) {
            if (druidas.get(i).getNombre().equals(nombreEliminar)) {
                druidas.remove(i);
                System.out.println("El druida seleccionado fue eliminado ");
                return;
            }
        }
        for (int i = 0; i < arquemagas.size(); i++) {
            if (arquemagas.get(i).getNombre().equals(nombreEliminar)) {
                arquemagas.remove(i);
                System.out.println("La Aquemaga seleccionada fue eliminada ");
                return;
            }
        }

        for (int i = 0; i < guerreros.size(); i++) {
            if (guerreros.get(i).getNombre().equals(nombreEliminar)) {
                guerreros.remove(i);
                System.out.println("Guerrero Orco seleccionado fue eliminado");
                return;
            }
        }

    }


    //metodos para agregar nuevos heroes
    public void agregarDruida(Druida druida) {
        druidas.add(druida);
    }

    public void agregarArquemaga(Arquemaga arquemaga) {
        arquemagas.add(arquemaga);
    }

    public void agregarGuerrero(GuerreroOrco guerrero) {
        guerreros.add(guerrero);
    }

    public void setDruidas(List<Druida> druidas) {
        this.druidas = druidas;
    }

    public List<Druida> getDruidas() {
        return druidas;
    }

    public List<Arquemaga> getArquemagas() {
        return arquemagas;
    }

    public List<GuerreroOrco> getGuerreros() {
        return guerreros;
    }

    public void setArquemagas(List<Arquemaga> arquemagas) {
        this.arquemagas = arquemagas;
    }

    public void setGuerreros(List<GuerreroOrco> guerreros) {
        this.guerreros = guerreros;
    }

}
