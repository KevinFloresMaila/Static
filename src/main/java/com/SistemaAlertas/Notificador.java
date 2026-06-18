package com.SistemaAlertas;

public class Notificador {
    private Notificacion[] metodos;
    private int indices;

    public Notificador(Notificacion[] metodos) {
        this.metodos = new Notificacion[3];
        this.indices = 0;

        if (metodos != null) {
            for (int i = 0; i < metodos.length && i < this.metodos.length; i++) {
                this.metodos[i] = metodos[i];
                this.indices++;
            }
        }
    }

    public Notificador() {
        this.metodos = new Notificacion[3];
        this.indices = 0;
    }

    public void agregarNotificacion(Notificacion notificacion) {
        if (notificacion == null) {
            System.out.println("No se puede agregar una notificación nula.");
            return;
        }

        if (indices >= metodos.length) {
            System.out.println("No se pueden agregar más métodos de notificación.");
            return;
        }

        metodos[indices++] = notificacion;
    }

    public void enviarAlertas(String destinatario, String mensaje) {
        if (indices == 0) {
            System.out.println("No hay métodos de notificación disponibles.");
            return;
        }

        for (int i = 0; i < indices; i++) {
            if (metodos[i] != null) {
                metodos[i].alerta(destinatario, mensaje);
            }
        }
    }
}
