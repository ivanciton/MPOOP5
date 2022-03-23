/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *
 * @author alumno
 */
public class Fecha {
    private int dia;      //en el diagrama se rerpresenta por un menos el private
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     *
     * @return muestra el valor del atributo dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * Este metodo almacena un valor de tipo int en el atributo  dia
     * @param dia necesita un valor de tipo int
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     *
     * @return muestra el valor del atributo mes 
     */
    public int getMes() {
        return mes;
    }

    /**
     * Este metodo almacena un valor de tipo int 
     * en el atributo mes
     * @param mes necesita un valor de tipo int
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     *
     * @return muestra el valor del atributo anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Este metodo almancena un valor de tipo int 
     * en el atributo anio
     * @param anio necesita un valor de tipo entero
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * 
     * @return muestra una cadena con el valor de los atributos dia,mes y anio
     */

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+anio;
    }
    
    
}
