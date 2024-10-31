package org.uf2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DatosHeroes implements Serializable {
    private List<Druida> druidas = new ArrayList<>();
    private List<Arquemaga> arquemagas = new ArrayList<>();
    private List<GuerreroOrco> guerreros = new ArrayList<>();


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


    //metodos para agregar nuevos heroes
    public void agregarDruida (Druida druida){
        druidas.add(druida);
    }
    public void agregarArquemaga(Arquemaga arquemaga){
        arquemagas.add(arquemaga);
    }
    public void agregarGuerrero(GuerreroOrco guerrero){
        guerreros.add(guerrero);
    }
    public void setDruidas(List<Druida> druidas) {
        this.druidas = druidas;
    }

    public void setArquemagas(List<Arquemaga> arquemagas) {
        this.arquemagas = arquemagas;
    }

    public void setGuerreros(List<GuerreroOrco> guerreros) {
        this.guerreros = guerreros;
    }


}
