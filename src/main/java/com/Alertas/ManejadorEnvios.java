package com.Alertas;

public class ManejadorEnvios {

    private Alerta[] alertas = new Alerta[2];
    private int contador = 0;
    
    void agregarNotificacion(Alerta alerta){
            if (contador < alertas.length) {
                alertas[contador]=alerta;
                contador++;
            }else{
                Alerta radioAlerta = new Email() {
                 @Override
                public void enviarAlerta(String mensaje){
                    verificarConexion();
                    System.out.println("Arreglo saturado, no se puede enviar el siguiente mensaje: " + mensaje);
                }
                };
                radioAlerta.enviarAlerta("null");
            }
        }
    


    void enviarNotificaciones(){
        for (Alerta alerta : alertas) {
            alerta.enviarAlerta("¡Alerta de prueba!");
        }
    }
    
}
