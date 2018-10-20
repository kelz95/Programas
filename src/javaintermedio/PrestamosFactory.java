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
public abstract class PrestamosFactory {
    public static Prestamos createPrestamos(){
        return Prestamos.getInstance();
    }
     public static PrestamoGen createPrestamoGen(){
        return PrestamoGen.getInstance();
     }
    public static PrestamoBD createPrestamosBD(String url, String user, String password){       
        return new PrestamoBD(url, user, password);
    }
    
}
