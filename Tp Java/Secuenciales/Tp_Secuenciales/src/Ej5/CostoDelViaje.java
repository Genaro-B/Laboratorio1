package Ej5;

import java.util.Scanner;

public class CostoDelViaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la distancia del viaje en kilómetros
        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        // Pedir el consumo de combustible en litros por kilómetro
        System.out.print("Ingrese el consumo de combustible del vehículo en litros por kilómetro: ");
        double consumoPorKilometro = scanner.nextDouble();

        // Pedir el precio del combustible por litro
        System.out.print("Ingrese el precio del combustible por litro: ");
        double precioPorLitro = scanner.nextDouble();

        // Calcular el costo total del viaje
        double litrosNecesarios = distancia * consumoPorKilometro;
        double costoTotal = litrosNecesarios * precioPorLitro;

        // Imprimir el costo total del viaje
        System.out.printf("El costo total del viaje es: \n"+ costoTotal);

        scanner.close();
    }
}
