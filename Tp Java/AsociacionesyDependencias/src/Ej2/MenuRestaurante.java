package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurante {
    public static void main (String[] args){
        //Creamos instancias de Scanner para leer los datos:
        //Para enteros:
        Scanner leer=new Scanner(System.in);
        //Para Strings:
        Scanner leer2=new Scanner(System.in);
        //Creamos una lista de platos para el restaurante:
        ArrayList<Plato>platos=new ArrayList<>();
        int cantidadPlatos=0;
        int cantidadIngredientes=0;
        String nombre="";
        double precio=0;
        boolean bebida=true;
        System.out.println("Indique la cantidad de platos a Ingresar:");
        cantidadPlatos=leer.nextInt();
        for(int i=1;i<=cantidadPlatos;i++){
            //Creamos una instancia de plato cada que ingresamos a la estructura repetitiva:
            Plato plato=new Plato();
            System.out.println("Ingrese el nombre del plato "+i+":");
            nombre=leer2.nextLine();
            System.out.println("Indique el precio del plato "+i+":");
            precio=leer.nextInt();
            System.out.println("Es Bebida?  true/false");
            bebida=leer.nextBoolean();
            //Seteamos los valores en el objeto plato:
            plato.setNombreCompleto(nombre);
            plato.setPrecio(precio);
            plato.setBebida(bebida);
            if(!plato.isBebida()){
                System.out.println("Indique la cantidad de ingredientes del plato "+plato.getNombreCompleto()+":");
                cantidadIngredientes=leer.nextInt();
                for(int j=1;j<=cantidadIngredientes;j++){
                    Ingrediente ingrediente=new Ingrediente();
                    System.out.println("Ingrese el nombre del ingrediente "+j+":");
                    ingrediente.setNombre(leer2.nextLine());
                    System.out.println("Ingrese la cantidad del ingrediente "+j+":");
                    ingrediente.setCantidad(leer.nextDouble());
                    System.out.println("Ingrese la unidad de medida del ingrediente "+j+":");
                    ingrediente.setUnidadMedida(leer2.nextLine());
                    //le pasamos ingrediente a la lista ingredientes del objeto plato
                    plato.agregarIngrediente(ingrediente);
                }
            }
            //por ultimo agregamos el plato al menu del restaurante:
            platos.add(plato);
        }
        //Mostrar Menu del restaurante:
        for(Plato p:platos){
            System.out.println("Plato "+(platos.indexOf(p)+1));
            p.mostrarInformacion();
            System.out.println(" ");
        }
        System.out.println("Fin");
    }
}
