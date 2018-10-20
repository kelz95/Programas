/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escom.ipn;

/**
 *
 * @author alumno
 */
public class PrestamosFactory {
    
    public static Prestamos createPrestamos(){
        return Prestamos.getInstance();
    }
    
    public static PrestamosGen createPrestamosGen(){
        return PrestamosGen.getInstance();
    }
    
    public static PrestamosBD createPrestamosBD(
            String url, String user, String pwd){
        return new PrestamosBD(url, user, pwd);
    }
}
