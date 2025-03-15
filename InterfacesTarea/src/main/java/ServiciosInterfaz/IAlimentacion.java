
package ServiciosInterfaz;


public interface IAlimentacion <T>{
    
    T comer();
    
    public class Persona implements IAlimentacion<String> {
    @Override
    public String comer() {
        return "La persona se atraganta xdd";
        }
    }
    
    public class Animal implements IAlimentacion<String> {
    @Override
    public String comer() {
        return "El animal come y gomita D:.";
        }
    }
}
