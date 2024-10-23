package Ej2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        String productos[]=new String[5];
        int stock[]=new int[5];
        for(int i=0;i<productos.length;i++){
            System.out.println("Ingrese el nombre del producto "+(i+1));
            productos[i]=leer.next();
            System.out.println("Ingrese el stock del producto "+(i+1));
            stock[i]=leer.nextInt();
        }
        generarReporteBajoStock(stock,productos);
    }
    public static void generarReporteBajoStock(int[] stock,String[] producto){
        System.out.println("--Productos con menos de 5 Unidades--");
        for(int i=0;i<stock.length;i++){
            if(stock[i]<5){
                System.out.println("* "+producto[i]);
            }
        }
    }
}
