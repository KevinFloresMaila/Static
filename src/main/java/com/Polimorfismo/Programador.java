package com.Polimorfismo;

public class Programador extends Empleado {

    private String name="Programador";

    public void printName(){
        System.out.println(name);
    }
    
    @Override
    public void ofinina(String pais){
        System.out.println("Estoy en la oficina del Programador en "+pais);
    }


    public void iniciarProyecto(){
        System.out.println("Iniciando proyecto  de Programador");
    }

    public void oficina(){
        System.out.println("Sali de la oficina");
    }


    
}
