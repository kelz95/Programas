/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Alumno
 */
public class ArregloBidimensional {
     public static void main(String[] args) {
        int [][] arregloEntero = new int [10][10];
        int n = 1;
        for(int i=0; i<10; i++)
        {
            for (int j=0; j<10; j++)
            {
            arregloEntero[i][j]=n;
            n++;
            System.out.print("\t" + arregloEntero[i][j]);
            }
        
        System.out.println("");
        }
     }
}
