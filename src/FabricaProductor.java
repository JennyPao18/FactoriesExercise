import Fabricas.FabricaAbstracta;

/*
FABRICA PRODUCTOR
Gracias a esta clase, el usuario podrá elegir que fabrica va a utilizar;
la fabrica de notificaciones o la de relevancias
*/

public class FabricaProductor {
    public static FabricaAbstracta elegirFabrica(String tipoFabrica){
        if (tipoFabrica.equals("NOTIFICACION")){
            return new NotificacionFactory();
        } else if (tipoFabrica.equals("RELEVANCIA")){
            return new NotificacionRelevanciaFactory();
        }
        return null;
    }
}
