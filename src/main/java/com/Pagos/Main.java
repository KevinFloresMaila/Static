package com.Pagos;

public class Main {
    public static void main(String[] args) {
        Transferencia transferencia = new Transferencia(
            "1234567890", 
            "Banco XYZ", 
            "0987654321");
        transferencia.pagar(100.0);
        System.out.println(transferencia.imprimirRecibo(100.0));

        System.out.println("--------------------------------------------------");

        TarjetaCredito tarjetaCredito = new TarjetaCredito(
            "1234567812345678", 
            "Juan Perez", 
            "12/25", 
            "123");
        tarjetaCredito.pagar(2500.0);
        System.out.println(tarjetaCredito.imprimirRecibo(2500.0));

            System.out.println("--------------------------------------------------");

        CarritoCompras[] carrito = new CarritoCompras[3];
        carrito[0] = new CarritoCompras("Producto 1", 100);
        carrito[1] = new CarritoCompras("Producto 2", 200);
        carrito[2] = new CarritoCompras("Producto 3", 300);



    }
}
