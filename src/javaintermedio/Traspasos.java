/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintermedio;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class Traspasos implements Almacenamiento{
    private TreeSet conjunto = new TreeSet();
    
    @Override
    public boolean agregar(Object o) {
        return conjunto.add(o);
    }

    @Override
    public boolean elimina(int id) {
        Traspaso t = (Traspaso)busqueda(id);
        if(t != null){
            return conjunto.remove(t);         
        }
        return false;
    }

    @Override
    public boolean elimina(Object o) {
        if(o != null){
            return conjunto.remove(o);
        }
        return false;
    }

    @Override
    public Object busqueda(int id) {
        Iterator it = conjunto.iterator();
        while(it.hasNext()){
            Traspaso t = (Traspaso)it.next();
            if(t.getIdServicio() == id){
                return t;
            }       
        }
        return null;
    }

    @Override
    public Object busqueda(Object o) {
        for(Object ob:conjunto){
            if(ob.equals(o)){
                return o;
            }
        }
        return null;
    }

    @Override
    public boolean modifica(int id, Object o) {
        Traspaso t = (Traspaso)busqueda (id);
        if(t!=null){
            conjunto.remove(t);
            conjunto.add(o);
            return true;
        }
        return false;
    }

    @Override
    public boolean modifica(Object elem, Object nuevo) {
        Traspaso t = (Traspaso)busqueda (elem);
        if(t!=null){
            conjunto.remove(t);
            conjunto.add(nuevo);
            return true;
        }
        return false;
    }

    @Override
    public int tamanio() {
        return conjunto.size();
    }

    @Override
    public boolean vacio() {
        return conjunto.isEmpty();
    }

    @Override
    public String listado() {
        StringBuilder sb = new StringBuilder(); 
        for(Object o: conjunto){
            Traspaso t = (Traspaso)o;
            sb.append(t);
            sb.append("\n");
        }
        return sb.toString();
    }  
}
