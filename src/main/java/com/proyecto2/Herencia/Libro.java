package com.proyecto2.Herencia;
import lombok.Getter;

public class Libro extends Recurso {
    
    @Getter 
    private int numeroPaginas;



    public Libro(String id, String titulo, boolean disponible, int numeroPaginas) {
        super(id, titulo, disponible);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarFichaTecnica() {
        super.getInfo();
        System.out.println("Número de páginas: " + numeroPaginas);
    }



}
