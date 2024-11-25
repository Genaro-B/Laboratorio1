package Ej2;

public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private float densidad;
    private long masa;
    private float volumen;
    private  int diametro;
    private long distanciaSol;
    private boolean observable;
    private boolean planetaExterior;
    private int periodoOrbitalAnios;
    private  int periodoOrbitalDias;
    //Constructor Vacio:
    public Planeta() {
    }
    //Constructor SobreCargado:

    public Planeta(String nombre, int cantidadSatelites, float densidad,long masa, float volumen,long distanciaSol, boolean observable, int diametro, boolean planetaExterior, int periodoOrbitalAnios, int periodoOrbitalDias) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.densidad = densidad;
        this.masa = masa;
        this.volumen = volumen;
        this.distanciaSol = distanciaSol;
        this.observable = observable;
        this.diametro = diametro;
        this.planetaExterior = planetaExterior;
        this.periodoOrbitalAnios = periodoOrbitalAnios;
        this.periodoOrbitalDias = periodoOrbitalDias;
    }

    //Getters:

    public String getNombre() {
        return nombre;
    }

    public int getCantidadSatelites() {
        return cantidadSatelites;
    }

    public float getDensidad() {
        return densidad;
    }

    public double getMasa() {
        return masa;
    }

    public float getVolumen() {
        return volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public float getDistanciaSol() {
        return distanciaSol;
    }

    public int getPeriodoOrbitalAnios() {
        return periodoOrbitalAnios;
    }

    public boolean isPlanetaExterior() {
        return planetaExterior;
    }

    public boolean isObservable() {
        return observable;
    }

    public int getPeriodoOrbitalDias() {
        return periodoOrbitalDias;
    }
    //Setters:

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadSatelites(int cantidadSatelites) {
        this.cantidadSatelites = cantidadSatelites;
    }

    public void setDensidad(float densidad) {
        this.densidad = densidad;
    }

    public void setMasa(long masa) {
        this.masa = masa;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    public void setPlanetaExterior(boolean planetaExterior) {
        this.planetaExterior = planetaExterior;
    }

    public void setDistanciaSol(long distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public void setPeriodoOrbitalAnios(int periodoOrbitalAnios) {
        this.periodoOrbitalAnios = periodoOrbitalAnios;
    }

    public void setPeriodoOrbitalDias(int periodoOrbitalDias) {
        this.periodoOrbitalDias = periodoOrbitalDias;
    }
    //Metodo para imprimir la informacion:
    public void imprimirInformacion(){
        System.out.println("---Planeta---");
        System.out.println("Nombre:"+this.nombre);
        System.out.println("Densidad:"+this.densidad);
        System.out.println("Masa:"+this.masa);
        System.out.println("Volumen:"+this.volumen);
        System.out.println("Distancia al sol:"+this.distanciaSol);
        System.out.println("Es observable?  "+this.observable);
        System.out.println("Es un planeta exterior?  "+this.planetaExterior);
        System.out.println("Periodo orvital en años:"+this.periodoOrbitalAnios);
        System.out.println("Periodo orvital en dias:"+this.periodoOrbitalDias);
    }
}
