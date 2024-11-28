package Ej1;

public class Nota {
    private String catedra;
    private double notaExamen;
    //Constructor vacio:

    public Nota() {
    }
    //Constructor Sobrecargado:

    public Nota(double notaExamen, String catedra) {
        this.notaExamen = notaExamen;
        this.catedra = catedra;
    }
    //Getters:

    public double getNotaExamen() {
        return notaExamen;
    }

    public String getCatedra() {
        return catedra;
    }
    //Setters:

    public void setNotaExamen(double notaExamen) {
        this.notaExamen = notaExamen;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }
    //Metodo para mostrar informacion de nota:
    public void mostrarinformacion(){
        System.out.println("Catedra:"+this.catedra);
        System.out.println("Nota:"+this.notaExamen);
    }
}
