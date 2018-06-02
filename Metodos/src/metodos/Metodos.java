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
    int[][] arreglo = new int [10][10];
    public int metodo1(int x, int cont) {
        for (int a=0+x; a<=9-x; a++)
            {
                arreglo[x][a] = cont;
                cont++;     
            }
        return cont;
    }
    public int metodo2(int x, int cont) {
        for (int a=1+x; a<9-x; a++)
            {
                arreglo[a][9-x] = cont;
                cont++;     
            }
        return cont;
    }
    public int metodo3(int x, int cont) {
        for (int a=9-x; a>=0+x; a--)
            {
                arreglo[9 - x][a] = cont;
                cont++;     
            }
        return cont;
    }
    public int metodo4(int x, int cont) {
        for (int a=8-x; a>x; a--)
            {
                arreglo[a][x] = cont;
                cont++;     
            }
        return cont;
    }
    public void Imprime()
    {
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
