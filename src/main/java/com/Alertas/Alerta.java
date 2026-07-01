package com.Alertas;

public sealed interface Alerta permits Email,SMS {

    void enviarAlerta(String mensaj);
    default void verificarConexion(){
        System.out.println("Verificando  conexión...");
    }  



}
