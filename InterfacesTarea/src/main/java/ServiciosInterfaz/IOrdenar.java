
package ServiciosInterfaz;
import java.util.Collections;
import java.util.List;

public interface IOrdenar <T> {
    public void ordenar(List<T> elementos);
        
    public class ListaNumeros implements IOrdenar<Integer> {
     
    @Override
    public void ordenar(List<Integer> elementos) {
        Collections.sort(elementos);
        System.out.println("Lista ordenada: " + elementos);
        }
    }
}
