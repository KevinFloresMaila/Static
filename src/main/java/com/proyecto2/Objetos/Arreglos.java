package com.proyecto2.Objetos;

public class Arreglos {

    public static void main(String[] args) {
     
        Frutas[] cestaFrutas=new Frutas[6];
        cestaFrutas[0]=new Frutas();
        cestaFrutas[0].nombre="Manzana";
        cestaFrutas[0].color="Rojo";

        cestaFrutas[1]=new Frutas();
        cestaFrutas[1].nombre="Pera";
        cestaFrutas[1].color="Verde";

        cestaFrutas[2]=new Frutas();
        cestaFrutas[2].nombre="Naranja";
        cestaFrutas[2].color="Naranja";

        for (int i = 0; i < cestaFrutas.length; i++) {
            if(cestaFrutas[i]!=null){
            System.out.println("Fruta: "+cestaFrutas[i].nombre+" - " +" Color: "+cestaFrutas[i].color);
        }
        }
    }


}
