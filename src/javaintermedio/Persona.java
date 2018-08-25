/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintermedio;

import java.util.Calendar;

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
        return 0;
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
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + '}';
    }
    
    
    
}

