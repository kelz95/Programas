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
public class Traspaso extends Servicio{
    private String destino;
    private float monto;

    public Traspaso(String destino, float monto, Calendar fechaCont) {
        super(fechaCont);
        this.destino = destino;
        this.monto = monto;
    }

    public Traspaso(String destino, float monto) {
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
        return super.toString() + "Traspaso{" + "destino=" + destino + ", monto=" + monto + '}';
    }
    
}
