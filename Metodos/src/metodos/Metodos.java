/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Alumno
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    static int[][] arreglo = new int [10][10];
    public static void main(String[] args) {
        // TODO code application logic here 
        int conta=1;
        for(int i=0; i<=5; i++){
            conta=metodo1(i, conta);
            //conta=metodo2(i, conta);
            //conta=metodo3(i, conta);
            //conta=metodo4(i, conta); 
        }
        Imprime();
    }

    public static int metodo1(int x, int cont) {
        
        for (int a=0+x; a<10-x; a++)
            {
                arreglo[x][a] = cont;
                cont++;     
            }
        return cont;
    }
    
    public static void Imprime(){
        for(int i=0; i<10; i++)
        {
            for (int j=0; j<10; j++)
            {
            System.out.print("\t" + arreglo[i][j]);
            }
        System.out.println("");
        }
    }
    
}
