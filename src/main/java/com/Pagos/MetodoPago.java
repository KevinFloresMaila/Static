package com.Pagos;

interface MetodoPago {
    
    boolean pagar(double monto);
    String imprimirRecibo(double monto);

}
