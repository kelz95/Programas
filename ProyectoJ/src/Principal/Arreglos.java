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
public class Arreglos {
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
        
        
        
        /*for(int i=0; i<20; i++)
        {
            arregloEntero[i]=i*3;
            if(arregloEntero[i]%2 != 0)
            System.out.println(arregloEntero[i]);       
        }*/
        
        
        
        //System.out.println(arregloEntero[2]);
        /*for(int i=0; i<5; i++)
        {
            if(i%2 != 0)
            
            System.out.println(arregloEntero[i]);
            
        }
        System.out.println("Termino el for");*/
    }
}
