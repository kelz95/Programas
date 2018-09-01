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
public class Cliente extends Persona{
    public static String noCliente;
    //private Domicilio domicilio;

    public Cliente(String noCliente, String nombre, String apellido, Calendar fechaNacimiento, char genero) {
        super(nombre, apellido, fechaNacimiento, genero);
        this.noCliente = noCliente;       
    }
    
    public class Domicilio{
        String calle;
        int noExt;
        String colonia;
        String delegacion;

        public Domicilio(String calle, int noExt, String colonia, String delegacion) {
            this.calle = calle;
            this.noExt = noExt;
            this.colonia = colonia;
            this.delegacion = delegacion;
        }

        @Override
        public String toString() {
            return "Domicilio{" + "calle=" + calle + ", noExt=" + noExt + ", colonia=" + colonia + ", delegacion=" + delegacion + '}';
        }
        
        
        
    }

    public String getNoCliente() {
        return this.noCliente;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    @Override
    String muestraDatos(){
        return this.noCliente + " " + this.getGenero();
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "noCliente=" + noCliente + '}';
    }
    
    
}
