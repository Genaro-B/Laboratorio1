package Ej1;


import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private long lejago;
    private ArrayList<Nota>notas=new ArrayList<>();
    //Constructor vacio:
    public Alumno() {
    }
    //Constructor Parcialmente cargado:
    public Alumno(long lejago, String nombreCompleto) {
        this.lejago = lejago;
        this.nombreCompleto = nombreCompleto;
    }
    //Metodo para agregar una nota a la lista notas:
    public void agregarNota(Nota nota){
        this.notas.add(nota);
        System.out.println("<----La nota fue cargada de forma exitosa---->");
    }
    //Getters:


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public long getLejago() {
        return lejago;
    }
    //Setters:

    public void setLejago(long lejago) {
        this.lejago = lejago;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    //Metodo para calcular Promedio:
    public  float calcularPromedio(){
        int promedio=0;
        for(Nota n:this.notas){
            promedio+=n.getNotaExamen();
        }
        return promedio/(this.notas.size());
    }
    //Metodo para mostrar la informacion del Alumno:
    public void mostrarInformacion(){
        System.out.println("\n\n---Alumno---\n");
        System.out.println("Nombre:"+this.nombreCompleto);
        System.out.println("Legajo:"+this.lejago);
        System.out.println("---Notas---");
        for(Nota nota:this.notas){
            nota.mostrarinformacion();
            System.out.println("--------------------");
        }
        System.out.println("Promedio final:"+calcularPromedio());
    }
}
