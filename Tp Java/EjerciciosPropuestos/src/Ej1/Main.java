package Ej1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner leer=new Scanner(System.in);
        //Creamos una Instancia de persona (yo no le voy a pasar argumentos al constructor)
        Persona p1=new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona:");
        p1.setApellido(leer.next());
        System.out.println("Ingrese el año de nacimiento:");
        p1.setAnioNacimiento(leer.nextInt());
        System.out.println("Ingrese el pais de nacimiento:");
        p1.setPaisNacimiento(leer.next());
        System.out.println("Ingrese su Genero M/F : ");
        p1.setGenero(leer.next().charAt(0));
        //Luego de pedir la informacion , imprimimos por pantalla:
        p1.imprimirInformacion();

    }
}
