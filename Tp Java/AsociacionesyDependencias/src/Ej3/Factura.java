package Ej3;

import java.util.ArrayList;

public class Factura {
    private String fechaFactura;
    private long numeroFactura;
    private double totalCalculadoFactura;
    private String cliente;
    private ArrayList<DetalleFactura> detallesFactura;

    // Constructor
    public Factura() {
        detallesFactura = new ArrayList<>();
    }

    // Métodos get/set
    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getTotalCalculadoFactura() {
        return totalCalculadoFactura;
    }

    public void setTotalCalculadoFactura(double totalCalculadoFactura) {
        this.totalCalculadoFactura = totalCalculadoFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<DetalleFactura> getDetallesFactura() {
        return detallesFactura;
    }

    public void setDetallesFactura(ArrayList<DetalleFactura> detallesFactura) {
        this.detallesFactura = detallesFactura;
    }

    // Método para calcular el total de la factura
    public void calcularMontoTotal() {
        totalCalculadoFactura = 0;
        for (DetalleFactura detalle : detallesFactura) {
            totalCalculadoFactura += detalle.getSubtotal();
        }
    }

    // Método para imprimir la factura
    public void imprimirFactura() {
        System.out.println("Fecha: " + fechaFactura);
        System.out.println("Numero: " + numeroFactura);
        System.out.println("Cliente: " + cliente);
        System.out.println("Código Articulo  Nombre Articulo   Cantidad  Precio Unitario   Descuento  Subtotal");
        for (DetalleFactura detalle : detallesFactura) {
            detalle.imprimirDetalle();
        }
        System.out.println("Total: " + totalCalculadoFactura);
    }
}
