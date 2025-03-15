
package ServiciosInterfaz;


public interface INotificacion <T> {
    
    T enviarNotificacion();
    
    public class CorreoElectronico implements INotificacion<String> {
    @Override
    public String enviarNotificacion() {
        return "hey bro, tu tiene una notificacion de correo electronico.";
        }
    }
    
    public class SMS implements INotificacion<String> {
    @Override
    public String enviarNotificacion() {
        return "hey bro, tu tiene una notificacion de SMS.";
    }
}
    
}
