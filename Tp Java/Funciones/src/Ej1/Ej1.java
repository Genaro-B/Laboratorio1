package Ej1;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int ventas[]=new int[30];
        System.out.println("--Ventas del mes--");
        for(int i=0;i<ventas.length;i++){
            System.out.println("Ingrese el ingrese de la venta del día "+(i+1));
            ventas[i]=leer.nextInt();
        }
        System.out.println("Ingresos Mensuales $"+calcularIngresosMensuales(ventas));
    }
    public static int calcularIngresosMensuales(int[] arreglo) {
        int sumaVentas = 0;
        for (int i = 0; i < arreglo.length; i++){
            sumaVentas += arreglo[i];
        }
        return sumaVentas;
    }

}