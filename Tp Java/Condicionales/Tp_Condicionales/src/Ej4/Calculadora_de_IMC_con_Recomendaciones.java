package Ej4;


import java.util.Scanner;

public class Calculadora_de_IMC_con_Recomendaciones {
    public static void main (String[] args){
        //Creamos una Instancia de Scanner para leer los datos:
        Scanner leer =new Scanner(System.in);
        //Declaramos las variables a usar:
        int peso;
        float altura;
        float indiceMasaCorporal;
        System.out.println("---Bienvenido al programa---");
        //Solicitamos los datos:
        System.out.print("Ingrese su peso (en kg):");
        peso=leer.nextInt();
        System.out.print("Ingrese su altura: (en metros):");
        altura=leer.nextFloat();
        //Calcular Indice de Masa Corporal:
        indiceMasaCorporal= (float) (peso/(Math.pow(altura,2)));
        //Mostramos el Indice de Masa Corporal:
        System.out.println("Indice de Masa Corporal:"+indiceMasaCorporal);
        System.out.println("---Resultado---");
        //Determinar el mensaje a mostrar en base al indice:
        if(indiceMasaCorporal<18.5){
            System.out.println("Bajo Peso");
        }else{
            if(indiceMasaCorporal>=18.5 && indiceMasaCorporal<=24.9){
                System.out.println("Peso normal");
            }else{
                if(indiceMasaCorporal>=25 && indiceMasaCorporal<=29.9){
                    System.out.println("Sobre Peso");
                }else{
                    System.out.println("Obesidad");
                }
            }
        }

    }
}
