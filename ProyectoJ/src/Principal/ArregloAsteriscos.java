/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author abi-r
 */
public class ArregloAsteriscos {
    public static void main(String[] args) {
        char [][] tringulo1 = new char [10][10];
        char [][] tringulo2 = new char [10][10];
        char [][] tringulo3 = new char [10][10];
        char [][] tringulo4 = new char [10][10];
        
        //TRIANGULO 1
        for(int x=0; x<10; x++)
        {
            for (int y=0; y<10-x; y++)
            {
                tringulo1[x][y] = '*';
                //System.out.print("\t *");
                //System.out.print(x);
                //System.out.print(y);
            } 
            //System.out.println("");
        }
        for(int i=0; i<10; i++)
        {
            for (int j=0; j<10; j++)
            {
                System.out.print("\t" + tringulo1[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        
        //TRIANGULO 2

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
                System.out.print("\t" + tringulo2[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        
        
        //TRIANGULO 3
        for(int x=0; x<10; x++)
        {
            for (int y=x; y<10; y++)
            {
                tringulo3[x][y] = '*';
                //System.out.print("\t *");
                //System.out.print(x);
                //System.out.print(y);
            } 
            //System.out.println("");
        }
        
        for(int i=0; i<10; i++)
        {
            for (int j=0; j<10; j++)
            {
                System.out.print("\t" + tringulo3[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("");
        
         //TRIANGULO 4
        for(int x=0; x<10; x++)
        {
            for (int y=9; y>=9-x; y--)
            {
                tringulo4[x][y] = '*';
                //System.out.print("\t *");
                //System.out.print(x);
                //System.out.print(y);
            } 
            //System.out.println("");
        }
        
        for(int i=0; i<10; i++)
        {
            for (int j=0; j<10; j++)
            {
                System.out.print("\t" + tringulo4[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("");
    }
}
