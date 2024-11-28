package Ej3;

public abstract class CanalNotificacion {
    protected String usuario;
    protected String mensaje;

    // Constructor para inicializar los atributos
    public CanalNotificacion(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    // Método abstracto para enviar la notificación
    public abstract void enviarNotificacion();
}
