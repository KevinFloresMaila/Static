package com.SistemaAlertas;

interface Notificacion {

    void alerta(String destinatario, String mensaje);

    default void verificarConexion(){
        System.out.println("Verificando la señal por defecto....");
    }
    
}
