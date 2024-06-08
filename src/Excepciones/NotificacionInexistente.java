package Excepciones;
/*
EXCEPCION
Esta clase se encargará de mostrar un mensaje de error cuando el usuario
ingrese un valor no válido a la hora de generar notificaciones.
*/


public class NotificacionInexistente extends Exception{
    public NotificacionInexistente (String mensaje){
        super(mensaje);
    }
}
