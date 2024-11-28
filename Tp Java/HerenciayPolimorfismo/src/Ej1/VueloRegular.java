package Ej1;

public class VueloRegular extends Vuelo implements Promocionable{
    private int numeroAsientos;
    private double precioBasePorAsiento;

    // Constructor
    public VueloRegular(String numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBasePorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    // Implementación del método abstracto
    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioBasePorAsiento;
    }

    // Implementación de la interfaz Promocionable
    @Override
    public void aplicarPromocion() {
        double descuento = 0.10;  // Aplicamos un 10% de descuento
        double precioFinal = calcularPrecio() * (1 - descuento);
        System.out.println("Precio con promoción para vuelo regular " + numeroVuelo + ": " + precioFinal);
    }
}
