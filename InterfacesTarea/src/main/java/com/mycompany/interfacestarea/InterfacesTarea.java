
package com.mycompany.interfacestarea;
import ServiciosInterfaz.IAnimal;
import ServiciosInterfaz.IAnimal.Gato;
import ServiciosInterfaz.IAnimal.Perro;
import ServiciosInterfaz.IFigGeometrica;
import ServiciosInterfaz.IFigGeometrica.Circulo;
import ServiciosInterfaz.IFigGeometrica.Rectangulo;
import ServiciosInterfaz.IOrdenar;
import ServiciosInterfaz.IOrdenar.ListaNumeros;
import ServiciosInterfaz.ITrabajador;
import ServiciosInterfaz.ITrabajador.Desarrollador;
import ServiciosInterfaz.ITrabajador.Diseñador;
import ServiciosInterfaz.Ipago;
import ServiciosInterfaz.Ipago.PagoConEfectivo;
import ServiciosInterfaz.Ipago.PagoConTarjeta;
import ServiciosInterfaz.Ivehiculo;
import ServiciosInterfaz.Ivehiculo.Bicicleta;
import ServiciosInterfaz.Ivehiculo.Coche;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class InterfacesTarea {

    // Método para probar IAnimal
    public static void Animal() {
        IAnimal<String> perro = new Perro();// perro
        System.out.println(perro.hacerSonido());
        System.out.println(perro.mover());

        IAnimal<String> gato = new Gato();// gato
        System.out.println(gato.hacerSonido());
        System.out.println(gato.mover());
    }
    
    
    // Método para probar IVehiculo
    public static void Vehiculo() {
        Ivehiculo<String> coche = new Coche();//carro
        System.out.println(coche.arrancar());
        System.out.println(coche.detener());

        Ivehiculo<String> bicicleta = new Bicicleta();//biccileta
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
        //círculo
        IFigGeometrica<Double> circulo = new Circulo(8.0);
        System.out.println("Circulo:");
        System.out.println("Area: " + circulo.area());
        System.out.println("Perimetro: " + circulo.perimetro());

        //rectángulo
        IFigGeometrica<Double> rectangulo = new Rectangulo(8.0, 7.0);
        System.out.println("\nRectangulo:");
        System.out.println("Area: " + rectangulo.area());
        System.out.println("Perimetro: " + rectangulo.perimetro());
    }
    
    
    public static void trabajacion() {
        //Desarrollador
        ITrabajador<String> desarrollador = new Desarrollador();
        System.out.println(desarrollador.trabajar());

        //Diseñador
        ITrabajador<String> diseñador = new Diseñador();
        System.out.println(diseñador.trabajar());

        
    }
    
     public static void ListaNumeros() {
        
        IOrdenar<Integer> listaNumeros = new ListaNumeros();
        List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 4));
        System.out.println("Lista original (números): " + numeros);
        listaNumeros.ordenar(numeros);
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
        
        System.out.println("\nPruebas de interfaz ITrabajar:");
        trabajacion();
        
        System.out.println("\nPruebas de interfaz IOrdenar");
        ListaNumeros();
        
        
        
    }
}