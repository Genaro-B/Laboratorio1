package Ej2;

import java.util.Scanner;

public class Calculadora_de_Descuentos {
    public static void main(String[] args){
        //Crear una Instancia scanner para leer los datos:
        Scanner leer=new Scanner(System.in);
        //Declarar las variables a utilizar:
        int precioProducto;
        String categoria="";
        //Solicitar datos:
        System.out.print("Ingrese el precio del producto:");
        precioProducto=leer.nextInt();
        System.out.println("Ingrese Categoria(Estudiante,Adulto,Jubilado)");
        categoria=leer.next();
        if(categoria.equalsIgnoreCase("Estudiante")){
            System.out.println("Descuento de 10%:"+(precioProducto-((10*precioProducto)/100)));
        }else {
            if(categoria.equalsIgnoreCase("Adulto")){
                System.out.println("Descuento de 5%:"+(precioProducto-((5*precioProducto)/100)));
            }else {
                if(categoria.equalsIgnoreCase("Jubilado")){
                    System.out.println("Descuento del 15%:"+(precioProducto-((15*precioProducto)/100)));
                }else {
                    System.out.println("Error:Categoria Inexistente!");
                }
            }
        }
    }
}
