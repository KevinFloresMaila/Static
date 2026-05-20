package com.proyecto2.Objetos;

public final class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat[] cats=new Cat[3];
        cats[0]=new Cat("Thomas");
        cats[1]=new Cat("Behemoth");
        cats[2]=new Cat("Lionel Michi");
    }
}
