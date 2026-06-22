package com.Polimorfismo;

public class Jefe extends Empleado {

    private String name="Jefe";

    public void printName(){
        System.out.println(name);
    }
    
    @Override
    public void ofinina(String pais){
        System.out.println("Estoy en la oficina del jefe en "+ pais);
    }


    public void iniciarProyecto(){
        System.out.println("Iniciando proyecto  de Jefe");
    }

}
