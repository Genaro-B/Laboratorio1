package Ej2;

public abstract class MetodoPago {
    protected String titular;
    protected String numero;

    public MetodoPago(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    // Método abstracto para realizar el pago
    public abstract void realizarPago();
}
