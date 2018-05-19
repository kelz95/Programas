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
public class Imprimir {
    public void Imprime()
    {
        for(int i=0; i<10; i++)
        {
            for (int j=0; j<10; j++)
            {
            System.out.print("\t" + MainP.arreglo[i][j]);
            }
        System.out.println("");
        }
    }
}
