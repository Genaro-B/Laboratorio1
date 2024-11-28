package Ej1;

public class SistemasReserva {
    public static void main(String[] args) {
        // Crear vuelos regulares y charter
        VueloRegular vueloRegular1 = new VueloRegular("V001", "Madrid", "Barcelona", "2024-12-01", 100, 150.0);
        VueloCharter vueloCharter1 = new VueloCharter("C001", "Madrid", "New York", "2024-12-15", 2000.0);

        // Crear sistema de reservas y agregar vuelos
        Reservas reservas = new Reservas();
        reservas.agregarVuelo(vueloRegular1);
        reservas.agregarVuelo(vueloCharter1);

        // Mostrar información de vuelos
        System.out.println("Información de los vuelos:");
        reservas.mostrarVuelos();

        // Calcular precio total de las reservas
        double total = reservas.calcularPrecioTotal();
        System.out.println("Precio total de las reservas: " + total);

        // Aplicar promociones
        System.out.println("\nAplicando promociones:");
        reservas.aplicarPromociones();
    }
}
