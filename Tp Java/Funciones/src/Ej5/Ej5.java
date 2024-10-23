package Ej5;

public class Ej5 {
    public static void main(String[] args){
        //Crear array con las puntuaciones de sastifaccion de los clientes:
        int[] calificaciones={1,4,2,4,5,5};
        System.out.println("El promedio de satisfacción es:"+calcularPromedioSastifaccion(calificaciones));
    }
    public static float calcularPromedioSastifaccion(int[] calificaciones){
        float promedio = 0;
        for(int i=0;i<calificaciones.length;i++){
            promedio+=calificaciones[i];
        }
        promedio/=calificaciones.length;
        return promedio;
    }
}
