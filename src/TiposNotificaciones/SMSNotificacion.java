package TiposNotificaciones;

import Fabricas.Notificacion;

public class SMSNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje){
        System.out.println("Este es un ejemplo de mensaje SMS");
        System.out.println(mensaje);
    }
}
