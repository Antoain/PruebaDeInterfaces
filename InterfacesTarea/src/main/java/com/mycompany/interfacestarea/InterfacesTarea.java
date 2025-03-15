
package com.mycompany.interfacestarea;
import ServiciosInterfaz.IAnimal;
import ServiciosInterfaz.IAnimal.Gato;
import ServiciosInterfaz.IAnimal.Perro;
import ServiciosInterfaz.IFigGeometrica;
import ServiciosInterfaz.IFigGeometrica.Circulo;
import ServiciosInterfaz.IFigGeometrica.Rectangulo;
import ServiciosInterfaz.Ipago;
import ServiciosInterfaz.Ipago.PagoConEfectivo;
import ServiciosInterfaz.Ipago.PagoConTarjeta;
import ServiciosInterfaz.Ivehiculo;
import ServiciosInterfaz.Ivehiculo.Bicicleta;
import ServiciosInterfaz.Ivehiculo.Coche;

public class InterfacesTarea {

    // Método para probar IAnimal
    public static void Animal() {
        IAnimal<String> perro = new Perro();
        System.out.println(perro.hacerSonido());
        System.out.println(perro.mover());

        IAnimal<String> gato = new Gato();
        System.out.println(gato.hacerSonido());
        System.out.println(gato.mover());
    }
    
    
    // Método para probar IVehiculo
    public static void Vehiculo() {
        Ivehiculo<String> coche = new Coche();
        System.out.println(coche.arrancar());
        System.out.println(coche.detener());

        Ivehiculo<String> bicicleta = new Bicicleta();
        System.out.println(bicicleta.arrancar());
        System.out.println(bicicleta.detener());
    }
    
    // Metodo para probar Ipago
    public static void pago() {
        // Pago en efectivo
        Ipago<Double> pagoEfectivo = new PagoConEfectivo();
        Double cantidadEfectivo = pagoEfectivo.procesarPago(200.00);
        System.out.println("Pago procesado en efectivo: $" + cantidadEfectivo);

        // Pago con tarjeta
        Ipago<Double> pagoTarjeta = new PagoConTarjeta();
        Double cantidadTarjeta = pagoTarjeta.procesarPago(150.75);
        System.out.println("Pago procesado con tarjeta: $" + cantidadTarjeta);
        
    }
    
    //Metodo para probar IFigGeometrica
    public static void FigGeometrica() {
        // Prueba con un círculo
        IFigGeometrica<Double> circulo = new Circulo(5.0);
        System.out.println("Círculo:");
        System.out.println("Área: " + circulo.area());
        System.out.println("Perímetro: " + circulo.perimetro());

        // Prueba con un rectángulo
        IFigGeometrica<Double> rectangulo = new Rectangulo(4.0, 7.0);
        System.out.println("\nRectángulo:");
        System.out.println("Área: " + rectangulo.area());
        System.out.println("Perímetro: " + rectangulo.perimetro());
    }
    
    // Método principal
    public static void main(String[] args) {
        System.out.println("Prueba de interfaz IAnimal:");
        Animal();
        
        System.out.println("\nPruebas de interfaz Ivehiculo:");
        Vehiculo();
        
        System.out.println("\nPruebas de interfaz Ipago:");
        pago();
        
        System.out.println("\nPruebas de interfaz IFigGeometrica:");
        FigGeometrica();
        
        
        
        
    }
}