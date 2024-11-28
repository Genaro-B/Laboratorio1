package Ej3;

import java.util.Scanner;

public class Facturacion {
    // Array de artículos: código, nombre, precio
    static Object[][] articulos = {
            {"101", "Leche", 25.0},
            {"102", "Gaseosa", 30.0},
            {"103", "Fideos", 15.0},
            {"104", "Arroz", 28.0},
            {"105", "Vino", 120.0},
            {"106", "Manteca", 20.0},
            {"107", "Lavandina", 18.0},
            {"108", "Detergente", 46.0},
            {"109", "Jabón en Polvo", 96.0},
            {"110", "Galletas", 60.0}
    };

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        // Crear una instancia de Factura
        Factura factura = new Factura();

        // Solicitar datos de la factura
        System.out.print("Ingrese la fecha de la factura: ");
        factura.setFechaFactura(sc.nextLine());

        long numeroFactura;
        do {
            System.out.print("Ingrese el número de la factura (número entero mayor a cero): ");
            while (!sc.hasNextLong()) {
                System.out.println("Por favor, ingrese un número válido.");
                sc.next();
            }
            numeroFactura = sc.nextLong();
        } while (numeroFactura <= 0);
        factura.setNumeroFactura(numeroFactura);

        sc.nextLine(); // Limpiar el buffer
        String cliente;
        do {
            System.out.print("Ingrese el nombre del cliente: ");
            cliente = sc.nextLine();
        } while (cliente.isEmpty());
        factura.setCliente(cliente);

        // Bucle para agregar artículos
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese el código del artículo a facturar: ");
            String codigoArticulo = sc.nextLine();

            // Buscar el artículo en el array
            int index = -1;
            for (int i = 0; i < articulos.length; i++) {
                if (articulos[i][0].equals(codigoArticulo)) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("El código ingresado no existe, intente nuevamente.");
                continue;
            }

            // Solicitar cantidad
            System.out.print("Ingrese la cantidad a facturar: ");
            int cantidad = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            // Crear el objeto DetalleFactura y agregarlo
            DetalleFactura detalle = new DetalleFactura(
                    (String) articulos[index][0],
                    (String) articulos[index][1],
                    cantidad,
                    (double) articulos[index][2]
            );
            factura.getDetallesFactura().add(detalle);

            // Preguntar si continuar agregando artículos
            System.out.print("¿Desea continuar agregando artículos? (sí/no): ");
            String respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("no")) {
                continuar = false;
            }
        }

        // Calcular el total de la factura
        factura.calcularMontoTotal();

        // Imprimir la factura
        factura.imprimirFactura();
    }

}
