package Ej1;

public class VueloCharter extends Vuelo implements Promocionable{
    private double precioTotal;

    // Constructor
    public VueloCharter(String numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    // Implementación del método abstracto
    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    // Implementación de la interfaz Promocionable
    @Override
    public void aplicarPromocion() {
        double descuento = 0.15;  // Aplicamos un 15% de descuento
        double precioFinal = calcularPrecio() * (1 - descuento);
        System.out.println("Precio con promoción para vuelo charter " + numeroVuelo + ": " + precioFinal);
    }
}
