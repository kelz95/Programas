/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintermedio;

import java.util.Calendar;

/**
 *
 * @author alumno
 */
public class PrestamoBD implements Almacenamiento{
    private BaseDatos bd = new BaseDatos();
    private String url = "";
    private String user = "";
    private String password = "";

    public PrestamoBD (String url, String user, String password){
        if(url.isEmpty() && user.isEmpty() && password.isEmpty()) {
            System.out.println("params vacios");
        }else{
            this.url = url;
            this.user = user;
            this.password = password;
        }
            
    }
    
    public BaseDatos getBd() {
        return bd;
    }

    public void setBd(BaseDatos bd) {
        this.bd = bd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    @Override
    public boolean agregar(Object o) {
        Prestamo p =(Prestamo) o;
        String noc1 = p.getC1().getNoCliente();
        int id = p.getIdServicio();
        String fc = Utilerias.convierteFecha(p.getFechaCont());
        float monto = p.getMonto();
        String vig = Utilerias.convierteFecha(p.getVigencia());
        String sent = " insert into prestamo values("+ id + ",'" + fc + "'," + monto + ",'" + vig + "','" + noc1 + "')";        
        return bd.actualiza(sent) >=0;
    }

    @Override
    public boolean elimina(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean elimina(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object busqueda(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object busqueda(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modifica(int id, Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modifica(Object elem, Object nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int tamanio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean vacio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
