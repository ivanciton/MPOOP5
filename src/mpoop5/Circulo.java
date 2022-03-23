/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *
 * @author alumno
 */
public class Circulo {

    public final float PI = 3.1416f;        //constante ,casteamos
    private float radio;                     //variable

    //constructor
    public Circulo() {

    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    //metodos
    /**
     * Metódo calcula el perimetro de un circulo y despues imprime el valor por
     * medio de una cadena No retorna ningun valor
     *
     */
    public void perimetro() {
        float perimetro = 2 * PI * radio;
        System.out.println("Perimetro=" + perimetro);

    }

    /**
     * Método calcula el area de un circulo y lo imprime el valor mediante una
     * cadena No retorna ningun valor
     */
    public void area() {
        System.out.println("area=" + (PI * radio * radio));
    }

    /**
     * Este metódo nos muestra el valor del radio, el cual es de tipo float
     *
     * @return el valor del radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * Este metódo ingresa un valor para el atributo radio aunque el valor del
     * radio se un numero negativo, se le aplica el metodo abs de Math No
     * retorno ningun valor
     *
     * @param radio recibe un valor de tipo float para el radio
     */
    public void setRadio(float radio) {

        this.radio = Math.abs(radio);

    }

    /**
     *
     * @return una cadena mostrando el valor del radio
     */
    @Override
    public String toString() {
        return "Circulo{radio=" + radio + "}";

    }

}
