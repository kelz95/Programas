/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintermedio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Prestamos implements Almacenamiento{
    private List lista = new ArrayList();
    private static final Prestamos INSTANCE = new Prestamos();
    
    public Prestamos() {
    }
    
    public static Prestamos getInstance(){
        return INSTANCE;
    }
    @Override
    public boolean agregar(Object o) {
        return lista.add(o);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean elimina(int index) {
        Object o = busqueda(index);
        if(o != null){
            lista.remove(o);
            return true;
        }else{
            return false;
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean elimina(Object o) {
       return lista.remove(o);
    }

    @Override
    public Object busqueda(int id) {
        Iterator it = lista.iterator();
        while(it.hasNext()){
            Object o = it.next();
            if(o instanceof Prestamo){
                Prestamo p = (Prestamo) o; //casteo del objeto a tipo Prestamo
                if (p.getIdServicio() == id){
                    return p; // si si lo encuentra
                }
            }
        }
        return null; //si no lo encuentra
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object busqueda(Object o) {
        for(Object ob:lista){ //iterator
            Prestamo p = (Prestamo) o; //casteo
            if(p.equals(ob)){
                return p;
            }
        }
        return null;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modifica(int index, Object o) {
        Prestamo p = (Prestamo) busqueda (index);
        if((p != null) && (o instanceof Prestamo)){
                Prestamo pr = (Prestamo) o;
                lista.set(lista.indexOf(p), pr);
                return true;
        }
        return false;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modifica(Object elem, Object nuevo) {
        Prestamo p = (Prestamo)busqueda(elem);
       if((p != null) && (nuevo instanceof Prestamo)){
                Prestamo pr = (Prestamo) nuevo;
                lista.add(lista.indexOf(p), pr);
                return true;
        }
        return false;
    }

    @Override
    public int tamanio(){
        return lista.size();
    }

    @Override
    public boolean vacio() {
        return lista.isEmpty();
    }

    @Override
    public String listado() {
       StringBuffer sb = new StringBuffer();
       for(int i=0; i<lista.size(); i++){
           Prestamo p = (Prestamo) lista.get(i);
           sb.append(p);
           sb.append("\n");
       }
       return sb.toString();
    }
    
    public boolean guardaArchivo(String arch){
        FileOutputStream f = null;
        ObjectOutputStream ob = null;
        try{
                f = new FileOutputStream(arch);
                ob = new ObjectOutputStream(f);
                for(Object object : lista){
                        Prestamo p = (Prestamo) object;
                        ob.writeObject(p);
                }
                return true;
         }catch(FileNotFoundException file){
             
         }catch(IOException ex){

         }finally{
                try{
                        ob.flush();
                        ob.close();
                        f.flush();
                        f.close();
                        
                }catch(IOException ex){

                }
         }
        return false;
    }
    
    public boolean abreArchivo(String arch){
        try(FileInputStream f = new FileInputStream(arch); ObjectInputStream ob = new ObjectInputStream(f)){   
            Object p = ob.readObject();
            System.out.println("Objecto ->" + p);
                while(p != null){
                    lista.add(p);
                    p = ob.readObject();
                }
                return true;
         }catch(ClassNotFoundException | IOException ex){
            ex.printStackTrace();
         }
        return false;
    }
    
}
