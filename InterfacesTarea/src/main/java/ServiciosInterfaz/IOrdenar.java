/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServiciosInterfaz;
import java.util.Collections;
import java.util.List;

public interface IOrdenar <T> {
    void ordenar(List<T> elementos);
        
    public class ListaNumeros implements IOrdenar<Integer> {
     
    @Override
    public void ordenar(List<Integer> elementos) {
        Collections.sort(elementos);
        System.out.println("Lista ordenada: " + elementos);
        }
    }
}
