package TiposNotificaciones;

import Fabricas.NotificacionRelevancia;

public class RegularNotificacion implements NotificacionRelevancia {
    @Override
    public void mostrarRelevancia(String mensaje) {
        System.out.println("Esta notificación no es urgente");
        System.out.println(mensaje);
    }
}
