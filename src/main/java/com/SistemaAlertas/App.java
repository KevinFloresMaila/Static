package com.SistemaAlertas;

public class App implements Notificacion {




    public void alerta(String destinatario, String mensaje) {
        System.out.println("Notificacion enviada a la App del usuario " + destinatario +  " con el mensaje: " + mensaje);
}
}
