package com.Polimorfismo;

public abstract class Empleado {
    
    private String name="Empleado";

    public void printName(){
        System.out.println(name);
    }

    public void ofinina(String pais){
        System.out.println("Estoy en mi oficina");
    }

    abstract void iniciarProyecto();

    
}
