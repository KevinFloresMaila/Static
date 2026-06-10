package com.proyecto2.Herencia;
import lombok.Getter;
public abstract class Recurso {
    
    @Getter 
    private String id;
    protected String titulo;
    protected boolean disponible;


    public Recurso(String id, String titulo, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = disponible;
    }

    public abstract void  mostrarFichaTecnica();

    protected void getInfo() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    public static void imprimir(){
        System.out.println("Hola");
    }





}
