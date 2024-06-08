import Excepciones.NotificacionInexistente;
import Fabricas.FabricaAbstracta;
import Fabricas.Notificacion;
import Fabricas.NotificacionRelevancia;
import TiposNotificaciones.RegularNotificacion;
import TiposNotificaciones.UrgenteNotificacion;

/*
SUB-FÁBRICA NOTIFICACION RELEVANCIA FACTORY
Está subfabrica se utiliza para mostrar el tipo de relevancia, segun lo especificado por el usuario
*/

public class NotificacionRelevanciaFactory implements FabricaAbstracta {
    public Notificacion crearNotificacion(String tipo){
        return null;
    }

    public NotificacionRelevancia verRelevancia(String relevancia) throws NotificacionInexistente{
        if (relevancia.equals("URGENTE")){
            return new UrgenteNotificacion();
        } else if (relevancia.equals("REGULAR")){
            return new RegularNotificacion();
        }
        throw new NotificacionInexistente("Tipo de notificación no válido: " + relevancia);
    }
}
