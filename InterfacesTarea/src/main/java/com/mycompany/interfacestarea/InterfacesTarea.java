
package com.mycompany.interfacestarea;
import ServiciosInterfaz.IAnimal;
import ServiciosInterfaz.IAnimal.Gato;
import ServiciosInterfaz.IAnimal.Perro;
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
    
        // Método principal
    public static void main(String[] args) {
        System.out.println("Prueba de interfaz IAnimal:");
        Animal();
        
        System.out.println("\nPruebas de interfaz Ivehiculo:");
        Vehiculo();
    }
}