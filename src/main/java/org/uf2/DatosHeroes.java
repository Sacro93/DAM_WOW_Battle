package org.uf2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DatosHeroes implements Serializable {
    private static final long serialVersionUID = 1L;
    static List<Druida> druidas = new ArrayList<>();
    static List<Arquemaga> arquemagas = new ArrayList<>();
    static List<GuerreroOrco> guerreros = new ArrayList<>();


    public DatosHeroes  () {
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

    public Heroe numeroHeroe(int numero) {
        if (numero <= druidas.size()) {
            return druidas.get(numero - 1);
        } else if (numero <= druidas.size() + arquemagas.size()) {
            return arquemagas.get(numero - druidas.size() - 1);
        } else if (numero <= druidas.size() + arquemagas.size() + guerreros.size()) {
            return guerreros.get(numero - druidas.size() - arquemagas.size() - 1);
        }
        return null;
    }

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

    public void listarPersonajesNombre() {

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

    /*
        public void listarPersonajes() {

            int index = 1;

            System.out.println("Listado de Druidas:");
            for (Druida druida : druidas) {
                System.out.println(index + " - " + druida);
                index++;
            }

            System.out.println("\nListado de Arquemagas:");
            for (Arquemaga arquemaga : arquemagas) {
                System.out.println(index + " - " + arquemaga);
                index++;
            }

            System.out.println("\nListado de Guerreros Orco:");
            for (GuerreroOrco guerreroOrco : guerreros) {
                System.out.println(index + " - " + guerreroOrco);
                index++;
            }
        }
    */
    public void listarPersonajes() {
        // Imprime la lista numerada de héroes
        for (int i = 0; i < druidas.size(); i++) {
            System.out.println((i + 1) + ". " + druidas.get(i));
        }
        for (int i = 0; i < arquemagas.size(); i++) {
            System.out.println((i + 1 + druidas.size()) + ". " + arquemagas.get(i));
        }
        for (int i = 0; i < guerreros.size(); i++) {
            System.out.println((i + 1 + druidas.size() + arquemagas.size()) + ". " + guerreros.get(i));
        }
    }

    public Heroe buscarHeroeNombre(String nombre) {


        for (Druida druida : druidas) {
            if (druida.getNombre().equalsIgnoreCase(nombre)) {
                return druida;
            }
        }

        for (Arquemaga arquemaga : arquemagas) {
            if (arquemaga.getNombre().equalsIgnoreCase(nombre)) {
                return arquemaga;
            }
        }

        for (GuerreroOrco guerrero : guerreros) {
            if (guerrero.getNombre().equalsIgnoreCase(nombre)) {
                return guerrero;
            }
        }

        return null;
    }

    public boolean eliminarPersonajes(String nombreEliminar) {

        for (int i = 0; i < druidas.size(); i++) {
            if (druidas.get(i).getNombre().equals(nombreEliminar)) {
                druidas.remove(i);
                System.out.println("El druida seleccionado fue eliminado ");
                return false;
            }
        }
        for (int i = 0; i < arquemagas.size(); i++) {
            if (arquemagas.get(i).getNombre().equals(nombreEliminar)) {
                arquemagas.remove(i);
                System.out.println("La Aquemaga seleccionada fue eliminada ");
                return false;
            }
        }

        for (int i = 0; i < guerreros.size(); i++) {
            if (guerreros.get(i).getNombre().equals(nombreEliminar)) {
                guerreros.remove(i);
                System.out.println("Guerrero Orco seleccionado fue eliminado");
                return false;
            }
        }

        return false;
    }

    /*
    public boolean superPoder(String nombreElegido) {

        int puntosPlus = 100;
        int puntosRestar = 50;

        for (Druida druida : druidas) {
            if (druida.getNombre().equals(nombreElegido)) {
                int nuevaFuerza = (int) (druida.getFuerza() + puntosPlus);
                druida.setFuerza(nuevaFuerza);

                int nuevaInteligencia = (int) (druida.getInteligencia() + puntosPlus);
                druida.setInteligencia(nuevaInteligencia);

                int puntosBatallaActualizado = (int) (druida.getPuntosBatalla() - puntosPlus);
                druida.setPuntosBatalla(puntosBatallaActualizado);
            }
        }
        for (Arquemaga arquemaga : arquemagas) {
            if (arquemaga.getNombre().equals(nombreElegido)) {
                int nuevaFuerza = (int) (arquemaga.getFuerza() + puntosPlus);
                arquemaga.setFuerza(nuevaFuerza);

                int nuevaInteligencia = (int) (arquemaga.getInteligencia() + puntosPlus);
                arquemaga.setInteligencia(nuevaInteligencia);

                int puntosBatallaActualizado = (int) (arquemaga.getPuntosBatalla() - puntosPlus);
                arquemaga.setPuntosBatalla(puntosBatallaActualizado);
            }
        }

        for (GuerreroOrco guerreroOrco : guerreros) {
            if (guerreroOrco.getNombre().equals(nombreElegido)) {
                int nuevaFuerza = (int) (guerreroOrco.getFuerza() + puntosPlus);
                guerreroOrco.setFuerza(nuevaFuerza);

                int nuevaInteligencia = (int) (guerreroOrco.getInteligencia() + puntosPlus);
                guerreroOrco.setInteligencia(nuevaInteligencia);

                int puntosBatallaActualizado = (int) (guerreroOrco.getPuntosBatalla() - puntosPlus);
                guerreroOrco.setPuntosBatalla(puntosBatallaActualizado);
            }
        }


        return false;
    }
*/
    public boolean superPoder(int numeroElegido) {

        int puntosPlus = 100;
        int puntosRestar = 50;

        if (numeroElegido <= druidas.size()) {

            Druida druida = druidas.get(numeroElegido - 1);

            int nuevaFuerza = (int) (druida.getFuerza() + puntosPlus);

            druida.setFuerza(nuevaFuerza);

            int nuevaInteligencia = (int) (druida.getInteligencia() + puntosPlus);

            druida.setInteligencia(nuevaInteligencia);

            int puntosBatallaActualizado = (int) (druida.getPuntosBatalla() - puntosPlus);

            druida.setPuntosBatalla(puntosBatallaActualizado);

            return true;

        } else if (numeroElegido <= druidas.size() + arquemagas.size()) {

            Arquemaga arquemaga = arquemagas.get(numeroElegido - druidas.size() - 1);

            int nuevaFuerza = (int) (arquemaga.getFuerza() + puntosPlus);

            arquemaga.setFuerza(nuevaFuerza);

            int nuevaInteligencia = (int) (arquemaga.getInteligencia() + puntosPlus);

            arquemaga.setInteligencia(nuevaInteligencia);

            int puntosBatallaActualizado = (int) (arquemaga.getPuntosBatalla() - puntosPlus);

            arquemaga.setPuntosBatalla(puntosBatallaActualizado);

            return true;

        } else if (numeroElegido <= druidas.size() + arquemagas.size() + guerreros.size()) {

            GuerreroOrco guerreroOrco = guerreros.get(numeroElegido - druidas.size() - arquemagas.size() - 1);

            int nuevaFuerza = (int) (guerreroOrco.getFuerza() + puntosPlus);
            guerreroOrco.setFuerza(nuevaFuerza);

            int nuevaInteligencia = (int) (guerreroOrco.getInteligencia() + puntosPlus);
            guerreroOrco.setInteligencia(nuevaInteligencia);

            int puntosBatallaActualizado = (int) (guerreroOrco.getPuntosBatalla() - puntosPlus);
            guerreroOrco.setPuntosBatalla(puntosBatallaActualizado);
            return true;
        }
        return false;
    }

    public void agregarDruida(Druida druida) {
        druidas.add(druida);
    }

    public void agregarArquemaga(Arquemaga arquemaga) {
        arquemagas.add(arquemaga);
    }

    public void agregarGuerrero(GuerreroOrco guerrero) {
        guerreros.add(guerrero);
    }


}
