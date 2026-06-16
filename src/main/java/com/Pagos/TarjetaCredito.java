package com.Pagos;

public class TarjetaCredito implements MetodoPago {

    private String numeroTarjeta;
    private String nombreTitular;
    private String fechaExpiracion;
    private String cvv;

    public TarjetaCredito(String numeroTarjeta, String nombreTitular, String fechaExpiracion, String cvv) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
        this.fechaExpiracion = fechaExpiracion;
        this.cvv = cvv;
    }

    public boolean pagar(double monto) {
        System.out.println("Validando tarjeta de crédito...");

        if (validarTarjeta()) {
            System.out.println("Procesando pago con tarjeta de crédito...");
            if(monto<3000){
                System.out.println("Pago exitoso por un monto de: " + monto);
            return true;
            }else{
                 System.out.println("No se pudo procesar el pago con tarjeta de crédito, monto excede el límite.");
                return false;
            }
        } else {
            return false;
        }
    }

    public String imprimirRecibo(double monto) {
        return "Recibo de Tarjeta de Crédito: Monto pagado: " + monto + "Con tarjeta número: " + numeroTarjeta+" a nombre de: " + nombreTitular;
    }

    private boolean validarTarjeta() {
        System.out.println("Validando número de tarjeta: " + numeroTarjeta);
        System.out.println("Validando nombre del titular: " + nombreTitular);
        System.out.println("Validando fecha de expiración: " + fechaExpiracion);
        System.out.println("Validando CVV: " + cvv);

        if (numeroTarjeta.length() != 16) {
            System.out.println("Número de tarjeta no válido");
            return false;
        } else if (cvv.length() != 3) {
            System.out.println("CVV no válido");
            return false;
        } else {
            System.out.println("Tarjeta validada exitosamente.");
            return true;
        }
    }
    
}
