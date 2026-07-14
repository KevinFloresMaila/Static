package com.InterfacesFuncional;


public class Calculadora {

    private void imprimirResultado(int resultado,String operacion){
        System.out.println("------------------------");
        System.out.println("el resultado de "+operacion+" es: "+resultado);
        System.out.println("----------------------------------------");
    }

    public void suma( int a, int b){
        Operacion o = (x, y) -> {
           x = x+1;
            y=y+1;
            imprimirResultado(x+y, "suma");
        };
        o.ejecutar(a, b);
    }

    public void resta( int a, int b){
        Operacion o = (x, y) -> {
            x = x-1;
            y=y-1;
            imprimirResultado(x-y, "resta");
        };
        o.ejecutar(a, b);

    }

    public void comparator ( int a, int b){
        Operacion o = (x, y) ->{
            if(x==y){
                System.out.println("Los numeros son iguales");
            }else{
                System.out.println("Los numeros no son iguales");
            }
        };
        o.ejecutar(a, b);
    }
    
}
