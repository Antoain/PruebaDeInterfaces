
package ServiciosInterfaz;


public interface ITrabajador <T> {
    T trabajar();
    
    public class Desarrollador implements ITrabajador<String> {
    @Override
    public String trabajar() {
        return "El desarrollador esta escribiendo codigo para el GTA 6.";
        }
    }
    
    public class Diseñador implements ITrabajador<String> {
    @Override
    public String trabajar() {
        return "El diseñador esta creando el mundo de GTA 6.";
        }
    }
    

}
