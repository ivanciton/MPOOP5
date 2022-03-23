/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *
 * @author alumno
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }
    public Persona(String nombre, String apellido, 
            int dia,int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = new Fecha(dia, mes,anio);
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //metodos

    /**
     *
     * @return muestra la cadena que tiene el atributo nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este metodo almacena una cadena como argumento y la asigna al 
     * atibuto nombre 
     * @param nombre necesita una cadena
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return muestra la cadena que tiene el atributo apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Este metodo almacena una cadena como argumento y la asigna al
     * atributo apellido
     * @param apellido necesita una cadena
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return muestra el objeto de la clase Fecha 
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    /**
     * Este metodo almacena un objeto de la clase Fecha y la
     * asigna al atributo fNacimiento
     * @param fNacimiento necesita un objeto 
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    /*@Override//anotaciociones sobreescritura del metodo toString
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento +'}';
    }*/
    /**
     * 
     * @return una cadena mostrando los atributos de 
     * nombre y apellido
     */
    @Override//anotaciaciones sobreescritura del metodo toString
    public String toString() {
        return  nombre +" " +apellido;
    }
    
}
