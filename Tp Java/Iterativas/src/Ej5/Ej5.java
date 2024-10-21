package Ej5;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int numeroEmpleados=0;
        int horasTrabajo=0;
        //Solicitud de datos:
        System.out.println("Ingrese la cantidad de empleados que desea evaluar:");
        numeroEmpleados=leer.nextInt();
        do{
            System.out.println("Indique la cantidad de horas de trabajo en la semana del empleado:"+numeroEmpleados);
            horasTrabajo=leer.nextInt();
            if(horasTrabajo>40){
                System.out.println("Horas extras:"+(horasTrabajo-40));
            }else{
                System.out.println("El empleado realizó la cantidad justa o menos(no tiene horas extras)");
            }
            numeroEmpleados--;
        }while (numeroEmpleados>0);
        System.out.println("--FIN--");
    }
}
