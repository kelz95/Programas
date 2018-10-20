/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escom.ipn;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class PrestamosGen{
    private ArrayList<Prestamo> lista = new ArrayList<>();
    private static final PrestamosGen INSTANCE = new PrestamosGen();
    
    private PrestamosGen(){}
    
    public static PrestamosGen getInstance(){
        return INSTANCE;
    }

    public boolean agregar(Prestamo o) {
        return lista.add(o);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean elimina(int index) {
        Prestamo p = busqueda(index);
        if(p != null){
            lista.remove(lista.indexOf(p));
            return true;
        }
        return false;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean elimina(Prestamo o) {
        if(o != null){
            lista.remove(o);
            return true;
        }
        return false;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Prestamo busqueda(int index) {
        Iterator<Prestamo> it = lista.iterator();
        while(it.hasNext()){
            Prestamo pr = it.next();
            if(pr.getIdServicio() == index){
                return pr;
            }
        }
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Prestamo busqueda(Prestamo o) {
        for(Prestamo pr:lista){
            if(pr.equals(o)){
                return pr;
            }
        }
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean modifica(int index, Prestamo o) {
        Prestamo p = busqueda(index);
        if(p != null){
            lista.set(lista.indexOf(p), o);
            return true;
        }
        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean modifica(Prestamo elem, Prestamo nuevo) {
       Prestamo p = busqueda(elem);
       if(p != null){
           lista.set(lista.indexOf(p), nuevo);
           return true;
       }
       return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int tamanio() {
        return lista.size();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean vacio() {
        return lista.isEmpty();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String listado() {
        StringBuilder sb = new StringBuilder();
        for(Prestamo pr:lista){
            sb.append(pr);
            sb.append('\n');
        }
        return sb.toString();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
