package com.sistema;

public class Main {
    public static void main(String[] args) {
        Sms sms=new Sms("Sms");
        Notificacion correo=new Correo("Correo");
        Notificacion app=new App("App");


        Notificador notificador=new Notificador();
        notificador.agregarNotificacion(sms);
        notificador.agregarNotificacion(app);
        notificador.agregarNotificacion(correo);

        

        if(sms instanceof Notificacion){    //Metodo de comprobacion
            Notificacion notificacion=(Notificacion) sms;
        notificacion.alerta("null", "null");
        }

        

        Main.imprimirRespuesta(correo);

        notificador.enviarAlertas("usuario1234", 
            "se ha realizado el retiro de 500"
        );

       

        
        

    
    
    }

    public static void imprimirRespuesta(Notificacion correo){
             Correo correo1=(Correo) correo;

            correo1.imprimirRespuesta();
        }
}