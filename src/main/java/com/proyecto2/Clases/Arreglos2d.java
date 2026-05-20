package com.proyecto2.Clases;

public class Arreglos2d {
    public static void main(String[] args) {
        
        int numeros[][]=new int[10][3];
        System.out.println("Matriz de tamaño: "+numeros.length);
        System.out.println(numeros[0].length);

        int resultado= numeros.length*numeros[0].length;
        System.out.println(resultado);

        for(int i=0; i<numeros.length;i++){
            System.out.println("Matriz "+i+":"+numeros[i]);
            for(int j=0;j<numeros[1].length;j++){
                System.out.println("Matriz interna "+i+" "+j+": "+numeros[i][j]);
               //System.out.print(numeros[i][j]+" ");
            }
            //System.out.println();
        }
    }
}
