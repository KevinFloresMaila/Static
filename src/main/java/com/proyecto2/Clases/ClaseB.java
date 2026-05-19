package com.proyecto2.Clases;

public class ClaseB extends ClaseA {
    
    public void calcularPerimetro(){
        System.out.println("Calculando perimetro en ClaseB");
    }

    public ClaseB(int largo, int ancho, int altura) {
        super(largo, ancho, altura);
        System.out.println("Constructor de la clase B");

    }

    @Override
    public int calcularVolumen(){
        double aux=this.ancho*this.altura*this.largo/Math.PI;
        return (int)aux;
    }
   
}
