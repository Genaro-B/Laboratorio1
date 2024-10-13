package Ej5;

import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args){
        //Creamos una Instancia Scanner para leer los datos:
        Scanner leer =new Scanner(System.in);
        //Creamos una Instancia Random para generar un aleatorio:
        Random random=new Random();
        //Declaramos las variables a usar:
        int aleatorio = random.nextInt(3)+1;
        String maquina="";
        String usuario="";
        //Determinar el valor de maquina y guardarlo en la variable correspondiente:
        if(aleatorio==1){
            maquina="papel";
        }else{
            if(aleatorio==2){
                maquina="piedra";
            }else {
                maquina="tijera";
            }
        }
        //Solicitar Datos:
        System.out.println("Menú:");
        System.out.println("1)Papel 2)Piedra 3)Tijera");
        usuario=leer.next().toLowerCase();

        //Mostrar Elecciones:
        System.out.println("Maquina:"+maquina);
        System.out.println("Usuario:"+usuario);
        // Determinar el resultado:
        System.out.println("--Resultado--");
        if(usuario.equalsIgnoreCase(maquina)){
            System.out.println("Empate.");
        }else {
            if ((usuario.equals("piedra") && maquina.equals("tijera")) || (usuario.equals("papel") && maquina.equals("piedra")) || (usuario.equals("tijera") && maquina.equals("papel"))) {
                System.out.println("¡Ganaste!");
            }else{
                if (usuario.equals("piedra") ||usuario.equals("papel") || usuario.equals("tijera")){
                    System.out.println("¡Perdiste!");
                }else{
                    System.out.println("Opción no válida. Por favor, elige piedra, papel o tijera.");
                }
            }

        }
    }
}
