package com.Pagos;

public interface MetodoPago {
    
    boolean pagar(double monto);
    String imprimirRecibo(double monto);

}
