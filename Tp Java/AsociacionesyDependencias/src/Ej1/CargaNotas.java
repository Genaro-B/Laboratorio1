package Ej1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    public static void main(String[] args){
        //Creamos una instancia de Scanner para leer datos:
        //Para ints:
        Scanner leer=new Scanner(System.in);
        //Para Strings:
        Scanner leer2=new Scanner(System.in);
        //Creamos un ArrayList que permita almacenar un conjunto de alumnos:
        ArrayList<Alumno>alumnos=new ArrayList<>();
        int cantidadAlumnos=0;
        int cantidadNotas=0;
        String nombreCompleto="";
        long legajo=0;
        System.out.println("Indique la cantidad de alumnos que se van a registrar en el sistema:");
        cantidadAlumnos=leer.nextInt();
        for(int i=1;i<=cantidadAlumnos;i++){
            //Creamos una instancia nueva de alumno cada que itera:
            Alumno alumno=new Alumno();
            System.out.println("Ingrese el nombre completo del alumno "+(i)+":");
            nombreCompleto=leer2.nextLine();
            System.out.println("Ingrese el numero de legajo del alumno  "+(i)+":");
            legajo=leer.nextLong();
            //Seteamos los datos en el objeto alumno:
            alumno.setNombreCompleto(nombreCompleto);
            alumno.setLejago(legajo);
            //Pedimos la cantidad de notas del alumno actual:
            System.out.println("Indique la cantidad de notas del alumno "+nombreCompleto+":");
            cantidadNotas=leer.nextInt();
            for (int j=1;j<=cantidadNotas;j++){
                //Creamos una instancia nueva para cada nota del alumno:
                Nota nota=new Nota();
                System.out.println("Ingrese la catedra correspondiente a la nota:");
                nota.setCatedra(leer2.nextLine());
                System.out.println("Ingrese la nota "+j+":");
                nota.setNotaExamen(leer.nextDouble());
                //agregamos la nota en alumno:
                alumno.agregarNota(nota);
            }
            //Finalizamos cargando el alumno en la lista alumnos:
            alumnos.add(alumno);

        }
        //Por ultimo mostramos la informacion del alumno con sus notas y respectivo promedio:
        for (Alumno a:alumnos){
            a.mostrarInformacion();
        }
    }
}
