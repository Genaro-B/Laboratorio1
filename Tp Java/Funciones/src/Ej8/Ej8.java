package Ej8;

public class Ej8 {
    public static void main(String[] args){
        // Arreglos de empleados y horas trabajadas
        String[] empleados = {"Juan", "María", "Pedro", "Ana"};
        int[] horasTrabajadas = {40, 35, 45, 30};

        // Calcular y mostrar el pago semanal
        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    // Función para calcular el pago semanal
    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        double tarifaPorHora = 15.0; // Tarifa por hora trabajada

        for (int i = 0; i < empleados.length; i++) {
            double pagoSemanal = horasTrabajadas[i] * tarifaPorHora;
            System.out.println("El pago semanal de " + empleados[i] + " es: " + pagoSemanal);
        }
    }
}
