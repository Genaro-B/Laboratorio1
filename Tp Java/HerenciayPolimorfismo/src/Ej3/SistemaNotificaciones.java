package Ej3;

public class SistemaNotificaciones{
    public static void main(String[] args) {
        // Crear los canales de notificación
        CorreoElectronico correo = new CorreoElectronico("Juan Perez", "Este es un correo de prueba.", "juanperez@example.com");
        MensajeTexto mensajeTexto = new MensajeTexto("Maria Lopez", "Este es un mensaje de texto de prueba.", "123-456-7890");

        // Crear el sistema de notificaciones
        Notificaciones notificaciones = new Notificaciones();

        // Agregar canales al sistema
        notificaciones.agregarCanal(correo);
        notificaciones.agregarCanal(mensajeTexto);

        // Mostrar la información de los canales
        System.out.println("Información de los canales antes de personalizar:");
        notificaciones.mostrarInformacionCanales();

        // Personalizar los mensajes
        System.out.println("\nPersonalizando los mensajes...");
        notificaciones.personalizarMensajes("Nuevo mensaje personalizado.");

        // Mostrar la información de los canales después de personalizar
        System.out.println("\nInformación de los canales después de personalizar:");
        notificaciones.mostrarInformacionCanales();

        // Enviar las notificaciones
        System.out.println("\nEnviando notificaciones...");
        notificaciones.enviarNotificaciones();
    }

}
