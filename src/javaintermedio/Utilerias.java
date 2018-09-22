/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintermedio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.Calendar;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Utilerias {
    private static final float DOLAR = 19.50F;
    private static final String TIPO = "VENCIDO";
    private static final Utilerias instance = new Utilerias();
    private static final String separador = System.getProperty("file.separator");
    private static final String ruta = System.getProperty("user.dir");

    public Utilerias() {
     
    }
    public static Utilerias getInstance(){
        return instance;

    }
    
    public static String convierteFecha(Calendar cal){

        int a = cal.get(Calendar.YEAR);
        int m = cal.get(Calendar.MONTH);
        int d = cal.get(Calendar.DAY_OF_MONTH);
        return d + "-" + (m+1) + "-" + a;
    }
    public static String leerArchivoTexto(String arch){
        StringBuffer sb = new StringBuffer();
        String line = null;
        FileReader file = null;
        BufferedReader buf = null; 
        try {      
            file = new FileReader(arch);
            buf = new BufferedReader(file); 
            while((line = buf.readLine()) != null){
                sb.append(line);
                sb.append("\n");
            }
        } catch (Exception e) {
            System.out.println("Hubo un error");
        }finally{
            try{
                file.close();
                buf.close();
            }catch(IOException e){
                System.out.println("No se pudieron cerrar los ficheros");
            }
        }
        
        return sb.toString();
    }
    
    public static void guardaArchivoTexto(String datos, String arch){
        FileWriter file = null;
        BufferedWriter buf = null;
        try {
            file = new FileWriter(ruta + separador + arch, true);
            buf = new BufferedWriter(file);
            buf.write(datos);
            buf.flush();
            buf.close();
        } catch (IOException IOException) {
            System.out.println("Hubo un error en la escritura");
            // Logger.getLogger(Utilerias.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                buf.close();
            }catch(IOException ex){
                System.out.println("No se pudieron cerrar los flujos");
            }
        }
        
    }
}
