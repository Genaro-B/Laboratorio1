package Ej2;

public class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    // Implementación del método realizarPago()
    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con PayPal...");
        System.out.println("Titular: " + titular);
        System.out.println("Correo electrónico: " + correoElectronico);
        System.out.println("Número de cuenta: " + numero);
        System.out.println("Pago realizado exitosamente con PayPal.");
    }

    @Override
    public void cancelarPago() {
        System.out.println("Pago con PayPal cancelado.");
    }
}
