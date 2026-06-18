package com.SistemaAlertas;

public class Main {

    public static void main(String[] args) {
        Notificador notificador = new Notificador();
        Correo correo=new Correo();
        notificador.agregarNotificacion(correo);
        notificador.agregarNotificacion(new Sms());
        notificador.agregarNotificacion(new App());

        String destinatario = "usuario123";
        String mensaje = "Hola, este es un mensaje de prueba.";

        notificador.enviarAlertas(destinatario, mensaje);
    }

}
