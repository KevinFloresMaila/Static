package com.Alertas;

public final class SMS implements Alerta{

    @Override
    public void enviarAlerta(String mensaje) {
        verificarConexion();
        System.out.println("Enviando alerta por SMS: " + mensaje);
    }
    
    
}
