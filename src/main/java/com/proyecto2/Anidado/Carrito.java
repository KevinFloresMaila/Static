package com.proyecto2.Anidado;

import lombok.Getter;
import lombok.Setter;

public class Carrito {
    
    public String id;

    
    {
        id = "Carrito-" + System.currentTimeMillis();
    }

    public String getInstanciaId() {
        return id;
    }

    class Item {
        private String nombre;
        private double precio;
        @Getter@Setter
        private int cantidad;
        @Getter@Setter
        private String detalles;

        public Item(String nombre, double precio, int cantidad ) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public String getId() {
            return id;
        }

        public String getInstanciaId() {
            return Carrito.this.getInstanciaId();
        }


    }
}
