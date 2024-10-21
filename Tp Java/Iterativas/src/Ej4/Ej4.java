package Ej4;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int dias=1;
        int totalVentas=0;
        int venta=0;
        while (dias<=7){
            System.out.println("Indique la cantidad de ventas realizadas en el día "+(dias));
            venta=leer.nextInt();
            totalVentas+=venta;
            dias++;
        }
        System.out.println("Resultado:\nLa cantidad de ventas realizadas durante la semana son:"+totalVentas);
    }
}
