/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escom.ipn;

import java.util.Calendar;

/**
 *
 * @author alumno
 */
public class Cliente extends Persona{
    private String noCliente;
    public class Domicilio{
        String calle;
        int noExt;
        String colonia;
        String delegacion;
        
        public Domicilio(String calle, int noExt, String colonia, String del){
            this.calle = calle;
            this.noExt = noExt;
            this.colonia = colonia;
            this.delegacion = del;
        }
        @Override
        public String toString(){
            return calle + " " + noExt + " " + colonia + " " + delegacion;
        }
    }

    public Cliente(String noCliente, String nombre, String apellidos, Calendar fechaNac, char genero) {
        super(nombre, apellidos, fechaNac, genero);
        this.noCliente = noCliente;
       // this.domicilio = domicilio;
    }

    public String getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

//    public Domicilio getDomicilio() {
//        return domicilio;
//    }
//
//    public void setDomicilio(Domicilio domicilio) {
//        this.domicilio = domicilio;
//    }
    
    @Override
    public String muestraDatos(){
        return this.noCliente + " " + this.getGenero();
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "noCliente=" + noCliente;
                //+ ", domicilio=" + domicilio + '}';
    }
    
    
}
