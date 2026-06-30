package com.SealedClases;

public  sealed class Transaccion permits Transaccion.Retiro,Transaccion.Transferencia {
    
     float obtenerSaldo(){
        return 0.0f;
     }
     boolean realizarTransferencia(String numeroCuenta){
        return true;
     }

     void imprimirVoucher(){
        System.out.println("Su vaucher ha sdo enviado a su correo");
     }


    public final class Retiro extends Transaccion{

    }

    public final class Transferencia extends Transaccion{
        
    }



}
