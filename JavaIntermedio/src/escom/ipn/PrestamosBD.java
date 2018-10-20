/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escom.ipn;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class PrestamosBD implements Almacenamiento{
    private BaseDatos bd = new BaseDatos();
    private String url = "";
    private String user = "";
    private String password = "";

    public PrestamosBD(String url, String user, String pwd) {
        if(!url.isEmpty() && !user.isEmpty()){
            this.url = url;
            this.user = user;
            this.password = pwd;
            bd.conexion(url, user, pwd);
        }
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
        Prestamo p = (Prestamo)o;
        String nocl = p.getCl().getNoCliente();
        int id = p.getIdServicio();
        String fc = Utilerias.convierteFecha(p.getFechaCont());
        float monto = p.getMonto();
        String vig = Utilerias.convierteFecha(p.getVigencia());
        String sent = "insert into prestamo values("
        + id + ",\'" + fc + "\', " + monto + ", \'" + 
        vig + "\', \'" + nocl + "\')";
        if(bd.actualiza(sent) >= 0){
            return true;
        }
        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean agregar(String nocl, int id, String fc, float mon, 
            String fechaVig){
        String sent = "insert into prestamo(idPrestamo, fechaContrata,"
                + " monto, vigencia, idcliente ) values("
        + id + ",\'" + fc + "\', " + mon + ", \'" + 
        fechaVig + "\', \'" + nocl + "\')";
        if(bd.actualiza(sent) >= 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean elimina(int index) {
        String sent = "delete from prestamo where idprestamo = " + index;
        if(bd.actualiza(sent) > 0){
            return true;
        }
        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean elimina(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object busqueda(int index) {
        String sent = "select * from prestamo where idprestamo = " + index;
        return bd.salidaCSV(bd.consulta(sent));
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object busqueda(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modifica(int index, Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modifica(Object elem, Object nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean modifica(String nocl, int id, String fc, float mon, 
            String fechaVig){
        String sent = "update prestamo set fechaContrata = \'" + fc
                + "\', monto = " + mon + ", vigencia = \'" + fechaVig +
                "\' where idcliente = " + nocl;
        if(bd.actualiza(sent) > 0 ){
            return true;
        }
        return false;
    }

    @Override
    public int tamanio() {
        String sent = "select count(*) as result from prestamo";
        String[] datos = bd.salidaCSV(bd.consulta(sent)).split("\n");
        return Integer.parseInt(datos[1]);
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean vacio() {
        String sent = "select count(*) as result from prestamo";
        String[] datos = bd.salidaCSV(bd.consulta(sent)).split("\n");
        if(Integer.parseInt(datos[1]) > 0 ){
            return false;
        }
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listado() {
        String sent = "select * from prestamo, cliente "
                + "where cliente.nocliente = prestamo.idcliente";
        return bd.salidaCSV(bd.consulta(sent));
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void desconecta(){
        try {
            bd.desconecta();
        } catch (SQLException ex) {
            ex.printStackTrace();
            //Logger.getLogger(PrestamosBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
