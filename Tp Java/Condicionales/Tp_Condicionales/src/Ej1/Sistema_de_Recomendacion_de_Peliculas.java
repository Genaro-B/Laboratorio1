package Ej1;

import java.util.Scanner;

public class Sistema_de_Recomendacion_de_Peliculas {
    public static void main(String[] args){
        //Creamos una instancia de Scanner para leer los datos:
        Scanner leer=new Scanner(System.in);
        //Declaramos las variables a utilizar:
        int opcion=0;
        System.out.println("----MENÚ----");
        System.out.print("1)Acción\n2)Comedia\n3)Drama\n4)Ciencia Ficcion\n>");
        opcion=leer.nextInt();
        //Recomendar Pelicula en base al género seleccionado:
        System.out.println("----Resultado----");
        System.out.print("Pelicula:");
        switch (opcion){
            case 1:
                System.out.println("Mad Max: Fury Road (2015) ");
                break;
            case 2:
                System.out.println(" Superbad (2007)");
                break;
            case 3:
                System.out.println("La La Land (2016)");
                break;
            case 4:
                System.out.println("Inception (2010)");
                break;
            default:
                System.out.println("Ese valor no pertenece a ningún genero");
        }


    }
}
