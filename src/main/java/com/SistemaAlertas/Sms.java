package com.SistemaAlertas;

public class Sms implements Notificacion {

    public void alerta(String destinatario, String mensaje) {
         verificarConexion();
        System.out.println("[SMS] Notificacion enviada al numero: " + destinatario + " recibio el mensaje: " + mensaje);
    
       

    
    }
    @Override
    public void verificarConexion(){
         System.out.println("Verificando la señal del canal SMS....");
    }



}
