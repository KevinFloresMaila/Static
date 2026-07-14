package com.Funcionales;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
     public static void main(String[] args) {
        
        MiPredicate<Integer> esPar= (n)-> {
            int resto=n % 2;
            if(resto==0){
                return true;
            }else
        return false;
        };
        System.out.println(esPar.evaluar(12)); 
        System.out.println(esPar.evaluar(15));

         MiPredicate<int[]> mayorA10=(n)->{
            int contador=0;
            for (int i = 0; i < n.length; i++) {
                if(n[i]>0){
                    contador++;
                }
            }

            if (contador==0) {
                return true;
            }else
                return false;
        };
        System.out.println(mayorA10.evaluar(new int[]{5,8,12,15}));


        MiPredicate<String> esVacia=(n)->{
            if (n.length()==0) {
                return true;
            }else
                return false;
        };
        System.out.println(esVacia.evaluar("Hola"));

        //Interface funcional de Java
        Predicate<String> esvacia1=(s)->{
            if (s.length()==0) {
                return true;
            }else
                return false;
        };
        esvacia1.and(esvacia1);


        //Mi consumer
        MiConsumer<Persona> imprimirEstadistica=(persona)->{
            System.out.println("Nombre: "+persona.nombre);
            System.out.println("Apellido: "+persona.apellido);
            System.out.println("Edad: "+persona.edad);
        };
        imprimirEstadistica.consumir(new Jefe("Juan", "Perez", 45));
        imprimirEstadistica.consumir(new Empleado("Maria", "Gomez", 30));

        //Consumer de Java
        Consumer<Persona> consumer=(persona)->{
            System.out.println("Nombre: "+persona.nombre);
            System.out.println("Apellido: "+persona.apellido);
            System.out.println("Edad: "+persona.edad);
        };
        consumer.accept(new Jefe("Juan", "Perez", 45));
        consumer.accept(new Empleado("Maria", "Gomez", 30));


        Supplier <Persona> persona=()->{
            int edad=(int)(Math.random());
            Persona p=new Jefe("Juan","Perez",edad);
        return p;
        };
        persona.get();

        MiSupplier<Persona> persona1=()->{
            int edad=(int)(Math.random());
            if (edad<50) {
                Persona p=new Empleado("null", "null", edad);
                return p;
            }else{
                Persona p=new Jefe("null", "ull", edad);
                return p;
            }
        };
        persona1.generar().apellido="Gomez";

        MiSupplier<Persona[][]> mapa=()->{
            int min=5;
            int max=10;
            int filas=(int)(Math.random()*(max-min+1)+min);
            int columnas=(int)(Math.random()*(max-min+1)+min);

            Persona[][] matriz=new Persona[filas][columnas];
            return matriz;
        };
        mapa.generar();


        Function<Integer,Persona> f=(Integer i)->{
            if (i<50) {
                return new Empleado("null", "null", 30);
            }else{
                return new Jefe("Juan", "Perez", 45);
            }
        };
        f.apply(12);



     }
}
