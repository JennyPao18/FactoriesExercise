package TiposNotificaciones;

import Fabricas.NotificacionRelevancia;

public class UrgenteNotificacion implements NotificacionRelevancia {
    @Override
    public void mostrarRelevancia(String mensaje) {
        System.out.println("¡Está notificación es urgente!");
        System.out.println(mensaje);
    }
}
