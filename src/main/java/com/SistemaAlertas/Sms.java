package com.SistemaAlertas;

public class Sms implements Notificacion {

    

    public void alerta(String destinatario, String mensaje) {
        System.out.println("Notificacion enviada al numero: " + destinatario + " recibio el mensaje: " + mensaje);
    }
}
