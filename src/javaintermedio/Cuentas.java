/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintermedio;

import java.util.GregorianCalendar;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Cuentas {
    private static TreeMap<Integer, Cuenta> mapa = new TreeMap<>();
    
    public boolean agrega (int key, Cuenta obj){
        if(mapa.put(key, obj) != null){
            return true;
        }
        return false;
    }
    
    public boolean elimina (int key){
        if(mapa.remove(key) != null){
            return true;
        }
        return false;
    }
    
     public boolean elimina (int key, Cuenta obj){
        return mapa.remove(key, obj);
    }
     
    public boolean modifica(int key, Cuenta obj){
       if(mapa.replace(key, obj) != null){
           return true;
       }
       return false;
    }
    
    public String listado(){
        StringBuffer sb = new StringBuffer();
        for(Cuenta c: mapa.values()){
            sb.append(c.getIdServicio());
            sb.append(", ");
            sb.append(Utilerias.convierteFecha(c.getFechaCont()));
            sb.append(", ");
            sb.append(c.getNoCuenta());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public boolean vacio(){
        return mapa.isEmpty();
    }
    
    public int tamanio(){
        return mapa.size();
    }
    
    public void llenaCuentas(String datos){
        String [] lines = datos.split("\n");
        for (String line : lines) {
            String[] dato = line.split(",");
            int nocuenta = Integer.parseInt(dato[0]);
            int noserv = Integer.parseInt(dato[2]);
            String [] fecha = dato[1].split("-");          
            GregorianCalendar cal = new GregorianCalendar(Integer.parseInt(fecha[2]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[0]));
            Cuenta c = new Cuenta(nocuenta, noserv, cal);
            agrega(c.getNoCuenta(), c);
        }
    }
}
