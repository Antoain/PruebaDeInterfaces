/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServiciosInterfaz;

/**
 *
 * @author offic
 */
public interface Ivehiculo <T>{
    T arrancar();
    T detener();
    
    public class Coche implements Ivehiculo<String> {
    @Override
    public String arrancar() {
        return "El coche arranca.";
        }

    @Override
    public String detener() {
        return "El coche se detiene";
        }
    }
    
    
    public class Bicicleta implements Ivehiculo<String> {
    @Override
    public String arrancar() {
        return "La bicicleta empieza a moverse y realiza un 360 doble mortal en el eje z.";
    }

    @Override
    public String detener() {
        return "La bicicleta se detiene.";
    }
}


}
