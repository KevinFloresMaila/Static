package com.proyecto2.Anidado;

public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();

        Carrito.Item item1 = carrito.new Item("Laptop", 999.99, 1);

    }
}
