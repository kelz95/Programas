/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintermedio;

import java.util.Calendar;

/**
 *
 * @author abi-r
 */
public class Cuenta extends Servicio{
    private int noCuenta;

    public Cuenta(int noCuenta, Calendar fechaCont) {
        super(fechaCont);
        this.noCuenta = noCuenta;
    }

    public Cuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }
    
    float saldo(){
        return 0;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    @Override
    public String toString() {
        return super.toString() + "Cuenta{" + "noCuenta=" + noCuenta + '}';
    }
    
}
