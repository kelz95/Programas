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
public class Prestamo extends Servicio{
    private float monto;
    private Calendar vigencia;

    public Prestamo(float monto, Calendar vigencia, Calendar fechaCont) {
        super(fechaCont);
        this.monto = monto;
        this.vigencia = vigencia;
    }

    public Prestamo(float monto, Calendar vigencia) {
        this.monto = monto;
        this.vigencia = vigencia;
    }
    
    float saldo(){
        return 0;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Calendar getVigencia() {
        return vigencia;
    }

    public void setVigencia(Calendar vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public String toString() {
        return super.toString() + "Prestamo{" + "monto=" + monto + ", vigencia=" + vigencia + '}';
    }

    
    
}