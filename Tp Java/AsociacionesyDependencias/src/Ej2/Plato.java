package Ej2;

import java.util.ArrayList;

public class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean bebida;
    private ArrayList<Ingrediente> ingredientes=new ArrayList<>();
    //Constructor vacio:

    public Plato() {
    }
    //Constructor  Parcialmente Cargado:

    public Plato(String nombreCompleto, double precio, boolean bebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.bebida = bebida;
    }

    //Getters:

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public boolean isBebida() {
        return bebida;
    }

    public double getPrecio() {
        return precio;
    }
    //Setters:

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setBebida(boolean bebida) {
        this.bebida = bebida;
    }
    //Metodo para agregar ingrediente:
    public void agregarIngrediente(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
        System.out.println("* Se agregó el ingrediente con exitó");
    }
    //Metodo para mostrar informacion del plato:
    public  void mostrarInformacion(){
        System.out.println("Nombre:"+this.nombreCompleto);
        System.out.println("Precio:"+this.precio);
        System.out.println("Es bebida? "+this.bebida);
        System.out.println("---Ingredientes---\n");
        if (this.ingredientes.isEmpty()){
            System.out.println("* No hay Ingredientes");
        }else{
            for(Ingrediente ingrediente:this.ingredientes){
                System.out.println("Ingrediente "+(this.ingredientes.indexOf(ingrediente)+1));
                ingrediente.mostrarInformacion();
                System.out.println("------------------------------------------");
            }
            System.out.println(" ");
        }
    }
}
