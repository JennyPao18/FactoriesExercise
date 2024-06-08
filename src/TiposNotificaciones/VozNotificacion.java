package TiposNotificaciones;

import Fabricas.Notificacion;

public class VozNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje){
        System.out.println("Este es un ejemplo de mensaje de voz");
        System.out.println(mensaje);
    }
}
