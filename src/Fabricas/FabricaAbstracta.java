package Fabricas;

/*
FABRICA ABSTRACTA
Esta interfaz se encarga de manejar las sub-fabricas: Notificacion y NotificacionRelevancia
*/

import Excepciones.NotificacionInexistente;

public interface FabricaAbstracta {
    Notificacion crearNotificacion(String tipo) throws NotificacionInexistente;
    NotificacionRelevancia verRelevancia(String relevancia) throws NotificacionInexistente;
}
