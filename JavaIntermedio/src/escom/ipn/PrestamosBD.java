/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escom.ipn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class PrestamosBD extends Thread implements Almacenamiento  {
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
        String sent = "insert into prestamo(id_prestamo, fecha_contrata,"
                + " monto, vigencia, nocliente ) values("
        + id + ",\'" + fc + "\', " + mon + ", \'" + 
        fechaVig + "\', \'" + nocl + "\')";
        if(bd.actualiza(sent) >= 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean elimina(int index) {
        String sent = "delete from prestamo where id_prestamo = " + index;
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
        String sent = "select * from prestamo where id_prestamo = " + index;
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
        String sent = "update prestamo set fecha_contrata = \'" + fc
                + "\', monto = " + mon + ", vigencia = \'" + fechaVig +
                "\' where nocliente = " + nocl;
        return bd.actualiza(sent) > 0;
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
        return Integer.parseInt(datos[1]) <= 0;
    }

    @Override
    public String listado() {
        String sent = "select * from prestamo, cliente "
                + "where cliente.nocliente = prestamo.nocliente";
        return bd.salidaCSV(bd.consulta(sent));
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Object[][] matriz() {
        String sent = "select nocliente, id_prestamo, fecha_contrata,monto,vigencia from prestamo";
        ResultSet p = bd.consulta(sent);
        Object[] ren = new Object[5];
        Object[][] sal = new Object[5][100];
        int i = 0;
        try{
            while (p.next()){
                String idc = p.getString(1);
                String idp = p.getString(2);
                String fecha = p.getString(3);
                String monto = p.getString(4);
                String vig = p.getString(5);
                ren[0] = idc;
                ren[1] = idp;
                ren[2] = fecha;
                ren[3] = monto;
                ren[4] = vig;
                sal[i] = ren;
                i++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return sal;
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
    
    @Override
    public void run(){
        System.out.println("Info -> "
                + this.getId() + " ... "
                + this.getName());
    }
    
}
