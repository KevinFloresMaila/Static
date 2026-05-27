package com.proyecto2.Clases;
import java.util.Scanner;
public class Bingo {
    public static void main(String[] args) {
        String[][] bingo;
        bingo =new String [5][5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                int aux = (int)(Math.random()*100);
                bingo[i][j] = String.valueOf(aux);
            }
        }
    
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
                System.out.print(bingo[i][j] + "\t");
            }
            System.out.println();
        }
        while (true) {
            System.out.println("Ingrese una fila (del 1 al 5): ");
            int fila = sc.nextInt()-1;

            System.out.println("Ingrese una columna (del 1 al 5): ");
            int columna = sc.nextInt()-1;

            bingo[fila][columna] = "X";

            for (int i = 0; i < bingo.length; i++) {
                for (int j = 0; j < bingo[i].length; j++) {
                  System.out.print(bingo[i][j] + "\t");
                }
               System.out.println();
            }
        }
        } 
    }

