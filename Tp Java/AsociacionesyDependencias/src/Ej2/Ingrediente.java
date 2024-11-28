package Ej2;

public class Ingrediente {
    private String nombre;
    private double cantidad;
    private String unidadMedida;
    //Constructor vacio:
    public Ingrediente() {
    }
    //Constructor Sobrecargado:
    public Ingrediente(double cantidad, String nombre, String unidadMedida) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
    }
    //Getters:
    public double getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }
    //Setters:

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    //Metodo para mostrar la informacion del ingrediente:
    public void mostrarInformacion(){
        System.out.println("Nombre:"+this.nombre);
        System.out.println("Cantidad:"+this.cantidad);
        System.out.println("Undidad de Medidad:"+this.unidadMedida);
    }
}
