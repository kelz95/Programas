/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintermedio;

/**
 *
 * @author alumno
 */
public class MiSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona();
        Persona r = new Persona("Alex", "Botella", null, 'M');
        Cliente c = new Cliente("01", null, "Pancho", "Reyes", null, 'M');
        //p.setNombre("Alex");

        System.out.println(r);
        System.out.println(c);
    
    }
    
}
