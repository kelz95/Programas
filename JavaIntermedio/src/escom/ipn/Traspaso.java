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
public class Traspaso extends Servicio implements Comparable{
   private String destino;
   private float monto;

    public Traspaso(String destino, float monto, Calendar fechaCont, int idServicio) {
        super(fechaCont, idServicio);
        this.destino = destino;
        this.monto = monto;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Traspaso{" + "destino=" + destino + ", monto=" + monto + '}';
    }

    @Override
    public int compareTo(Object o) {
        Traspaso ext = (Traspaso)o;
        if(ext.getIdServicio() == this.getIdServicio()){
            return 0;
        } else if(ext.getIdServicio() > this.getIdServicio()){
            return -1;
        } else {
            return 1;
    }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
}
