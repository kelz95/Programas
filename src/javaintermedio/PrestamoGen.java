/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintermedio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class PrestamoGen {
    private ArrayList <Prestamo> lista = new ArrayList<>();
    private static final PrestamoGen INSTANCE = new PrestamoGen();

    public PrestamoGen() {}
    
    public static PrestamoGen getInstance() {
        return INSTANCE;
    }
    

    public boolean agregar(Prestamo o) {
        return lista.add(o);
    }


    public boolean elimina(int index) {
        Prestamo p = busqueda(index);
        if(p != null){
            lista.remove (lista.indexOf(p));
            return true;
        }
        return false;
    }

    public boolean elimina(Object o) {
        if(o != null){
            lista.remove (lista.indexOf(o));
            return true;
        }
        return false;
    }


    public Prestamo busqueda(int index) {
        Iterator<Prestamo> it =lista.iterator();
        while(it.hasNext()){
            Prestamo pr =it.next();
            if(pr.getIdServicio() == index){
                return pr;
            }
        }
        return null;
    }
    
    public Prestamo busqueda(Prestamo o) {
        for(Prestamo pr:lista){
            if(pr.equals(o)){
                return pr;
            }
        }
        return null;
    }

    public boolean modifica(int index, Prestamo o) {
        Prestamo p =busqueda(index);
        if(p !=null ){
            lista.set(lista.indexOf(p), o);
            return true;
        }
        return false;
    }

    public boolean modifica(Prestamo elem, Prestamo nuevo) {
        Prestamo p =busqueda(elem);
        if(p !=null ){
            lista.set(lista.indexOf(p), nuevo);
            return true;
        }
        return false;    
    }


    public int tamanio() {
        return lista.size();
    }


    public boolean vacio() {
        return lista.isEmpty();
    }


    public String listado() {
        StringBuilder sb = new StringBuilder();
        for(Prestamo pr: lista){
            sb.append(pr);
            sb.append("\n");
        }
        return sb.toString();
    }

}
