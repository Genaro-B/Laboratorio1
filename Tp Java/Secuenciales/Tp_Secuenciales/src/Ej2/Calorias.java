package Ej2;

import java.util.Scanner;

public class Calorias {
    public static void main(String[] args){
        /*
        Enunciado:Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
        minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
        calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
        ejercicio.
         */
        //Declaramos una variable que nos permita controlar el flujo del programa( no hacer nada en caso de que el ejercicio no coincida)
        boolean control=true;

        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = leer.nextDouble();

        System.out.print("Ingrese la duración del ejercicio en minutos: ");
        double duracion =leer.nextDouble();

        System.out.print("Ingrese el tipo de ejercicio (correr, nadar, andar en bicicleta): ");
        String tipoEjercicio = leer.next().toLowerCase();

        // Definir la tasa de calorías quemadas por minuto
        double caloriasPorMinuto = 0;

        // Establecer la tasa de calorías según el tipo de ejercicio

        if (tipoEjercicio.equalsIgnoreCase("correr")) {
            caloriasPorMinuto = 10; // Ejemplo: 10 calorías por minuto
        } else{
            if (tipoEjercicio.equalsIgnoreCase("nadar")) {
                caloriasPorMinuto = 8; // Ejemplo: 8 calorías por minuto
            } else{
                if (tipoEjercicio.equalsIgnoreCase("andar en bicicleta")) {
                    caloriasPorMinuto = 6; // Ejemplo: 6 calorías por minuto
                } else {
                    System.out.println("Tipo de ejercicio no reconocido.");
                    control=false;
                    // Termina el programa si el tipo de ejercicio no es válido
                }
            }

        }
        //Evaluar si se va o no a calcular las calorias quemadas:
        if(control){
            // Calcular calorías quemadas
            double caloriasQuemadas = peso * caloriasPorMinuto * duracion;

            // Imprimir el resultado
            System.out.printf("Calorías quemadas:"+ caloriasQuemadas);
        }



    }
}
