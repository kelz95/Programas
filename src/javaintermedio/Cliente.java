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
    private String noCliente;
    private Domicilio domicilio;

    public Cliente(String noCliente, Domicilio domicilio, String nombre, String apellido, Calendar fechaNacimiento, char genero) {
        super(nombre, apellido, fechaNacimiento, genero);
        this.noCliente = noCliente;
        this.domicilio = domicilio;
    }

    public String getNoCliente() {
        return noCliente;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
    @Override
    String muestraDatos(){
        return this.noCliente + " " + this.getGenero();
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "noCliente=" + noCliente + ", domicilio=" + domicilio + '}';
    }
    
    
}
