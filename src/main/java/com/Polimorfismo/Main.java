package com.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        
        Empleado e1=new Jefe();
        Programador e2=new Programador();



        e1.ofinina("Alemania");
        e2.ofinina("Francia");


        e1.printName();
        e2.printName();



    }
}
