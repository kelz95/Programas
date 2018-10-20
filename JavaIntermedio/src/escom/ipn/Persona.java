/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escom.ipn;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author alumno
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private Calendar fechaNac;
    private char genero;
    
    public Persona(){
        System.out.println("invoca al constructor");
        this.nombre = "";
        this.apellidos = "";
        this.fechaNac = null;
        this.genero = 'a';
    }

    public Persona(String nombre, String apellidos, Calendar fechaNac, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.genero = genero;
    }
    
    
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Calendar getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Calendar fechaNac) {
        this.fechaNac = fechaNac;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    
    int calculaEdad(){
        int a = this.fechaNac.get(Calendar.YEAR);
        int aa = new GregorianCalendar().get(Calendar.YEAR);
        return aa - a;
    }
    
    int calculaEdad(Calendar cal){
        int a = cal.get(Calendar.YEAR);
        int aa = new GregorianCalendar().get(Calendar.YEAR);
        return aa - a;
    }
    
    String muestraDatos(){
        return this.nombre + " " + this.apellidos;
    }

    @Override
    public String toString() {
        // Utilerias u = new Utilerias();
        
        return "Persona{" + "nombre=" + nombre 
                + ", apellidos=" + apellidos 
                + ", fechaNac=" + Utilerias.convierteFecha(fechaNac) + ", genero=" + genero + '}';
    }
    
    
}
