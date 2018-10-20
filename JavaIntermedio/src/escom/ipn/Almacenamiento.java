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
public interface Almacenamiento {
    
    public boolean agregar(Object o);
    public boolean elimina(int index);
    public boolean elimina(Object o);
    public Object busqueda(int index);
    public Object busqueda(Object o);
    public boolean modifica(int index, Object o);
    public boolean modifica(Object elem, Object nuevo);
    public int tamanio();
    public boolean vacio();
    public String listado();
    
}
