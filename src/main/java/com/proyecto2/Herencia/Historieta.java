package com.proyecto2.Herencia;

import lombok.Getter;

public class Historieta extends Revista {
    
    @Getter
    private String genero;

    public Historieta(String id, String titulo, boolean disponible, String periodicidad, String genero) {
        super(id, titulo, disponible, periodicidad);
        this.genero = genero;
    }

    @Override
    public void mostrarFichaTecnica() {
        super.getInfo();
        System.out.println("Género: " + genero);
        super.getId();
    }
    
}
