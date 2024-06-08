import Excepciones.NotificacionInexistente;
import Fabricas.FabricaAbstracta;
import Fabricas.Notificacion;
import Fabricas.NotificacionRelevancia;

public class Main {
    public static void main(String[] args) throws NotificacionInexistente {
        /*FACTORY METHOD (Una fábrica)*/
        System.out.println("--- Factory Method ---");

        /*Especificar el tipo de notificacion que se enviará con una variable*/
            String tipoNotificacion = "APP";
            //String tipoNotificacion = "EMAIL";
            //String tipoNotificacion = "FAX";
            //String tipoNotificacion = "SMS";
            //String tipoNotificacion = "VOZ";
            //String tipoNotificacion = "NOEXIST";

        //Crear una instancia de la clase de fabrica
        NotificacionFactory fabrica = new NotificacionFactory();
        try{
            //Crear la notificación y especificar el mensaje
            Notificacion notificacion1 = fabrica.crearNotificacion(tipoNotificacion);
            notificacion1.enviarMensaje("¡Notificación enviada exitosamente!");

        } catch (NotificacionInexistente e){
            //Excepción
            System.out.println(e.getMessage());
        }


        //-------------------------------------------------------------------------------------
        /*ABSTRACT FACTORY (Fábrica de fabricas) */
        System.out.println();
        System.out.println();
        System.out.println("--- Abstract Factory ---");

        //Instanciar la primer fabrica
        FabricaAbstracta fabricaNotificacion = FabricaProductor.elegirFabrica("NOTIFICACION");

        /*Especificar el tipo de notificacion que se enviará con una variable*/
            String noti = "APP";
            //String noti = "EMAIL";
            //String noti = "FAX";
            //String noti = "SMS";
            //String noti = "VOZ";
            //String noti = "NOEXIST";

        //Crear la notificación y especificar el mensaje
        Notificacion notificacion2 = fabricaNotificacion.crearNotificacion(noti);
        notificacion2.enviarMensaje("¡Notificación enviada exitosamente!");

        System.out.println();

        //Instanciar la segunda fabrica
        FabricaAbstracta fabricaRelevancia = FabricaProductor.elegirFabrica("RELEVANCIA");

        /*Especificar la relevancia de la notificacion que se enviará con una variable*/
            String rele = "URGENTE";
            //String rele = "REGULAR";

        //Crear la relevancia y especificar el mensaje
        NotificacionRelevancia relevanciaNoti = fabricaRelevancia.verRelevancia(rele);
        relevanciaNoti.mostrarRelevancia("Se ha informado la relevancia del mensaje");
    }
}