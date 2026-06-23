package com.sistema;

public  class Notificacion {

    String tipo="";

    

    public Notificacion(String tipo) {
        this.tipo = tipo;
    }



    public void alerta(String destinatario, String mensaje){
        System.out.println(this.tipo+" Notificacion enviada a "+ destinatario+" Con el mensaje "+ mensaje);
    }
}
