
package ServiciosInterfaz;


public interface IDescontar <T> {
    
    T calcularDescuento(T precio);
    
    
    public class DescuentoPorcentaje implements IDescontar<Double> {
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public Double calcularDescuento(Double precio) {
        return precio * (porcentaje / 100);
        }
    }
    
    
    public class DescuentoFijo implements IDescontar<Double> {
    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public Double calcularDescuento(Double precio) {
        return montoFijo;
    }
}

    
}
