package Ej3;

public class Ej3 {
    public static void main(String[] args){
        String clientes[]={"Juan","raul","Agustin","Alexander"};
        int facturasPendientes[]={600,340,584,100};
        imprimirFacturas(clientes,facturasPendientes);
    }
    public static void imprimirFacturas(String[] clientes,int[] facturasPendientes){
        System.out.println("Clientes con facturas mayores a $500:");
        for (int i=0;i<facturasPendientes.length;i++){
            if(facturasPendientes[i]>500){
                System.out.println("Nombre:"+clientes[i]);
            }
        }
    }
}
