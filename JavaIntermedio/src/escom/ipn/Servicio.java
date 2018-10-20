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
public abstract class Servicio implements Serializable{
   private Calendar fechaCont; 
   private int idServicio;

    public Servicio(Calendar fechaCont, int idServicio) {
        this.fechaCont = fechaCont;
        this.idServicio = idServicio;
    }

    public Calendar getFechaCont() {
        return fechaCont;
    }

    public void setFechaCont(Calendar fechaCont) {
        this.fechaCont = fechaCont;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    @Override
    public String toString() {
        return "Servicio{" + "fechaCont=" + Utilerias.convierteFecha(fechaCont)
                + ", idServicio=" + idServicio + '}';
    }
   
    
    
}
