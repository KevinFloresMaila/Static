package com.Alertas;

public non-sealed class Email implements Alerta{

    @Override
    public void enviarAlerta(String mensaje) {
        verificarConexion();
        System.out.println("Enviando alerta por correo electrónico: " + mensaje);
    }

    
    

    
}
