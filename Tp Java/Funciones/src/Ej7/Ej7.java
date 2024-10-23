package Ej7;

public class Ej7 {
    public static void main(String[] args){
        // Arreglo de compras
        double[] compras = {450.0, 600.0, 300.0, 800.0, 200.0, 700.0};

        // Aplicar descuento
        aplicarDescuento(compras);

        // Mostrar los resultados
        for (double compra : compras) {
            System.out.println("Monto final de la compra: $" + compra);
        }
    }

    // Función para aplicar el descuento
    public static void aplicarDescuento(double[] compras) {
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                compras[i] -= compras[i] * 0.15; // Aplica el 15% de descuento
            }
        }

    }
}
