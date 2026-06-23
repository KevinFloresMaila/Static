package com.sistema;

public class Notificador {
    private Notificacion[] metodos;
    private int indices;

    public Notificador() {
        this.metodos = new Notificacion[3];
        this.indices = 0;
    }

    public void agregarNotificacion(Notificacion notificacion) {
        if (indices >= metodos.length) {
            Notificacion[] nuevo = new Notificacion[metodos.length * 2];
            System.arraycopy(metodos, 0, nuevo, 0, metodos.length);
            metodos = nuevo;
        }
        metodos[indices++] = notificacion;
    }

    public void enviarAlertas(String destinatario, String mensaje) {
        if (indices == 0) {
            System.out.println("No hay métodos de notificación disponibles.");
        }

        for (int i = 0; i < indices; i++) {
            if (metodos[i] != null) {
                metodos[i].alerta(destinatario, mensaje);
            }
        }
    }
}
