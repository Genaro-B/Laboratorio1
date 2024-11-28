package Ej2;

public class TarjetaCredito extends MetodoPago implements Cancelable{
    private String fechaExpiracion;
    private String codigoSeguridad;

    public TarjetaCredito(String titular, String numero, String fechaExpiracion, String codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    // Implementación del método realizarPago()
    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con tarjeta de crédito...");
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Fecha de expiración: " + fechaExpiracion);
        System.out.println("Código de seguridad: " + codigoSeguridad);
        System.out.println("Pago realizado exitosamente con tarjeta de crédito.");
    }

    @Override
    public void cancelarPago() {
        System.out.println("Pago con PayPal cancelado.");
    }
}
