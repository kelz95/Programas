/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintermedio;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class BaseDatos {
    Connection con = null;
    public boolean conexion(String url,String user, String password){     
        try {
            con = (Connection) DriverManager.getConnection(url, user, password);
            if(con != null){
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ResultSet consulta(String consulta){
        try {
            Statement st = con.createStatement();
            ResultSet rs =st.executeQuery(consulta);
            
            if(rs != null){
                return rs;
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int actualiza(String sentencia){
        int result = -1;
        try {
            Statement st = con.createStatement();
            result =st.executeUpdate(sentencia);

        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;     
    }
  
    public String salidaCSV(ResultSet rs){
        String salida = "";
        int columnas;
        
        try {
            columnas = rs.getMetaData().getColumnCount();
            for (int i = 1; i <= columnas; i++) {
               salida += rs.getMetaData().getColumnName(i) + ", ";
            }
            salida = salida.substring(0, salida.length()-1) + '\n';
            while (rs.next()) {
                for (int i = 1; i <= columnas; i++) {
                    String dato = rs.getString(i);
                    salida = salida + dato + ", ";
                }
                salida = salida + "\n";
            }
        } catch (SQLException sQLException) {
            sQLException.printStackTrace();
        }
        return salida;
    }
}
