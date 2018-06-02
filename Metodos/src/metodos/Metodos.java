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
    public int metodo1(int x, int cont) {
        for (int a=0+x; a<10-x; a++)
            {
                MainP.arreglo[x][a] = cont;
                cont++;     
            }
        return cont;
    }
    public int metodo2(int x, int cont) {
        for (int a=1+x; a<9-x; a++)
            {
                MainP.arreglo[a][9-x] = cont;
                cont++;     
            }
        return cont;
    }
    public int metodo3(int x, int cont) {
        for (int a=9-x; a>=0+x; a--)
            {
                MainP.arreglo[9 - x][a] = cont;
                cont++;     
            }
        return cont;
    }
    public int metodo4(int x, int cont) {
        for (int a=8-x; a>x; a--)
            {
                MainP.arreglo[a][x] = cont;
                cont++;     
            }
        return cont;
    }
}
