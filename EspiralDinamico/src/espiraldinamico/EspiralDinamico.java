/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espiraldinamico;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class EspiralDinamico {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int conta=1;
        Metodos met1 = new Metodos();
        String tamano = JOptionPane.showInputDialog("Ingresa el tamaño: ");
        Integer tam = Integer.parseInt(tamano);
               
   
        for(int i=0; i <= tam/2; i++){
            conta = met1.metodo1(i, conta);
            conta = met1.metodo2(i, conta);
            conta = met1.metodo3(i, conta);
            conta = met1.metodo4(i, conta); 
        }
        met1.Imprime();
        //JOptionPane.showMessageDialog(null, "Hello " + tamano);
    }
    
}
