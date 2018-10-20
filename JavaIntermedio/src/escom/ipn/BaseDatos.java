/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escom.ipn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author alumno
 */
public class BaseDatos implements Runnable{
    Connection con = null;
    
    public boolean conexion(String url, String user, String password){
        try {
            con = DriverManager.getConnection(url, user, password);
            if(con != null){
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public ResultSet consulta(String consulta){
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            if (rs != null) {
                return rs;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public int actualiza(String sentencia){
        int result = -1;
        try {
            Statement st = con.createStatement();
            result = st.executeUpdate(sentencia);
        } catch (SQLException sQLException) {
            sQLException.printStackTrace();
        }
        
        return result;
    }
    
    public String salidaCSV(ResultSet rs){
        String salida = "";
        int columnas;
        
        try {
            columnas = rs.getMetaData().getColumnCount();
            for (int i = 1; i <= columnas; i++) {
                salida += rs.getMetaData().getColumnName(i)
                        + ",";
            }
            salida = salida.substring(0, salida.length() -1)
                    + '\n';
            while (rs.next()) {
                for (int i = 1; i <= columnas; i++) {
                    String dato = rs.getString(i);
                    salida = salida + dato + ",";
                    
                }
                salida = salida.substring(0, salida.length()-1) + '\n';
            }
        } catch (SQLException sQLException) {
        }
        
        return salida;
    }
    
    public void desconecta() throws SQLException{
        con.close();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() +
                " -> " + Thread.currentThread().getName());
    }
}
