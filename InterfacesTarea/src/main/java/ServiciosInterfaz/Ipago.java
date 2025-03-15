/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServiciosInterfaz;

/**
 *
 * @author offic
 */
public interface Ipago <T>{
    
    T procesarPago(T cantidad);
    
    public class PagoConEfectivo implements Ipago<Double> {
    @Override
    public Double procesarPago(Double cantidad) {
        System.out.println("Procesando pago en efectivo por la cantidad de: $" + cantidad);
        return cantidad;
        }
    }
    
    public class PagoConTarjeta implements Ipago<Double> {
    @Override
    public Double procesarPago(Double cantidad) {
        System.out.println("Procesando pago con tarjeta por la cantidad de: $" + cantidad);
        return cantidad;
    }
}


    
    
    


}
