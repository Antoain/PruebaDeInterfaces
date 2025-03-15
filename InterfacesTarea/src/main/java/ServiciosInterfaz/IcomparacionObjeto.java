
package ServiciosInterfaz;


public interface IcomparacionObjeto <T> {
    int comparar(T otro);
    
    
    public class Producto implements IcomparacionObjeto<Producto> {
    private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int comparar(Producto otro) {
        return Double.compare(this.precio, otro.precio);
    }

    @Override
    public String toString() {
        return "Producto con precio: $" + precio;
    }
}
    
}
