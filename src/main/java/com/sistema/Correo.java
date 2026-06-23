package com.sistema;

public class Correo extends Notificacion {

        public Correo(String tipo) {
                super(tipo);
        }

        public void imprimirRespuesta(){
                System.out.println("El correo fue enviado con exito");
        }
    
        
}
