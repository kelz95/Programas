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
public class Utilerias {
    private static final float DOLAR = 19.50F;
    private static final String TIPO = "VENCIDO";
    private static final Utilerias instance = new Utilerias();

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
}
