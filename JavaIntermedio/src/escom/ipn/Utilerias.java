/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escom.ipn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author alumno
 */
public class Utilerias {
    private static final float DOLLAR = 19.50F;
    private static final String TIPO = "VENCIDO";
    private static final Utilerias instance = new Utilerias();
    private static final String separador = System.getProperty("file.separator");
    private static final String ruta = System.getProperty("user.dir");    
    
    private Utilerias(){};
    public static Utilerias getInstance(){
        return instance;
    }
    
    public static String convierteFecha(Calendar cal){
        int a = cal.get(Calendar.YEAR);
        int m = cal.get(Calendar.MONTH);
        int d = cal.get(Calendar.DAY_OF_MONTH);
                
        return d + "-" + (m + 1) + "-" + a;
    }
    
    public static Calendar convierteString(String fecha){
        String[] datos = fecha.split("-");
        int anio = Integer.parseInt(datos[0]);
        int mes = Integer.parseInt(datos[1]);
        int dia = Integer.parseInt(datos[2]);                
        return new GregorianCalendar(anio, mes-1, dia);
    }
    
    public static String leeArchivoTexto(String arch){
        StringBuffer sb = new StringBuffer();
        String linea = "";
        FileReader file = null;
        BufferedReader buf = null;
        try {
            file = new FileReader(arch);
            buf = new BufferedReader(file);
            while((linea = buf.readLine()) != null){
                sb.append(linea);
                sb.append("\n");
            }
                    
        } catch (Exception e) {
            System.out.println("hubo un error");
        } finally {
            try{
                file.close();
                buf.close();
            } catch(IOException ex){
                System.out.println("mensaje");
            }
        }
        
        return sb.toString();
    }
    
    public static void guardaArchivoTexto(String datos, String arch){
        BufferedWriter buf = null;
        FileWriter file = null;
        try {
            file = new FileWriter(ruta + separador + arch, true);
            buf = new BufferedWriter(file);
            buf.write(datos);
            buf.flush();
            buf.close();
        } catch (IOException iOException) {
            System.out.println("hubo un error");
        } finally {
            try{
                buf.close();
                file.close();
            } catch (IOException ex){
                System.out.println("No se pudieron cerrar los flujos");
            }
        }
    }
    
    
    
            
            
            
            
            
}
