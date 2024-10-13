package Ej4;

import java.util.Scanner;

public class Lista_Reproduccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario su estado de ánimo
        System.out.println("¿Cuál es tu estado de ánimo? (feliz, triste, enérgico, relajado)");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        // Generar lista de reproducción según el estado de ánimo
        switch (estadoAnimo) {
            case "feliz":
                System.out.println("Lista de reproducción para 'feliz':");
                System.out.println("1. Happy - Pharrell Williams");
                System.out.println("2. Walking on Sunshine - Katrina and the Waves");
                System.out.println("3. Don't Worry Be Happy - Bobby McFerrin");
                break;

            case "triste":
                System.out.println("Lista de reproducción para 'triste':");
                System.out.println("1. Someone Like You - Adele");
                System.out.println("2. The Night We Met - Lord Huron");
                System.out.println("3. Fix You - Coldplay");
                break;

            case "enérgico":
                System.out.println("Lista de reproducción para 'enérgico':");
                System.out.println("1. Eye of the Tiger - Survivor");
                System.out.println("2. Can’t Stop the Feeling! - Justin Timberlake");
                System.out.println("3. Levels - Avicii");
                break;

            case "relajado":
                System.out.println("Lista de reproducción para 'relajado':");
                System.out.println("1. Weightless - Marconi Union");
                System.out.println("2. Clair de Lune - Claude Debussy");
                System.out.println("3. Sunsets - Sorrow");
                break;

            default:
                System.out.println("Estado de ánimo no reconocido. Por favor elige entre 'feliz', 'triste', 'enérgico' o 'relajado'.");
        }

        scanner.close();
    }
}
