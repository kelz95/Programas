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
public class Cuenta extends Servicio{
  private int noCuenta;  

    public Cuenta(Calendar fechaCont, int idServicio, int noCuenta) {
        super(fechaCont, idServicio);
        this.noCuenta = noCuenta;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "noCuenta=" + noCuenta + '}';
    }
    
    
  
  
}
