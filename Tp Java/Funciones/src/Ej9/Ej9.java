package Ej9;

public class Ej9 {
    public static void main(String[] args){
        // Arreglo de precios originales
        double[] preciosOriginales = {100.0, 250.0, 50.0, 75.0, 200.0};

        // Calcular y mostrar los precios finales
        double[] preciosFinales = calcularPrecioFinal(preciosOriginales);

        for (int i = 0; i < preciosFinales.length; i++) {
            System.out.println("Precio final del producto " + (i + 1) + ": " + preciosFinales[i]);
        }
    }

    // Función para calcular el precio final con descuento
    public static double[] calcularPrecioFinal(double[] precios) {
        double[] preciosFinales = new double[precios.length];
        double descuento = 0.10; // 10% de descuento

        for (int i = 0; i < precios.length; i++) {
            preciosFinales[i] = precios[i] - (precios[i] * descuento);
        }

        return preciosFinales;
    }
}

