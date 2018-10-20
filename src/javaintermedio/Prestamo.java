/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintermedio;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author abi-r
 */
public class Prestamo extends Servicio implements Serializable{
    private float monto;
    private Calendar vigencia;
    private Cliente c1;
    private static long serialVersionUID = 4200L;

    public Prestamo(float monto, Calendar vigencia, int IdServicio, Calendar fechaCont) {
        super(IdServicio, fechaCont);
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

    public Cliente getC1() {
        return c1;
    }

    public void setC1(Cliente c1) {
        this.c1 = c1;
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
        return super.toString() + "Prestamo{" + "monto=" + monto + ", vigencia=" + Utilerias.convierteFecha(vigencia) + '}';
    }
}
