package com.SistemaAlertas;

public class Correo implements Notificacion {
    
    public void alerta(String destinatario, String mensaje) {
        verificarConexion();
        System.out.println("[CORREO] Notificacion enviada al correo " + destinatario + " con el mensaje: " + mensaje);
    }
}
