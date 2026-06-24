package com.SistemaAlertas;

public class App implements Notificacion {




    public void alerta(String destinatario, String mensaje) {
        verificarConexion();
        System.out.println("[APP] Notificacion enviada a la App del usuario " + destinatario +  " con el mensaje: " + mensaje);
}
}
