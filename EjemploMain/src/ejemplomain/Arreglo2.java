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
public class Arreglo2 {
    
        public void Derecha()
        {

        char [][] tringulo2 = new char [10][10];
         for(int x=0; x<10; x++)
           {
               for (int y=0; y<=x; y++)
               {
                   //System.out.print("\t *");
                   tringulo2[x][y] = '*';
                   //System.out.print("\t" + arregloEntero[x][y]);
                   //System.out.print(x);
                   //System.out.print(y); 
               }
               //System.out.println("");
           }     
           for(int i=0; i<10; i++)
           {
               for (int j=0; j<10; j++)
               {
                   System.out.print("\t" + tringulo2[j][i]);
               }
               System.out.println("");
           }
     }
}
