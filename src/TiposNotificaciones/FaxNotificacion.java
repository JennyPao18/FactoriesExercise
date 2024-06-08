package TiposNotificaciones;

import Fabricas.Notificacion;

public class FaxNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje){
        System.out.println("Este es un ejemplo de notificación por fax");
        System.out.println(mensaje);
    }
}
