/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escom.ipn;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author alumno
 */
public class Prestamo extends Servicio implements Serializable{
    private float monto;
    private Calendar vigencia;
    private Cliente cl;
    private static long serialVersionUID = 4200L;

    public Prestamo(Calendar fechaCont, int idServicio, float monto, Calendar vigencia) {
        super(fechaCont, idServicio);
        this.monto = monto;
        this.vigencia = vigencia;
    }

    public Cliente getCl() {
        return cl;
    }

    public void setCl(Cliente cl) {
        this.cl = cl;
    }

   
    public String muestraDescripcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() + "Prestamo{" + "monto=" + monto 
                + ", vigencia=" + Utilerias.convierteFecha(vigencia) + '}';
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
    
    
    
}
