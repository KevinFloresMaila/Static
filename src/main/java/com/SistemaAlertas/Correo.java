package com.SistemaAlertas;

public class Correo implements Notificacion {
    
    public void alerta(String destinatario, String mensaje) {
        System.out.println("Notificacion enviada al correo " + destinatario + " con el mensaje: " + mensaje);
    }
}
