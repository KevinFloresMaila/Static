package com.InterfacesFuncional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println();
    


        Calculadora calc=new Calculadora();
        calc.suma(sc.nextInt(), sc.nextInt());
        calc.resta(sc.nextInt(), sc.nextInt());
        sc.close();







    



    }
}
