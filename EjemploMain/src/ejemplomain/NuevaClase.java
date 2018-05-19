package ejemplomain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class NuevaClase {
    String nombre, color, forma, lema;
  

    public NuevaClase(String nombre, String color, String forma, String lema) {
        this.nombre = nombre;
        this.color = color;
        this.forma = forma;
        this.lema = lema;
    }

    NuevaClase(){
        nombre = "rosa";
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getForma() {
        return forma;
    }

    public String getLema() {
        return lema;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }
    
    
}
