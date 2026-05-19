package com.proyecto2.Clases;

import java.util.ArrayList;

public abstract class ClaseA {
 
    protected int largo;
    protected int ancho;
    protected int altura;

    protected ArrayList<Integer> memoria=new ArrayList<>();

    public ClaseA(int largo, int ancho, int altura) {
        System.out.println("Constructor de la clase A");
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
    }

    public int calcularArea(){
        return largo*ancho;
    }

    public int calcularVolumen(){
        return largo*ancho*altura;
    }



}
