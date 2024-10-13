package Ej3;

import java.util.Scanner;

public class Rutinas {
    public static void main(String [] args){
        /*
            Enunciado:Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
            avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
            duraciones.
         */
        //Creamos una instancia de Scanner para leer los datos:
        Scanner leer=new Scanner(System.in);
        //Declaramos la variables a utilizar:
        String condicionFisica="";
        //Solicitar datos:
        System.out.println("Ingrese su condición Fisica (Principiante,Intermedio,Avanzado):");
        condicionFisica=leer.next();
        if(condicionFisica.equalsIgnoreCase("Principiante")){
            System.out.println("Caminata rápida: 30 minutos, 3 veces a la semana.\n" +
                            "Ejercicios de fuerza con peso corporal: 15 repeticiones de sentadillas, flexiones y abdominales, 2 veces a la semana.\n" +
                            "Estiramientos: 10 minutos después de cada sesión de ejercicio."
                    );
        }else{
            if(condicionFisica.equalsIgnoreCase("Intermedio")){
                System.out.println(
                        "Correr: 20-30 minutos, 3-4 veces a la semana.\n" +
                                "Entrenamiento de intervalos: 1 minuto de alta intensidad seguido de 2 minutos de recuperación, repetir 5 veces, 2 veces a la semana.\n" +
                                "Entrenamiento de fuerza: Pesas ligeras, 3 series de 10-12 repeticiones (piernas, brazos, espalda), 3 veces a la semana."
                );
            }else{
                if(condicionFisica.equalsIgnoreCase("Avanzado")){
                    System.out.println("Ciclismo: 45-60 minutos, 3-4 veces a la semana.\n" +
                            "Entrenamiento funcional: Circuito que incluya burpees, saltos y kettlebell, 3 veces a la semana.\n" +
                            "Entrenamiento de resistencia: 60 minutos de ejercicios en circuito con pesos altos, 2-3 veces a la semana.");
                }else {
                    System.out.println("Esa condición fisica no es reconocida");
                }
            }
        }


    }
}
