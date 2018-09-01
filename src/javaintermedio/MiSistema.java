/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintermedio;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author alumno
 */
public class MiSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        Persona p = new Persona();
        Persona r = new Persona("Alex", "Botella", cal, 'M');
        Cliente c = new Cliente("01", "Pancho", "Reyes", cal, 'M');
        Cliente.Domicilio dom;
        dom = c.new Domicilio ("Granjas", 12, "Almoca", "Juarez");
        //p.setNombre("Alex");
        System.out.println(r);
        System.out.println(c + " - > " + dom);
    
        //Servicio s = new Servicio(cal);
        Prestamo pr = new Prestamo(3000F,cal, cal);
    }
    
}
