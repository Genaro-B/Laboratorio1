package Ej3;

import java.util.Scanner;


public class Sistema_de_Recomendacion_de_Libros {
    public static void main(String[] args) {
        //Creamos una instancia de Scanner para leer los datos:
        Scanner leer = new Scanner(System.in);
        //Declaramos las variables a utilizar:
        int opcion = 0;
        System.out.println("----MENÚ----");
        System.out.print("1)Fantasía\n2)Misterio\n3)Romance\n4)Ciencia Ficcion\n>");
        opcion = leer.nextInt();
        //Recomendar Libro en base al género seleccionado:
        System.out.println("----Resultado----");
        System.out.print("Libro:");
        switch (opcion) {
            case 1:
                System.out.println("El nombre del viento de Patrick Rothfuss ");
                break;
            case 2:
                System.out.println(" La chica del tren de Paula Hawkins");
                break;
            case 3:
                System.out.println("Orgullo y prejuicio de Jane Austen ");
                break;
            case 4:
                System.out.println("Dune de Frank Herbert");
                break;
            default:
                System.out.println("Ese valor no pertenece a ningún genero");
        }

    }
}
