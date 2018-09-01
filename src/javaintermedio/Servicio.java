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

    public Servicio(Calendar fechaCont) {
        this.fechaCont = fechaCont;
    }

    public Servicio() {
        this.fechaCont = null;
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

    @Override
    public String toString() {
        return "Servicio{" + "fechaCont= " + fechaCont + '}';
    }
}
