package com.proyecto2.Clases;

public class Ejemplo {
    
 
// 2. Bloque de inicialización estático 
    static { 
         System.out.println("-> Bloque Estático ejecutado.");
        }
 
// 3. Variable de instancia (no estática) 
    public int variableInstancia = inicializarInstancia();
    
// 1. Variable de clase (estática) 
    public static int variableEstatica= inicializarEstatica();
 
// 4. Bloque de inicialización de instancia
 
{
    System.out.println("-> Bloque de Instancia ejecutado.");

}
 
// 5. Constructor
 
public Ejemplo() {
     System.out.println("-> Constructor ejecutado.");
}
 
// Métodos auxiliares para ver el orden
 
public static int inicializarEstatica() 
{ System.out.println("-> Variable Estática inicializada. ");
 
return 42;
}

public int inicializarInstancia(){
    System.out.println("-> Variable instancia");
    return 100;
}
public static void main(String[] args) {
    System.out.println("--Ejecutando main---");
    Ejemplo obj=new Ejemplo();
}

}
