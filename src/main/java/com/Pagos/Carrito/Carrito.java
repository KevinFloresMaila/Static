package com.Pagos.Carrito;
import com.Pagos.MetodoPago;
public class Carrito {

    private ItemCarrito[] items = new ItemCarrito[3];
    private final int MAX_ITEMS = 3;
    private int itemCount = 0;

    public void agregarItem(String nombre, double precio) {
        if (itemCount < MAX_ITEMS) {
            ItemCarrito item = new ItemCarrito(nombre, precio);
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Carrito lleno. No se pueden agregar más de " + MAX_ITEMS + " items al carrito.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].precio();
        }
        return total;
    }

    public void mostarItems() {
        System.out.println("Items en el carrito:");
        for (int i = 0; i < itemCount; i++) {
           if (items[i] != null) {
            System.out.println("- " + items[i].nombre() + ": $" + items[i].precio());
            }
        }        
    }

    public void pagar(MetodoPago metodo){
        if(metodo.pagar(calcularTotal())){
            System.out.println(metodo.imprimirRecibo(calcularTotal()));

            for (int i = 0; i < items.length; i++) {
                items[i]= null;
            }
        }else{
            System.out.println("No se pudo procesar el pago.");
        }
    }



    /*public void pagarConTransferencia(String numerodecuenta,
        String banco,
        String cedula){
        MetodoPago transferencia=new Transferencia(
            numerodecuenta, 
            banco, 
            cedula);
       if( transferencia.pagar(calcularTotal())){
        //vaciar carrito
       };

    }
    public void pagarConTarjetaCredito(String numeroTarjeta, 
        String nombreTitular, 
        String fechaExpiracion,
         String cvv){
        MetodoPago tarjetacredito=new TarjetaCredito(
            numeroTarjeta, 
            nombreTitular, 
            fechaExpiracion, 
            cvv);
        if(tarjetacredito.pagar(calcularTotal())){
            //vaciar carrito
        };
    }   */
    }
