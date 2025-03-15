/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServiciosInterfaz;

/**
 *
 * @author offic
 */
public interface IAnimal <T>{
    T hacerSonido();
    T mover();
    
    public class Perro implements IAnimal<String> {
    @Override
    public String hacerSonido() {
        return "El perro ladra";
        }

    @Override
    public String mover() {
        return "El perro esta corriendo.";
        }
    }
    public class Gato implements IAnimal<String> {
    @Override
    public String hacerSonido() {
        return "El gato ronronea";
        }

    @Override
    public String mover() {
        return "El gato esta saltando.";
        }
    }

    
}