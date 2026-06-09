package com.proyecto2.Clases;
import java.util.Scanner;
public class Bingo {
    public static void main(String[] args) {
        int min=3;
        int max=5;
        
        int randomNum = (int) (Math.random() * ( max - min + 1)) + min;

        String[][] bingo;
        bingo =new String [5][];

       for(int i=0;i<bingo.length;i++){
        bingo[i]=new String[randomNum];
       }

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
            for(int i=0;i<bingo.length; i++){
                for (int j = 0; j < bingo.length; j++) {
                    String aux = sc.nextLine();
                    if (aux==bingo[i][j]) {
                        
                    } else {
                        
                    }
                }
            }

            for (int i = 0; i < bingo.length; i++) {
                for (int j = 0; j < bingo[i].length; j++) {
                  System.out.print(bingo[i][j] + "\t");
                }
               System.out.println();
            }
        }
        } 
    }

