package com.Pagos;

import lombok.Getter;

public class CarritoCompras {

    @Getter
    private String nombre;
    @Getter
    private int valor;

    public CarritoCompras(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

}
