
package ServiciosInterfaz;


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
