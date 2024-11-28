package Ej2;

public class SistemasDePagos {
    public static void main(String[] args) {
        // Crear algunos métodos de pago
        TarjetaCredito tarjeta = new TarjetaCredito("Juan Pérez", "1234-5678-9876-5432", "12/25", "123");
        PayPal paypal = new PayPal("María Gómez", "usuario@dominio.com", "maria@gmail.com");

        // Crear objeto Pagos
        Pagos pagos = new Pagos();

        // Agregar métodos de pago
        pagos.agregarMetodoPago(tarjeta);
        pagos.agregarMetodoPago(paypal);

        // Realizar pagos
        pagos.realizarPagos();

        // Cancelar pago
        pagos.cancelarPago(tarjeta);  // La tarjeta es cancelable
        pagos.cancelarPago(paypal);   // PayPal también es cancelable

        // Mostrar información de los métodos de pago
        pagos.mostrarInformacion();
    }
}
