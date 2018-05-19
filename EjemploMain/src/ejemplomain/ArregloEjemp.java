/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomain;

/**
 *
 * @author Alumno
 */
public class ArregloEjemp {
    public static void main(String[] args) {
        char [][] tringulo2 = new char [10][10];
        //CON FOR
        /*for(int x=0; x<10; x++)
           {
               for (int y=0; y<=x; y++)
               {                  
                   tringulo2[x][y] = '*';    
               }          
           }*/
        
        //CON WHILE
        int x=0;
        while(x<10)
        {
            int y=0;
            while(y<=x)
            {
               tringulo2[x][y] = '*';
               y++;                   
            }
            x++;
        }
        
        for(int i=0; i<10; i++)
        {
            for (int j=0; j<10; j++)
            {
                System.out.print("\t" + tringulo2[i][j]);
            }
            System.out.println("");
        }         
     }
}
