package Ej3;

import java.util.ArrayList;

public class Notificaciones {
    private ArrayList<CanalNotificacion> canales;

    public Notificaciones() {
        this.canales = new ArrayList<>();
    }

    // Agregar un canal de notificación
    public void agregarCanal(CanalNotificacion canal) {
        canales.add(canal);
    }

    // Enviar notificaciones a todos los canales
    public void enviarNotificaciones() {
        for (CanalNotificacion canal : canales) {
            canal.enviarNotificacion();
        }
    }

    // Personalizar mensajes de todos los canales
    public void personalizarMensajes(String nuevoMensaje) {
        for (CanalNotificacion canal : canales) {
            if (canal instanceof Personalizable) {
                ((Personalizable) canal).personalizarMensaje(nuevoMensaje);
            }
        }
    }

    // Mostrar información de todos los canales
    public void mostrarInformacionCanales() {
        for (CanalNotificacion canal : canales) {
            System.out.println("Usuario: " + canal.usuario);
            System.out.println("Mensaje: " + canal.mensaje);
        }
    }
}
