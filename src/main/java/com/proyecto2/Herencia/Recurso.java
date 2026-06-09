package com.proyecto2.Herencia;
import lombok.Getter;
import lombok.Setter;
public abstract class Recurso {
    
    @Getter 
    private String id;
    @Getter 
    @Setter
    private String titulo;
    @Getter 
    @Setter
    private boolean disponible;


    public Recurso(String id, String titulo, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = disponible;
    }

    public void mostrarFichaTecnica() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }




}
