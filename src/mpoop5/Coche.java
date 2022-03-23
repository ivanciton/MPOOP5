/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *
 * @author alumno
 */
public class Coche {
    
    private String marca;
    private String color;
    private int placa;
    private int numPuertas;
    private int modeloAnio;
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    

    public Coche() {
    }

    public Coche(String marca, String color, int placa, int numPuertas, int modeloAnio, Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.modeloAnio = modeloAnio;
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }
    public Coche(String marca, String color, int placa, int numPuertas, int modeloAnio) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.modeloAnio = modeloAnio;
    }

    /**
     * Este metodo nos muestra la cadena que tiene el atributo marca
     * @return marca, es contenido de este atributo
     */

    public String getMarca() {
        return marca;
    }
    /**
     * Este metódo ingresa una cadena al atributo marca
     * @param marca se debe ingrasar la marca del carro
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Este metodo muestra una cadena al atributo color
     * @return el color del carro
     */

    public String getColor() {
        return color;
    }
    /**
     * Metodo que almacena una cadena al atributo color
     * @param color necesita una cadena para ingresarla en el atributo
     */

    public void setColor(String color) {
        this.color = color;
    }
    /**
     * metodo que muestra la valor del atributo placa
     * @return un valor de tipo entero
     */

    public int getPlaca() {
        return placa;
    }
    /**
     * Metodo que ingresa un valor entero al atributo placa
     * @param placa un valor que almacena placa
     */

    public void setPlaca(int placa) {
        this.placa = placa;
    }
    /**
     * Metodo que muestra lo que tiene el atributo numPuerta
     * @return  contenido de numPuertas
     */

    public int getNumPuertas() {
        return numPuertas;
    }
    /**
     * Metodo que almacena un valor entero en el atributo numPuertas
     * @param numPuertas el valor del atributo
     */

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    /**
     * Metodo que muestra lo que tiene el atributo modeloAnio
     * @return el valor de modeloAnio
     */

    public int getModeloAnio() {
        return modeloAnio;
    }
    /**
     * Metodo que almacena un valor de tipo entero en modeloAnio
     * @param modeloAnio el valor del atributo
     */

    public void setModeloAnio(int modeloAnio) {
        this.modeloAnio = modeloAnio;
    }
    /**
     * Este metodo imprime una cadena 
     */
    
    public void encender(){
        System.out.println("estoy encendiendo");
    }
    /**
     * Este metodo imprime una cadena
     */
    public void apagar(){
        System.out.println("voy a apagar");
    }
    /**
     * Este metodo imprime una cadena 
     */
    public void frenar(){
        System.out.println("frenando");
    }
    /**
     * Este metodo imprime una cadena
     */
    public void tocarClaxon(){
        System.out.println("Quitate del camino");
    }
    /**
     * Este metodo imprime una cadena
     * @param velocidad recibe un valor de tipo entero
     */
    
    public void acelerar(int velocidad){
        System.out.println(" voy a  una velocidad de "+velocidad+"km/h");
    }
    /**
     * @return muestra el objeto chofer 
     */

    public Persona getChofer() {
        return chofer;
    }
    /**
     * Metodo que almacena un objeto de la clase Persona en 
     * el atributo chofer
     * @param chofer recibe un objeto de la clase Persona
     */
    

    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }
    /**
     * 
     * @return muestra el objeto copiloto
     */

    public Persona getCopiloto() {
        return copiloto;
    }
    /**
     * Metodo que almacena un objetoi de la clase Persona en 
     * el atributo copiloto
     * @param copiloto recibe un objeto de la clase Persona
     */

    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }
    /**
     * 
     * @return muestra el objeto pasajero1
     */

    public Persona getPasajero1() {
        return pasajero1;
    }
    /**
     * Metodo que almacena un objeto de la clase Persona en
     * el atributo pasajero1
     * @param pasajero1 recide un objeto de la clase Persona
     */

    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }
    
    /**
     * 
     * @return muestra el objeto pasajero2
     */
    

    public Persona getPasajero2() {
        return pasajero2;
    }
    /**
     * Metodo que almacena un objeto de la clase Persona en el 
     * atributo pasajero2
     * @param pasajero2 recibe un objeto de la clase Persona
     */

    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    /**
     * @return muestra por medio de una cadena cada uno de los valores
     * los atributos
     */

    @Override
    public String toString() {
        return "Coche{" + "marca= " + marca + ", color= " + color + ", placa= " + placa + ", numPuertas= " + numPuertas + ", modeloAnio= " + modeloAnio + 
                ", chofer= " + chofer + ", Copiloto= " + copiloto + ", pasajero 1= " + pasajero1 + ", pasajero 2= "+ pasajero2 + '}';
    }
    
    
}
