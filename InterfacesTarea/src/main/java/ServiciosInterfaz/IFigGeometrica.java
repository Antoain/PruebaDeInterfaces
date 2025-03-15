/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServiciosInterfaz;

/**
 *
 * @author offic
 */
public interface IFigGeometrica <T> {
    T area();
    T perimetro();
    
    
    public class Circulo implements IFigGeometrica<Double> {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
        }

    @Override
    public Double area() {
        return Math.PI * radio * radio;
        }

    @Override
    public Double perimetro() {
        return 2 * Math.PI * radio;
        }
    }
    
    
    public class Rectangulo implements IFigGeometrica<Double> {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
        }

    @Override
    public Double area() {
        return largo * ancho;
        }

    @Override
    public Double perimetro() {
        return 2 * (largo + ancho);
        }
    }


}
