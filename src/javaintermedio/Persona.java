/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintermedio;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author alumno
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    private char genero;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.fechaNacimiento = null;
        this.genero = 'a';
    }

    public Persona(String nombre, String apellido, Calendar fechaNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }
    
    int calculaEdad(){
        int a = this.fechaNacimiento.get(Calendar.YEAR);
        int aa = new GregorianCalendar().get(Calendar.YEAR);
        return aa - a;
    }
    
     int calculaEdad(Calendar cal){
        int a = this.fechaNacimiento.get(Calendar.YEAR);
        int aa = new GregorianCalendar().get(Calendar.YEAR);
        return aa - a;
    }
    
    String muestraDatos(){
        return this.nombre + " " + this.apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        //Utilerias u = new Utilerias();
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + Utilerias.convierteFecha(fechaNacimiento) + ", genero=" + genero + '}';
    }
    
    
    
}

