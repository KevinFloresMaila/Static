package com.proyecto2.Clases;

public class Prueba {
// 1. Bloque estático
 
static {
    System.out.println("1. Bloque Estático");
}
 
// 2. Bloque de instancia
 
{ 
    System.out.println("2. Bloque de Instancia"); 
}
 
// 3. Constructor
 
public Prueba() {
    System.out.println("3. Constructor");
}
 
public static void main(String[] args) {
    System.out.println("--- Creando primer objeto ---");
 
    Prueba p1 = new Prueba();
    System.out.println("--- Creando segundo objeto ---");
 
    Prueba p2= new Prueba();

    }
}