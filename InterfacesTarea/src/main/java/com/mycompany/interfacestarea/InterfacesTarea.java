/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacestarea;

/**
 *
 * @author offic
 */
import ServiciosInterfaz.IAnimal;
import ServiciosInterfaz.IAnimal.Gato;
import ServiciosInterfaz.IAnimal.Perro;

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
    
    
        // Método principal
    public static void main(String[] args) {
        System.out.println("Prueba de interfaz IAnimal:");
        Animal();
    }
}