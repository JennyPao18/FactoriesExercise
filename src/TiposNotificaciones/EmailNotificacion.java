package TiposNotificaciones;

import Fabricas.Notificacion;

public class EmailNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje){
        System.out.println("Este es un ejemplo de correo electrónico");
        System.out.println(mensaje);
    }
}
