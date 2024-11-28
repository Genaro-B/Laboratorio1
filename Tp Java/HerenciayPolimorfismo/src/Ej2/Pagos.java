package Ej2;

import java.util.ArrayList;

public class Pagos {
    private ArrayList<MetodoPago> metodosPago;

    public Pagos() {
        this.metodosPago = new ArrayList<>();
    }

    // Agregar un método de pago
    public void agregarMetodoPago(MetodoPago metodo) {
        metodosPago.add(metodo);
    }

    // Realizar pago con todos los métodos de pago
    public void realizarPagos() {
        for (MetodoPago metodo : metodosPago) {
            metodo.realizarPago();
        }
    }

    // Cancelar el pago si es posible
    public void cancelarPago(MetodoPago metodo) {
        if (metodo instanceof Cancelable) {
            ((Cancelable) metodo).cancelarPago();
        } else {
            System.out.println("Este método de pago no se puede cancelar.");
        }
    }

    // Mostrar la información de todos los métodos de pago
    public void mostrarInformacion() {
        for (MetodoPago metodo : metodosPago) {
            System.out.println("Titular: " + metodo.titular);
            System.out.println("Número: " + metodo.numero);
        }
    }
}
