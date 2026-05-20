package com.proyecto2;

public class Main {
    public static void main(String[] args) {
    

        /*ClaseA objB=new ClaseB(1,2,3);
        objB.calcularArea();
        objB.calcularVolumen();*/

        String birthdays[]=new String[10];
        birthdays[0]="Jana Russel, March 12";
        birthdays[1]="Landon Chan, May 18";
        birthdays[7]="Rosie Mills, January 3";
        
        String jana=birthdays[0];
        System.out.println(jana);
        System.err.println(birthdays);

        birthdays[2]="8";

        int tamaño=birthdays.length;
        System.out.println("Tamaño del arreglo: "+tamaño);

        for(int i=0;i<birthdays.length;i++){
            System.out.print(birthdays[i]+", ");
        }


        int newArray[]={1,2,3,5,8,13,21,34,55,89};
        System.out.println(newArray.length);



    }
}
