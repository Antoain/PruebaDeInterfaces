
package com.mycompany.interfacestarea;
import ServiciosInterfaz.IAlimentacion;
import ServiciosInterfaz.IAlimentacion.Animal;
import ServiciosInterfaz.IAlimentacion.Persona;
import ServiciosInterfaz.IAnimal;
import ServiciosInterfaz.IAnimal.Gato;
import ServiciosInterfaz.IAnimal.Perro;
import ServiciosInterfaz.IDescontar;
import ServiciosInterfaz.IDescontar.DescuentoFijo;
import ServiciosInterfaz.IDescontar.DescuentoPorcentaje;
import ServiciosInterfaz.IFigGeometrica;
import ServiciosInterfaz.IFigGeometrica.Circulo;
import ServiciosInterfaz.IFigGeometrica.Rectangulo;
import ServiciosInterfaz.INotificacion;
import ServiciosInterfaz.INotificacion.CorreoElectronico;
import ServiciosInterfaz.INotificacion.SMS;
import ServiciosInterfaz.IOrdenar;
import ServiciosInterfaz.IOrdenar.ListaNumeros;
import ServiciosInterfaz.ITrabajador;
import ServiciosInterfaz.ITrabajador.Desarrollador;
import ServiciosInterfaz.ITrabajador.Diseñador;
import ServiciosInterfaz.IcomparacionObjeto.Producto;
import ServiciosInterfaz.Ipago;
import ServiciosInterfaz.Ipago.PagoConEfectivo;
import ServiciosInterfaz.Ipago.PagoConTarjeta;
import ServiciosInterfaz.Ivehiculo;
import ServiciosInterfaz.Ivehiculo.Bicicleta;
import ServiciosInterfaz.Ivehiculo.Coche;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    
    // Metodo para probar ITrabajador
    public static void trabajacion() {
        //Desarrollador
        ITrabajador<String> desarrollador = new Desarrollador();
        System.out.println(desarrollador.trabajar());

        //Diseñador
        ITrabajador<String> diseñador = new Diseñador();
        System.out.println(diseñador.trabajar());

        
    }
    // Metodo para probar IOrdenar
     public static void ListaNumeros() {
        
        IOrdenar<Integer> listaNumeros = new ListaNumeros();
        List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 4));
        System.out.println("Lista original (numeros): " + numeros);
        listaNumeros.ordenar(numeros);
     }
     
     // Metodo para probar IAlimentacion
     public static void Comer() {
        // Persona
        IAlimentacion<String> persona = new Persona();
        System.out.println("Persona: " + persona.comer());

        // Animalito
        IAlimentacion<String> animal = new Animal();
        System.out.println("Animal: " + animal.comer());

        
        
    }
     
     // Metodo para probar INotificacion
      public static void Notificacion() {
        // Prueba con Correo Electrónico
        INotificacion<String> correo = new CorreoElectronico();
        System.out.println("Correo: " + correo.enviarNotificacion());

        // Prueba con SMS
        INotificacion<String> sms = new SMS();
        System.out.println("SMS: " + sms.enviarNotificacion());

    }
      // Metodo para probar IcomparacionObjeto
      public static void Comparacion() {
        // primero creamos la lista del producto
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(29.99));
        productos.add(new Producto(19.99));
        productos.add(new Producto(49.99));
        productos.add(new Producto(9.99));

        // los mostramos para luego hacer la comparaicon
        System.out.println("Productos antes de ordenar:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }

        // Ordenamos los productos usando Sort
        Collections.sort(productos, (p1, p2) -> p1.comparar(p2));

        // y los mostramos ahora haciendo la comparacion
        System.out.println("\nProductos ordenados:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
      
      // Metodo para probar IDescontar
      public static void CalcDescuento() {
        // Usando descuento por porcentaje
        IDescontar<Double> descuentoPorcentaje = new DescuentoPorcentaje(15.0); 
        Double precioOriginal = 200.00;
        Double descuentoAplicado = descuentoPorcentaje.calcularDescuento(precioOriginal);
        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Descuento (15%): $" + descuentoAplicado);
        System.out.println("Precio final: $" + (precioOriginal - descuentoAplicado));

        // Usando descuento fijo
        IDescontar<Double> descuentoFijo = new DescuentoFijo(20.00); 
        descuentoAplicado = descuentoFijo.calcularDescuento(precioOriginal);
        System.out.println("\nPrecio original: $" + precioOriginal);
        System.out.println("Descuento fijo: $" + descuentoAplicado);
        System.out.println("Precio final: $" + (precioOriginal - descuentoAplicado));
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
        
        System.out.println("\nPruebas de interfaz IAlimentacion:");
        Comer();
        
        System.out.println("\nPruebas de interfaz INotificacion:");
        Notificacion();
        
         System.out.println("\nPruebas de interfaz IcomparacionObjeto:");
        Comparacion();
        
        System.out.println("\nPruebas de interfaz IDescontar:");
        CalcDescuento();
        

    }
}