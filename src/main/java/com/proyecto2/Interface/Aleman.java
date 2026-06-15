package com.proyecto2.Interface;

public class Aleman implements Persona {

    //private String tipo="Alemán";

    private String tipo;

   /*  {
        tipo="Alemán";
    }*/

    public Aleman() {
        this.tipo = "Alemán";
    }

public String hablar(String palabras) {
return "Hello, " + palabras;
}

public void caminar() {
System.out.println("El " + tipo + " está caminando.");
}

public void caminar(int pasos) {
System.out.println("El " + tipo + " caminó " + pasos + " pasos.");
}

public void comerSalchicha(int cantidadsalchichas) {
System.out.println("El " + tipo + " está comiendo " + cantidadsalchichas + " salchichas.");
}

public void come() {
System.out.println("El " + tipo + " está comiendo.");
}

public void camina() {
System.out.println("El " + tipo + " está caminando.");
}

public void duerme() {
System.out.println("El " + tipo + " está durmiendo.");
}
}