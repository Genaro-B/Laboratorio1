package Ej6;

import java.util.Scanner;

public class HabitosSaludables {
    public static void main(String[] args){
        //Creamos una instancia Scanner para leer los datos:
        Scanner leer=new Scanner(System.in);
        //Declaramos las variables a utilizar:
        int horasDescanso;
        int horasEjercicio;
        int cantComidasSaludabless;
        //Bienvenida:
        System.out.println("---Bienvenido al programa---");
        //Solicitud de datos:
        System.out.print("Ingrese la cantidad de horas de sueño al dia:");
        horasDescanso=leer.nextInt();
        System.out.print("Ingrese la cantidad de horas de ejercicio al dia:");
        horasEjercicio=leer.nextInt();
        System.out.print("Ingrese la cantidad de comidas saludables consumidas por día:");
        cantComidasSaludabless=leer.nextInt();
        //Determinar el estado de salud:
        System.out.print("Estado:");
        //Se debe complir cada uno de los posibles factores a evaluar para que un estado se considere valido:
        //Ej:Descanso de forma correcta ,como de forma correcta pero no complemento con una rutina de x horas en ejercicio
        //en este caso no estoy Excelente sino Parcialmente o a media por ende continuo evualuando lo demas.
        if(horasDescanso>=8 &&  cantComidasSaludabless>=6 && horasEjercicio >=4){
            System.out.println("Excelente.");
        }else{
            if(horasDescanso>=6 && cantComidasSaludabless>=4 && horasEjercicio>=2){
                System.out.println("Bien.");
            }else{
                System.out.println("Mal.");
            }
        }
    }
}
