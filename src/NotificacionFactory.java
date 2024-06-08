import Excepciones.NotificacionInexistente;
import Fabricas.FabricaAbstracta;
import Fabricas.Notificacion;
import Fabricas.NotificacionRelevancia;
import TiposNotificaciones.*;

/*
SUB-FÁBRICA NOTIFICACION FACTORY
Está subfabrica se utiliza para mostrar el tipo de notificacion, segun lo especificado por el usuario
*/

public class NotificacionFactory implements FabricaAbstracta {
    public Notificacion crearNotificacion(String tipo) throws NotificacionInexistente {
        if (tipo.equals("APP")){
            return new AppNotificacion();
        } else if (tipo.equals("EMAIL")){
            return new EmailNotificacion();
        } else if (tipo.equals("SMS")){
            return new SMSNotificacion();
        } else if (tipo.equals("FAX")){
            return new FaxNotificacion();
        } else if (tipo.equals("VOZ")){
            return new VozNotificacion();
        }
        throw new NotificacionInexistente("Tipo de notificación no válido: " + tipo);
    }

    public NotificacionRelevancia verRelevancia(String relevancia){
        return null;
    }
}
