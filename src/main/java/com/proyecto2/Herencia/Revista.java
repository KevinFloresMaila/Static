package com.proyecto2.Herencia;

public class Revista extends Recurso {
    
    private String periodicidad;

    public Revista(String id, String titulo, boolean disponible, String periodicidad) {
        super(id, titulo, disponible);
        this.periodicidad = periodicidad;
    }

    @Override
    public void mostrarFichaTecnica() {
        System.out.println("Periodicidad: " + periodicidad);
    }
    
}
