package Ej1;

import java.util.ArrayList;

public class Reservas {
    private ArrayList<Vuelo> vuelos;

    // Constructor
    public Reservas() {
        vuelos = new ArrayList<>();
    }

    // Método para agregar vuelos
    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    // Método para calcular el precio total de todas las reservas
    public double calcularPrecioTotal() {
        double total = 0;
        for (Vuelo vuelo : vuelos) {
            total += vuelo.calcularPrecio();
        }
        return total;
    }

    // Método para aplicar promociones a los vuelos promocionables
    public void aplicarPromociones() {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }
    }

    // Método para mostrar información de todos los vuelos
    public void mostrarVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println("Vuelo: " + vuelo.numeroVuelo + ", Origen: " + vuelo.origen + ", Destino: " + vuelo.destino + ", Fecha: " + vuelo.fecha);
        }
    }
}
