package TiposNotificaciones;

import Fabricas.Notificacion;

public class AppNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje){
        System.out.println("¡Hola! Tienes un nuevo mensaje.");
        System.out.println(mensaje);
    }
}
