package com.proyecto2.Herencia;

public class Digital extends Recurso {

    private String url;

    public Digital(String id, String titulo, boolean disponible, String url) {
        super(id, titulo, disponible);
        this.url = url;
    }
    
    @Override
    public void mostrarFichaTecnica() {
        super.mostrarFichaTecnica();
        System.out.println("URL: " + url);
    }
}
