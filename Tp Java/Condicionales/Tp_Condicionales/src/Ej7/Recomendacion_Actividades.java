package Ej7;

import java.util.Scanner;

public class Recomendacion_Actividades {
    public static void main(String[] args){
        //Creo una instancia Scanner para leer los datos:
        Scanner leer =new Scanner(System.in);
        //Declaro las variables a utilizar:
        String estadoDeAnimo;
        //Solicitud de datos:
        System.out.println("Ingrese su estado de animo (Feliz,triste,Energico,Relajado)");
        estadoDeAnimo=leer.next();
        //Recomendar Actividad:
        System.out.print("Actividad Recomendada:");
        if(estadoDeAnimo.equalsIgnoreCase("Feliz")){
            System.out.println(" Salir a caminar o hacer un picnic al aire libre.");
        }else{
            if(estadoDeAnimo.equalsIgnoreCase("Triste")){
                System.out.println(" Escribir en un diario o hacer arte.");
            }else{
                if(estadoDeAnimo.equalsIgnoreCase("Energico")){
                    System.out.println("Hacer una sesión intensa de ejercicio, como una clase de spinning o una carrera.");
                }else{
                    if(estadoDeAnimo.equalsIgnoreCase("Relajado")){
                        System.out.println("Practicar meditación o yoga.");
                    }else{
                        System.out.println("Ese estado de animo no existe!");
                    }
                }
            }
        }
    }
}
