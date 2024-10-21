package Ej1;

import java.util.Scanner;

public class Ej1 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        double totalTiempo = 0;
        String[] actividades = {"estudiar", "hacer ejercicios", "leer", "tiempo libre"};

        for (String actividad : actividades) {
            System.out.print("Ingrese las horas dedicadas a " + actividad + ": ");
            double tiempo = scanner.nextDouble();
            totalTiempo += tiempo; // Sumar al tiempo total

        }

        // Mostrar el tiempo total dedicado a actividades
        System.out.println("El tiempo total dedicado a actividades es: " + totalTiempo + " horas.");

        scanner.close();


    }

}
