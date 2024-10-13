package Ej1;

import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        /*
         Enunciado:Ejercicio 1: Generador de Horóscopo
         Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
         imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.
         */

        //Creamos una instancia de Scanner que permita leer los datos:

        Scanner leer =new Scanner(System.in);

        //Declaramos las variables a usar:
        int dia;
        int mes;
        int anio;
        System.out.println("-------Datos sobre la fecha de nacimiento------");
        System.out.print("Ingrese el día:");
        dia=leer.nextInt();//Leemos el dia de nacimiento.
        System.out.print("Ingrese el mes:");
        mes=leer.nextInt();//Leemos el mes de nacimiento.
        System.out.print("Ingrese el anio:");
        anio=leer.nextInt();//Leemos el año de nacimiento(Aunque este no se usa para determinar el signo del zodiaco).

        //Determinamos el signo al que corresponde:
        System.out.println("-----Resultadoo-----");
        System.out.print("Tu signo del zodiaco es:");
        if((mes==1 && dia>=20)||(mes==2 && dia<=18)){
            System.out.println("Acuario");
            System.out.println("Mensaje:Hoy es un buen día para ser creativo.");
        }else{
            if((mes==2 && dia>=19)||(mes==3 && dia<=20)){
                System.out.println("Piscis");
                System.out.println("Mensaje:Conectate con tus emociones");
            }else{
                if((mes==3 && dia>=21)||(mes==4 && dia<=19)){
                    System.out.println("Aries");
                    System.out.println("Mensaje:Hoy es un buen día para comenzar nuevos proyectos");
                }else{
                    if((mes==4 && dia>=20)|| (mes==5 && dia<=20)){
                        System.out.println("Tauro");
                        System.out.println("Mensaje:La paciencia sera tu mejor aliada el día de hoy");
                    }else{
                        if((mes==5 && dia>=21)|| (mes==6 && dia<=20)){
                            System.out.println("Geminis");
                            System.out.println("Mensaje:Comunica tus ideas! seras escuchado! ");
                        }else {
                            if((mes==6 && dia>=21)||(mes==7 && dia<=22)){
                                System.out.println("Cáncer");
                                System.out.println("Mensaje:Cuida tus emociones son Importantes!");
                            }else{
                                if((mes==7 && dia>=23)||(mes==8 && dia<=22)){
                                    System.out.println("Leo");
                                    System.out.println("Mensaje:Tu carisma brillará, aprovecha para socializar.");
                                }else{
                                    if((mes==8 && dia>=23)||(mes==9 && dia<=22)){
                                        System.out.println("Virgo");
                                        System.out.println("Mensaje:Presta atención a los detalles hoy.");
                                    }else{
                                        if((mes==9 && dia>=23)||(mes==10 && dia<=22)) {
                                            System.out.println("Libra");
                                            System.out.println("Mensaje:Busca el equilibrio en tus relaciones.");
                                        }else{
                                            if((mes==10 && dia>=23)||(mes==11 && dia<=21)){
                                                System.out.println("Escorpio");
                                                System.out.println("Mensaje:Tu pasión puede abrir nuevas puertas.");
                                            }else {
                                                if((mes==11 && dia>=22)||(mes==12 && dia<=21)){
                                                    System.out.println("Sagitario");
                                                    System.out.println("Mensaje:");
                                                }else{
                                                    System.out.println("Capricornio");
                                                    System.out.println("Mensaje:");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


    }
}
