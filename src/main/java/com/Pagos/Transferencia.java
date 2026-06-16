package com.Pagos;

public class Transferencia implements MetodoPago {

    private String numeroCuenta;
    private String Banco;
    private String cedula;

    public Transferencia(String numeroCuenta,String Banco,String cedula) {

        this.numeroCuenta = numeroCuenta;
        this.Banco = Banco;
        this.cedula = cedula;

    }
    

    public boolean pagar(double monto) {

    System.out.println("Se esta validdando su numero de cuenta..... ");
    if(validarCuenta()){
       
        if(monto<5){
            System.out.println("No se pudo procesar la transferencia, monto muy bajo.");
            return false;
        }else{
            System.out.println("Se proceso su transferencia por un monto de: " + monto);
            return true;
        }
    }else{
        return false;
    }
    }




    public String imprimirRecibo(double monto) {
        return "Recibo de Transferencia: Monto pagado: " + monto+ " a la cuenta número: " + numeroCuenta+" del banco: " + Banco;
    }

    private boolean validarCuenta() {
        System.out.println("Validando numero de cuenta: " + numeroCuenta);
        System.out.println("Validando banco: " + Banco);
        System.out.println("Validando cedula: " + cedula);
        
        if(cedula.length() != 10){
            System.out.println("Cedula no valida");
            return false;
        }else{
            System.out.println("Cuenta validada exitosamente.");
        return true;
        }
    }

}
