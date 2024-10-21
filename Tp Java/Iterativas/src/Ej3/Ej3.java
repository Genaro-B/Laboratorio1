package Ej3;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int numeroProductos=0;
        int cantidadDisponible=0;
        //•	Pide al usuario ingresar el número de productos.
        System.out.println("Ingrese el numero de productos:");
        numeroProductos=leer.nextInt();
        while (numeroProductos>0){
            System.out.println("Ingrese la cantidad disponible del producto "+(numeroProductos));
            cantidadDisponible=leer.nextInt();
            if(cantidadDisponible<5){
                System.out.println("Es necesario hacer un pedido!");
            }else{
                System.out.println("Esta en condiciones (cantidad de productos es mayor o igual a 5)");
            }
            numeroProductos--;

        }
        System.out.println("<---Fin--->");
    }
}
