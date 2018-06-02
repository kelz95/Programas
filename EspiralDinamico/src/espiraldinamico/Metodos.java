/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espiraldinamico;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Alumno
 */
public class Metodos {
    List<List<Integer>> arreglo = new ArrayList<List<Integer>>();
    ArrayList<Integer> a = new ArrayList<Integer>();

    public Metodos(Integer x, int contador) {
        for(int j=0; j<x; j++) //lista de lista de enteros
        {
            for(int i=0; i<x; i++)//lista de enteros
            {
                a.add(contador);  
            }
            arreglo.add(a);
        }        
    }
    
    public int metodo1(int x, int cont) {//de izquiera a derecha
        for (int b=0+x; b <= a.size()- x; b++)
            {
                a.set(b, cont);
                cont++;     
            }
        return cont;
    }
    public int metodo2(int x, int cont) {
        for (int b=1+x; b < a.size() - x; b++)
            {
                List<Integer> aux = new ArrayList<Integer>();
                aux = arreglo.get(b);
                aux.set(aux.size()-1, cont);
                arreglo.set(b, aux);               
                cont++;     
            }
        return cont;
    }
    public int metodo3(int x, int cont) {
        for (int b=9-x; b>=0+x; b--)
            {
                arreglo[9 - x][b] = cont;
                cont++;     
            }
        return cont;
    }
    public int metodo4(int x, int cont) {
        for (int b=8-x; b>x; b--)
            {
                arreglo[b][x] = cont;
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
