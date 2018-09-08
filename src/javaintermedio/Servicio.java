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
public abstract class Servicio {
    private Calendar fechaCont;
    private int IdServicio;

    public Servicio(int IdServicio, Calendar fechaCont) {
        this.fechaCont = fechaCont;
        this.IdServicio = IdServicio;
    }

    public Servicio() {
        this.fechaCont = null;
        this.IdServicio = 0;
    }

    public String muestraDescripccion(){
        return "hola";
    }
    
    public Calendar getFechaCont() {
        return fechaCont;
    }

    public void setFechaCont(Calendar fechaCont) {
        this.fechaCont = fechaCont;
    }

    public int getIdServicio() {
        return IdServicio;
    }

    public void setIdServicio(int IdServicio) {
        this.IdServicio = IdServicio;
    }

    @Override
    public String toString() {
        return "Servicio{" + "fechaCont=" + Utilerias.convierteFecha(fechaCont) + ", IdServicio=" + IdServicio + '}';
    }
    

}
