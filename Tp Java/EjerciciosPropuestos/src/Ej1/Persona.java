package Ej1;

public class Persona {
    private String nombre;
    private String apellido;
    private int numeroDocumentoIdentidad;
    private int anioNacimiento;
    private String paisNacimiento;
    private char genero;
    //Constructor vacio:
    public Persona() {
    }
    //Constructor sobreCargado:
    public Persona(String nombre, String apellido, int numeroDocumentoIdentidad, int anioNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }
    //Getters:

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    //Setters:

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroDocumentoIdentidad(int numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
    //Metodo para mostrar Informacion:
    public void imprimirInformacion(){
        System.out.println("---Informacion de la persona---\n\n");
        System.out.println("Nombre:"+this.nombre);
        System.out.println("Apellido:"+this.apellido);
        System.out.println("Año de Nacimiento:"+this.anioNacimiento);
        System.out.println("Pais de Nacimiento:"+this.paisNacimiento);
        System.out.println("Genero:"+this.genero);
    }
}
