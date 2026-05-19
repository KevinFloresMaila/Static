package com.proyecto2.Objetos;

public class Perros {
    private int cantidadperros;
    private String causademuerte;

    

    public Perros(int cantidadperros, String causademuerte) {
        this.cantidadperros = cantidadperros;
        this.causademuerte = causademuerte;
    }
    public int getCantidadperros() {
        return cantidadperros;
    }
    public String getCausademuerte() {
        return causademuerte;
    }
    
}
