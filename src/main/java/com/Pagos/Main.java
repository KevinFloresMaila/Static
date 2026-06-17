package com.Pagos;
import com.Pagos.Carrito.Carrito;
public class Main {
    public static void main(String[] args) {

        Carrito carrito=new Carrito();
        carrito.agregarItem("Laptop", 1500.0);
        carrito.agregarItem("Smartphone", 100.0);  
        
        carrito.mostarItems();
        System.out.println("Total a pagar: $" + carrito.calcularTotal());

        MetodoPago tarjetaCredito=new TarjetaCredito("1234567891234567","Juan Perez","11/27", "213");

        carrito.pagar(tarjetaCredito);








        
        /*carrito.pagarConTarjetaCredito(
            "1234567890123456",
        "Juan Perez",
        "12/15",
        "123");*/
        
}
}
