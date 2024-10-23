package Ej6;

public class Ej6 {
    public static void main(String[] args){
        int[] facturas={46,78,400,231};
        calcularImpuesto(facturas);
    }
    public static void calcularImpuesto(int[] facturas){
        float impuesto=0;
        System.out.println("-Impuestos con el un %21 de descuento:");
        for(int i=0;i<facturas.length;i++){
            impuesto=facturas[i]-(21*facturas[i]/100f);
            System.out.println("La factura "+(i+1)+" ("+facturas[i]+") con descuento del %21:"+impuesto);
        }
    }
}
