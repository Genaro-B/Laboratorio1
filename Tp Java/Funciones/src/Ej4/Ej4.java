package Ej4;

public class Ej4 {
    public static void main (String[] args){
        //Se le asignan los valores a los dos arrays manualmente
        String[] clientes={"Matias","Geronimo","Sebastian","Sofia"};
        int[] compras={34,8,23,2};
        calcularDescuento(compras,clientes);

    }
    public static void calcularDescuento(int[] compras,String[] clientes){
        //Aplicar descuento a aquellos con más de 10 compras.
        for(int i=0;i<compras.length;i++){
            if(compras[i]>10){
                System.out.println("Se aplica el %10 de descuento a "+clientes[i]);
            }
        }
    }
}
