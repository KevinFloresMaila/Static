package com.SealedClases;

public class Main {
    public static void main(String[] args) {

       Transaccion transaccion=new Transaccion();

       Transaccion.Retiro retiro=transaccion.new Retiro();
       retiro.imprimirVoucher();
       retiro.obtenerSaldo();
       


    }
}
