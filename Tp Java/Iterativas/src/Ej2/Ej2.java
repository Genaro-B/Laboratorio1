package Ej2;

import java.util.Scanner;

public class Ej2 {
    public  static  void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int cantidadEmpleados=0;
        int cantidadHoras=0;
        //•	Pide al usuario ingresar la cantidad de empleados.
        System.out.println("Ingrese la cantidad de empleados:");
        cantidadEmpleados=leer.nextInt();
        for(int i=1;i<=cantidadEmpleados;i++){
            System.out.println("Indique la horas trabajadas del empleado "+(i)+" en la semana:");
            cantidadHoras=leer.nextInt();
            System.out.println("El empleado "+(i)+" ganó $"+(15*cantidadHoras));

        }
    }
}
