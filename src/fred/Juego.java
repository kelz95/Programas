/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Alumno
 */
public class Juego extends javax.swing.JFrame {
     ArrayList<Integer> lista = new ArrayList<Integer>();
        int puntos = 0; 
        int siguiente = 0;
        int tiempo = 600;
        int puntosRes = 0;
    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        jButton1.setBackground(Color.black);
        jButton2.setBackground(Color.black);
        jButton3.setBackground(Color.black);
        jButton4.setBackground(Color.black);
        jButton5.setBackground(Color.black);
        jButton6.setBackground(Color.black);
        jButton7.setBackground(Color.black);
        jButton8.setBackground(Color.black);
        jButton9.setBackground(Color.black);
        jButton10.setBackground(Color.black);
        jButton11.setBackground(Color.black);
        jButton12.setBackground(Color.black);
        bRepetir.setEnabled(false);
       
        bIniciar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                setEnabled(false);
                Thread hilo = new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            bRepetir.setEnabled(true);
                            puntos = 0;
                            siguiente = 0;
                            tiempo = 600;
                            int numAleatorio = (int) (Math.random()*12+1);
                            lista.clear();
                            lista.add(numAleatorio);
                            String p = Integer.toString(puntos);
                            jTextField1.setText(p);
                            
                            switch(lista.get(siguiente))
                            {
                                case 1: 
                                    jButton1.setBackground(Color.BLUE);
                                    Thread.sleep(tiempo);
                                    jButton1.setBackground(Color.BLACK);
                                    break;
                                case 2: 
                                    jButton2.setBackground(Color.RED);
                                    Thread.sleep(tiempo);
                                    jButton2.setBackground(Color.BLACK);
                                    break;
                                case 3: 
                                    jButton3.setBackground(Color.GREEN);
                                    Thread.sleep(tiempo);
                                    jButton3.setBackground(Color.BLACK);
                                    break;
                                case 4: 
                                    jButton4.setBackground(Color.CYAN);
                                    Thread.sleep(tiempo);
                                    jButton4.setBackground(Color.BLACK);
                                    break;
                                case 5: 
                                    jButton5.setBackground(Color.LIGHT_GRAY);
                                    Thread.sleep(tiempo);
                                    jButton5.setBackground(Color.BLACK);
                                    break;
                                case 6: 
                                    jButton6.setBackground(Color.YELLOW);
                                    Thread.sleep(tiempo);
                                    jButton6.setBackground(Color.BLACK);
                                    break;
                                case 7: 
                                    jButton7.setBackground(Color.MAGENTA);
                                    Thread.sleep(tiempo);
                                    jButton7.setBackground(Color.BLACK);
                                    break;
                                case 8: 
                                    jButton8.setBackground(Color.ORANGE);
                                    Thread.sleep(tiempo);
                                    jButton8.setBackground(Color.BLACK);
                                    break;
                                case 9: 
                                    jButton9.setBackground(Color.pink);
                                    Thread.sleep(tiempo);
                                    jButton9.setBackground(Color.BLACK);
                                    break;
                                case 10: 
                                    jButton10.setBackground(Color.WHITE);
                                    Thread.sleep(tiempo);
                                    jButton10.setBackground(Color.BLACK);
                                    break;
                                case 11: 
                                    jButton11.setBackground(Color.darkGray);
                                    Thread.sleep(tiempo);
                                    jButton11.setBackground(Color.BLACK);
                                    break;
                                case 12: 
                                    jButton12.setBackground(Color.GRAY);
                                    Thread.sleep(tiempo);
                                    jButton12.setBackground(Color.BLACK);
                                    break;                                                               
                            }
                                  
                        }
                        catch(InterruptedException ex)
                        {
                            
                        }
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                setEnabled(false);
                Thread hilo = new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            if(lista.get(siguiente)== 1)
                            {
                                if (puntos == 0)
                                {
                                    puntos = 1;
                                }
                                if((siguiente+1) == lista.size())
                                {
                                    puntos = puntos * 2;
                                }
                                if(siguiente == 0)//para no quedarnos sin tiempo
                                {
                                    tiempo = tiempo - 30;
                                }
                                jButton1.setBackground(Color.BLUE);
                                Thread.sleep(75);
                                jButton1.setBackground(Color.BLACK);
                                
                                String p = Integer.toString(puntos);
                                jTextField1.setText(p);

                                if(siguiente < lista.size() - 1) //para saber si podemos agregar otro elemento
                                {
                                    siguiente++;
                                    bRepetir.setEnabled(false);
                                }
                                else
                                {
                                    siguiente = 0;
                                    int numAleatorio = (int) (Math.random()*12+1);
                                    lista.add(numAleatorio);
                                    switch(numAleatorio)
                                    {
                                        case 1: 
                                            jButton1.setBackground(Color.BLUE);
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.BLACK);
                                            break;
                                        case 2: 
                                            jButton2.setBackground(Color.RED);
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.BLACK);
                                            break;
                                        case 3: 
                                            jButton3.setBackground(Color.GREEN);
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.BLACK);
                                            break;
                                        case 4: 
                                            jButton4.setBackground(Color.CYAN);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.BLACK);
                                            break;
                                        case 5: 
                                            jButton5.setBackground(Color.LIGHT_GRAY);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.BLACK);
                                            break;
                                        case 6: 
                                            jButton6.setBackground(Color.YELLOW);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.BLACK);
                                            break;
                                        case 7: 
                                            jButton7.setBackground(Color.MAGENTA);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.BLACK);
                                            break;
                                        case 8: 
                                            jButton8.setBackground(Color.ORANGE);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.BLACK);
                                            break;
                                        case 9: 
                                            jButton9.setBackground(Color.pink);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.BLACK);
                                            break;
                                        case 10: 
                                            jButton10.setBackground(Color.WHITE);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.BLACK);
                                            break;
                                        case 11: 
                                            jButton11.setBackground(Color.darkGray);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.BLACK);
                                            break;
                                        case 12: 
                                            jButton12.setBackground(Color.GRAY);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.BLACK);
                                            break;                                                             
                                    }
                                    bRepetir.setEnabled(true);
                                }
                                
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Te has equivocado, intenta de nuevo");
                                puntos = 0;
                                lista.removeAll(lista);
                                String p = "HAS PERDIDO";
                                jTextField1.setText(p);
                                bRepetir.setEnabled(false);
                            }
                        }     
                        catch(InterruptedException ex)
                        {

                        }
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                setEnabled(false);
                Thread hilo = new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            if(lista.get(siguiente)== 2)
                            {
                                if (puntos == 0)
                                {
                                    puntos = 1;
                                }
                                if((siguiente+1) == lista.size())
                                {
                                    puntos = puntos * 2;
                                }
                                if(siguiente == 0)//para no quedarnos sin tiempo
                                {
                                    tiempo = tiempo - 30;
                                }
                                jButton2.setBackground(Color.RED);
                                Thread.sleep(75);
                                jButton2.setBackground(Color.BLACK);
                                
                                String p = Integer.toString(puntos);
                                jTextField1.setText(p);

                                if(siguiente < lista.size() - 1) //para saber si podemos agregar otro elemento
                                {
                                    siguiente++;
                                    bRepetir.setEnabled(false);
                                }
                                else
                                {
                                    siguiente = 0;
                                    int numAleatorio = (int) (Math.random()*12+1);
                                    lista.add(numAleatorio);
                                    switch(numAleatorio)
                                    {
                                        case 1: 
                                            jButton1.setBackground(Color.BLUE);
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.BLACK);
                                            break;
                                        case 2: 
                                            jButton2.setBackground(Color.RED);
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.BLACK);
                                            break;
                                        case 3: 
                                            jButton3.setBackground(Color.GREEN);
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.BLACK);
                                            break;
                                        case 4: 
                                            jButton4.setBackground(Color.CYAN);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.BLACK);
                                            break;
                                        case 5: 
                                            jButton5.setBackground(Color.LIGHT_GRAY);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.BLACK);
                                            break;
                                        case 6: 
                                            jButton6.setBackground(Color.YELLOW);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.BLACK);
                                            break;
                                        case 7: 
                                            jButton7.setBackground(Color.MAGENTA);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.BLACK);
                                            break;
                                        case 8: 
                                            jButton8.setBackground(Color.ORANGE);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.BLACK);
                                            break;
                                        case 9: 
                                            jButton9.setBackground(Color.pink);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.BLACK);
                                            break;
                                        case 10: 
                                            jButton10.setBackground(Color.WHITE);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.BLACK);
                                            break;
                                        case 11: 
                                            jButton11.setBackground(Color.darkGray);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.BLACK);
                                            break;
                                        case 12: 
                                            jButton12.setBackground(Color.GRAY);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.BLACK);
                                            break;                                                             
                                    }
                                    bRepetir.setEnabled(true);
                                }
                                
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Te has equivocado, intenta de nuevo");
                                puntos = 0;
                                lista.removeAll(lista);
                                String p = "HAS PERDIDO";
                                jTextField1.setText(p);
                                bRepetir.setEnabled(false);
                            }
                        }     
                        catch(InterruptedException ex)
                        {

                        }
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                setEnabled(false);
                Thread hilo = new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            if(lista.get(siguiente)== 3)
                            {
                                if (puntos == 0)
                                {
                                    puntos = 1;
                                }
                                if((siguiente+1) == lista.size())
                                {
                                    puntos = puntos * 2;
                                }
                                if(siguiente == 0)//para no quedarnos sin tiempo
                                {
                                    tiempo = tiempo - 30;
                                }
                                jButton3.setBackground(Color.GREEN);
                                Thread.sleep(75);
                                jButton3.setBackground(Color.BLACK);
                                
                                String p = Integer.toString(puntos);
                                jTextField1.setText(p);

                                if(siguiente < lista.size() - 1) //para saber si podemos agregar otro elemento
                                {
                                    siguiente++;
                                    bRepetir.setEnabled(false);
                                }
                                else
                                {
                                    siguiente = 0;
                                    int numAleatorio = (int) (Math.random()*12+1);
                                    lista.add(numAleatorio);
                                    switch(numAleatorio)
                                    {
                                        case 1: 
                                            jButton1.setBackground(Color.BLUE);
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.BLACK);
                                            break;
                                        case 2: 
                                            jButton2.setBackground(Color.RED);
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.BLACK);
                                            break;
                                        case 3: 
                                            jButton3.setBackground(Color.GREEN);
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.BLACK);
                                            break;
                                        case 4: 
                                            jButton4.setBackground(Color.CYAN);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.BLACK);
                                            break;
                                        case 5: 
                                            jButton5.setBackground(Color.LIGHT_GRAY);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.BLACK);
                                            break;
                                        case 6: 
                                            jButton6.setBackground(Color.YELLOW);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.BLACK);
                                            break;
                                        case 7: 
                                            jButton7.setBackground(Color.MAGENTA);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.BLACK);
                                            break;
                                        case 8: 
                                            jButton8.setBackground(Color.ORANGE);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.BLACK);
                                            break;
                                        case 9: 
                                            jButton9.setBackground(Color.pink);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.BLACK);
                                            break;
                                        case 10: 
                                            jButton10.setBackground(Color.WHITE);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.BLACK);
                                            break;
                                        case 11: 
                                            jButton11.setBackground(Color.darkGray);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.BLACK);
                                            break;
                                        case 12: 
                                            jButton12.setBackground(Color.GRAY);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.BLACK);
                                            break;                                                             
                                    }
                                    bRepetir.setEnabled(true);
                                }
                                
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Te has equivocado, intenta de nuevo");
                                puntos = 0;
                                lista.removeAll(lista);
                                String p = "HAS PERDIDO";
                                jTextField1.setText(p);
                                bRepetir.setEnabled(false);
                            }
                        }     
                        catch(InterruptedException ex)
                        {

                        }
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                setEnabled(false);
                Thread hilo = new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            if(lista.get(siguiente)== 4)
                            {
                                if (puntos == 0)
                                {
                                    puntos = 1;
                                }
                                if((siguiente+1) == lista.size())
                                {
                                    puntos = puntos * 2;
                                }
                                if(siguiente == 0)//para no quedarnos sin tiempo
                                {
                                    tiempo = tiempo - 30;
                                }
                                jButton4.setBackground(Color.CYAN);
                                Thread.sleep(tiempo);
                                jButton4.setBackground(Color.BLACK);
                                
                                String p = Integer.toString(puntos);
                                jTextField1.setText(p);

                                if(siguiente < lista.size() - 1) //para saber si podemos agregar otro elemento
                                {
                                    siguiente++;
                                    bRepetir.setEnabled(false);
                                }
                                else
                                {
                                    siguiente = 0;
                                    int numAleatorio = (int) (Math.random()*12+1);
                                    lista.add(numAleatorio);
                                    switch(numAleatorio)
                                    {
                                        case 1: 
                                            jButton1.setBackground(Color.BLUE);
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.BLACK);
                                            break;
                                        case 2: 
                                            jButton2.setBackground(Color.RED);
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.BLACK);
                                            break;
                                        case 3: 
                                            jButton3.setBackground(Color.GREEN);
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.BLACK);
                                            break;
                                        case 4: 
                                            jButton4.setBackground(Color.CYAN);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.BLACK);
                                            break;
                                        case 5: 
                                            jButton5.setBackground(Color.LIGHT_GRAY);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.BLACK);
                                            break;
                                        case 6: 
                                            jButton6.setBackground(Color.YELLOW);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.BLACK);
                                            break;
                                        case 7: 
                                            jButton7.setBackground(Color.MAGENTA);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.BLACK);
                                            break;
                                        case 8: 
                                            jButton8.setBackground(Color.ORANGE);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.BLACK);
                                            break;
                                        case 9: 
                                            jButton9.setBackground(Color.pink);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.BLACK);
                                            break;
                                        case 10: 
                                            jButton10.setBackground(Color.WHITE);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.BLACK);
                                            break;
                                        case 11: 
                                            jButton11.setBackground(Color.darkGray);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.BLACK);
                                            break;
                                        case 12: 
                                            jButton12.setBackground(Color.GRAY);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.BLACK);
                                            break;                                                             
                                    }
                                    bRepetir.setEnabled(true);
                                }
                                
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Te has equivocado, intenta de nuevo");
                                puntos = 0;
                                lista.removeAll(lista);
                                String p = "HAS PERDIDO";
                                jTextField1.setText(p);
                                bRepetir.setEnabled(false);
                            }
                        }     
                        catch(InterruptedException ex)
                        {

                        }
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                setEnabled(false);
                Thread hilo = new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            if(lista.get(siguiente)== 5)
                            {
                                if (puntos == 0)
                                {
                                    puntos = 1;
                                }
                                if((siguiente+1) == lista.size())
                                {
                                    puntos = puntos * 2;
                                }
                                if(siguiente == 0)//para no quedarnos sin tiempo
                                {
                                    tiempo = tiempo - 30;
                                }
                                jButton5.setBackground(Color.LIGHT_GRAY);
                                Thread.sleep(75);
                                jButton5.setBackground(Color.BLACK);
                                
                                String p = Integer.toString(puntos);
                                jTextField1.setText(p);

                                if(siguiente < lista.size() - 1) //para saber si podemos agregar otro elemento
                                {
                                    siguiente++;
                                    bRepetir.setEnabled(false);
                                }
                                else
                                {
                                    siguiente = 0;
                                    int numAleatorio = (int) (Math.random()*12+1);
                                    lista.add(numAleatorio);
                                    switch(numAleatorio)
                                    {
                                        case 1: 
                                            jButton1.setBackground(Color.BLUE);
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.BLACK);
                                            break;
                                        case 2: 
                                            jButton2.setBackground(Color.RED);
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.BLACK);
                                            break;
                                        case 3: 
                                            jButton3.setBackground(Color.GREEN);
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.BLACK);
                                            break;
                                        case 4: 
                                            jButton4.setBackground(Color.CYAN);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.BLACK);
                                            break;
                                        case 5: 
                                            jButton5.setBackground(Color.LIGHT_GRAY);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.BLACK);
                                            break;
                                        case 6: 
                                            jButton6.setBackground(Color.YELLOW);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.BLACK);
                                            break;
                                        case 7: 
                                            jButton7.setBackground(Color.MAGENTA);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.BLACK);
                                            break;
                                        case 8: 
                                            jButton8.setBackground(Color.ORANGE);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.BLACK);
                                            break;
                                        case 9: 
                                            jButton9.setBackground(Color.pink);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.BLACK);
                                            break;
                                        case 10: 
                                            jButton10.setBackground(Color.WHITE);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.BLACK);
                                            break;
                                        case 11: 
                                            jButton11.setBackground(Color.darkGray);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.BLACK);
                                            break;
                                        case 12: 
                                            jButton12.setBackground(Color.GRAY);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.BLACK);
                                            break;                                                             
                                    }
                                    bRepetir.setEnabled(true);
                                }
                                
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Te has equivocado, intenta de nuevo");
                                puntos = 0;
                                lista.removeAll(lista);
                                String p = "HAS PERDIDO";
                                jTextField1.setText(p);
                                bRepetir.setEnabled(false);
                            }
                        }     
                        catch(InterruptedException ex)
                        {

                        }
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                setEnabled(false);
                Thread hilo = new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            if(lista.get(siguiente)== 6)
                            {
                                if (puntos == 0)
                                {
                                    puntos = 1;
                                }
                                if((siguiente+1) == lista.size())
                                {
                                    puntos = puntos * 2;
                                }
                                if(siguiente == 0)//para no quedarnos sin tiempo
                                {
                                    tiempo = tiempo - 30;
                                }
                                jButton6.setBackground(Color.YELLOW);
                                Thread.sleep(75);
                                jButton6.setBackground(Color.BLACK);
                                
                                String p = Integer.toString(puntos);
                                jTextField1.setText(p);

                                if(siguiente < lista.size() - 1) //para saber si podemos agregar otro elemento
                                {
                                    siguiente++;
                                    bRepetir.setEnabled(false);
                                }
                                else
                                {
                                    siguiente = 0;
                                    int numAleatorio = (int) (Math.random()*12+1);
                                    lista.add(numAleatorio);
                                    switch(numAleatorio)
                                    {
                                        case 1: 
                                            jButton1.setBackground(Color.BLUE);
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.BLACK);
                                            break;
                                        case 2: 
                                            jButton2.setBackground(Color.RED);
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.BLACK);
                                            break;
                                        case 3: 
                                            jButton3.setBackground(Color.GREEN);
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.BLACK);
                                            break;
                                        case 4: 
                                            jButton4.setBackground(Color.CYAN);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.BLACK);
                                            break;
                                        case 5: 
                                            jButton5.setBackground(Color.LIGHT_GRAY);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.BLACK);
                                            break;
                                        case 6: 
                                            jButton6.setBackground(Color.YELLOW);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.BLACK);
                                            break;
                                        case 7: 
                                            jButton7.setBackground(Color.MAGENTA);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.BLACK);
                                            break;
                                        case 8: 
                                            jButton8.setBackground(Color.ORANGE);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.BLACK);
                                            break;
                                        case 9: 
                                            jButton9.setBackground(Color.pink);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.BLACK);
                                            break;
                                        case 10: 
                                            jButton10.setBackground(Color.WHITE);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.BLACK);
                                            break;
                                        case 11: 
                                            jButton11.setBackground(Color.darkGray);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.BLACK);
                                            break;
                                        case 12: 
                                            jButton12.setBackground(Color.GRAY);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.BLACK);
                                            break;                                                             
                                    }
                                    bRepetir.setEnabled(true);
                                }
                                
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Te has equivocado, intenta de nuevo");
                                puntos = 0;
                                lista.removeAll(lista);
                                String p = "HAS PERDIDO";
                                jTextField1.setText(p);
                                bRepetir.setEnabled(false);
                            }
                        }     
                        catch(InterruptedException ex)
                        {

                        }
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                setEnabled(false);
                Thread hilo = new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            if(lista.get(siguiente)== 7)
                            {
                                if (puntos == 0)
                                {
                                    puntos = 1;
                                }
                                if((siguiente+1) == lista.size())
                                {
                                    puntos = puntos * 2;
                                }
                                if(siguiente == 0)//para no quedarnos sin tiempo
                                {
                                    tiempo = tiempo - 30;
                                }
                                jButton7.setBackground(Color.MAGENTA);
                                Thread.sleep(75);
                                jButton7.setBackground(Color.BLACK);
                                
                                String p = Integer.toString(puntos);
                                jTextField1.setText(p);

                                if(siguiente < lista.size() - 1) //para saber si podemos agregar otro elemento
                                {
                                    siguiente++;
                                    bRepetir.setEnabled(false);
                                }
                                else
                                {
                                    siguiente = 0;
                                    int numAleatorio = (int) (Math.random()*12+1);
                                    lista.add(numAleatorio);
                                    switch(numAleatorio)
                                    {
                                        case 1: 
                                            jButton1.setBackground(Color.BLUE);
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.BLACK);
                                            break;
                                        case 2: 
                                            jButton2.setBackground(Color.RED);
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.BLACK);
                                            break;
                                        case 3: 
                                            jButton3.setBackground(Color.GREEN);
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.BLACK);
                                            break;
                                        case 4: 
                                            jButton4.setBackground(Color.CYAN);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.BLACK);
                                            break;
                                        case 5: 
                                            jButton5.setBackground(Color.LIGHT_GRAY);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.BLACK);
                                            break;
                                        case 6: 
                                            jButton6.setBackground(Color.YELLOW);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.BLACK);
                                            break;
                                        case 7: 
                                            jButton7.setBackground(Color.MAGENTA);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.BLACK);
                                            break;
                                        case 8: 
                                            jButton8.setBackground(Color.ORANGE);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.BLACK);
                                            break;
                                        case 9: 
                                            jButton9.setBackground(Color.pink);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.BLACK);
                                            break;
                                        case 10: 
                                            jButton10.setBackground(Color.WHITE);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.BLACK);
                                            break;
                                        case 11: 
                                            jButton11.setBackground(Color.darkGray);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.BLACK);
                                            break;
                                        case 12: 
                                            jButton12.setBackground(Color.GRAY);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.BLACK);
                                            break;                                                             
                                    }
                                    bRepetir.setEnabled(true);
                                }
                                
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Te has equivocado, intenta de nuevo");
                                puntos = 0;
                                lista.removeAll(lista);
                                String p = "HAS PERDIDO";
                                jTextField1.setText(p);
                                bRepetir.setEnabled(false);
                            }
                        }     
                        catch(InterruptedException ex)
                        {

                        }
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                setEnabled(false);
                Thread hilo = new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            if(lista.get(siguiente)== 8)
                            {
                                if (puntos == 0)
                                {
                                    puntos = 1;
                                }
                                if((siguiente+1) == lista.size())
                                {
                                    puntos = puntos * 2;
                                }
                                if(siguiente == 0)//para no quedarnos sin tiempo
                                {
                                    tiempo = tiempo - 30;
                                }
                                jButton8.setBackground(Color.ORANGE);
                                Thread.sleep(75);
                                jButton8.setBackground(Color.BLACK);
                                
                                String p = Integer.toString(puntos);
                                jTextField1.setText(p);

                                if(siguiente < lista.size() - 1) //para saber si podemos agregar otro elemento
                                {
                                    siguiente++;
                                    bRepetir.setEnabled(false);
                                }
                                else
                                {
                                    siguiente = 0;
                                    int numAleatorio = (int) (Math.random()*12+1);
                                    lista.add(numAleatorio);
                                    switch(numAleatorio)
                                    {
                                        case 1: 
                                            jButton1.setBackground(Color.BLUE);
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.BLACK);
                                            break;
                                        case 2: 
                                            jButton2.setBackground(Color.RED);
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.BLACK);
                                            break;
                                        case 3: 
                                            jButton3.setBackground(Color.GREEN);
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.BLACK);
                                            break;
                                        case 4: 
                                            jButton4.setBackground(Color.CYAN);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.BLACK);
                                            break;
                                        case 5: 
                                            jButton5.setBackground(Color.LIGHT_GRAY);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.BLACK);
                                            break;
                                        case 6: 
                                            jButton6.setBackground(Color.YELLOW);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.BLACK);
                                            break;
                                        case 7: 
                                            jButton7.setBackground(Color.MAGENTA);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.BLACK);
                                            break;
                                        case 8: 
                                            jButton8.setBackground(Color.ORANGE);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.BLACK);
                                            break;
                                        case 9: 
                                            jButton9.setBackground(Color.pink);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.BLACK);
                                            break;
                                        case 10: 
                                            jButton10.setBackground(Color.WHITE);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.BLACK);
                                            break;
                                        case 11: 
                                            jButton11.setBackground(Color.darkGray);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.BLACK);
                                            break;
                                        case 12: 
                                            jButton12.setBackground(Color.GRAY);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.BLACK);
                                            break;                                                             
                                    }
                                    bRepetir.setEnabled(true);
                                }
                                
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Te has equivocado, intenta de nuevo");
                                puntos = 0;
                                lista.removeAll(lista);
                                String p = "HAS PERDIDO";
                                jTextField1.setText(p);
                                bRepetir.setEnabled(false);
                            }
                        }     
                        catch(InterruptedException ex)
                        {

                        }
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                setEnabled(false);
                Thread hilo = new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            if(lista.get(siguiente)== 9)
                            {
                                if (puntos == 0)
                                {
                                    puntos = 1;
                                }
                                if((siguiente+1) == lista.size())
                                {
                                    puntos = puntos * 2;
                                }
                                if(siguiente == 0)//para no quedarnos sin tiempo
                                {
                                    tiempo = tiempo - 30;
                                }
                                jButton9.setBackground(Color.pink);
                                Thread.sleep(75);
                                jButton9.setBackground(Color.BLACK);
                                
                                String p = Integer.toString(puntos);
                                jTextField1.setText(p);

                                if(siguiente < lista.size() - 1) //para saber si podemos agregar otro elemento
                                {
                                    siguiente++;
                                    bRepetir.setEnabled(false);
                                }
                                else
                                {
                                    siguiente = 0;
                                    int numAleatorio = (int) (Math.random()*12+1);
                                    lista.add(numAleatorio);
                                    switch(numAleatorio)
                                    {
                                        case 1: 
                                            jButton1.setBackground(Color.BLUE);
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.BLACK);
                                            break;
                                        case 2: 
                                            jButton2.setBackground(Color.RED);
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.BLACK);
                                            break;
                                        case 3: 
                                            jButton3.setBackground(Color.GREEN);
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.BLACK);
                                            break;
                                        case 4: 
                                            jButton4.setBackground(Color.CYAN);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.BLACK);
                                            break;
                                        case 5: 
                                            jButton5.setBackground(Color.LIGHT_GRAY);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.BLACK);
                                            break;
                                        case 6: 
                                            jButton6.setBackground(Color.YELLOW);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.BLACK);
                                            break;
                                        case 7: 
                                            jButton7.setBackground(Color.MAGENTA);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.BLACK);
                                            break;
                                        case 8: 
                                            jButton8.setBackground(Color.ORANGE);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.BLACK);
                                            break;
                                        case 9: 
                                            jButton9.setBackground(Color.pink);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.BLACK);
                                            break;
                                        case 10: 
                                            jButton10.setBackground(Color.WHITE);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.BLACK);
                                            break;
                                        case 11: 
                                            jButton11.setBackground(Color.darkGray);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.BLACK);
                                            break;
                                        case 12: 
                                            jButton12.setBackground(Color.GRAY);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.BLACK);
                                            break;                                                             
                                    }
                                    bRepetir.setEnabled(true);
                                }
                                
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Te has equivocado, intenta de nuevo");
                                puntos = 0;
                                lista.removeAll(lista);
                                String p = "HAS PERDIDO";
                                jTextField1.setText(p);
                                bRepetir.setEnabled(false);
                            }
                        }     
                        catch(InterruptedException ex)
                        {

                        }
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton10.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                setEnabled(false);
                Thread hilo = new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            if(lista.get(siguiente)== 10)
                            {
                                if (puntos == 0)
                                {
                                    puntos = 1;
                                }
                                if((siguiente+1) == lista.size())
                                {
                                    puntos = puntos * 2;
                                }
                                if(siguiente == 0)//para no quedarnos sin tiempo
                                {
                                    tiempo = tiempo - 30;
                                }
                                jButton10.setBackground(Color.WHITE);
                                Thread.sleep(75);
                                jButton10.setBackground(Color.BLACK);
                                
                                String p = Integer.toString(puntos);
                                jTextField1.setText(p);

                                if(siguiente < lista.size() - 1) //para saber si podemos agregar otro elemento
                                {
                                    siguiente++;
                                    bRepetir.setEnabled(false);
                                }
                                else
                                {
                                    siguiente = 0;
                                    int numAleatorio = (int) (Math.random()*12+1);
                                    lista.add(numAleatorio);
                                    switch(numAleatorio)
                                    {
                                        case 1: 
                                            jButton1.setBackground(Color.BLUE);
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.BLACK);
                                            break;
                                        case 2: 
                                            jButton2.setBackground(Color.RED);
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.BLACK);
                                            break;
                                        case 3: 
                                            jButton3.setBackground(Color.GREEN);
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.BLACK);
                                            break;
                                        case 4: 
                                            jButton4.setBackground(Color.CYAN);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.BLACK);
                                            break;
                                        case 5: 
                                            jButton5.setBackground(Color.LIGHT_GRAY);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.BLACK);
                                            break;
                                        case 6: 
                                            jButton6.setBackground(Color.YELLOW);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.BLACK);
                                            break;
                                        case 7: 
                                            jButton7.setBackground(Color.MAGENTA);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.BLACK);
                                            break;
                                        case 8: 
                                            jButton8.setBackground(Color.ORANGE);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.BLACK);
                                            break;
                                        case 9: 
                                            jButton9.setBackground(Color.pink);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.BLACK);
                                            break;
                                        case 10: 
                                            jButton10.setBackground(Color.WHITE);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.BLACK);
                                            break;
                                        case 11: 
                                            jButton11.setBackground(Color.darkGray);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.BLACK);
                                            break;
                                        case 12: 
                                            jButton12.setBackground(Color.GRAY);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.BLACK);
                                            break;                                                             
                                    }
                                    bRepetir.setEnabled(true);
                                }
                                
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Te has equivocado, intenta de nuevo");
                                puntos = 0;
                                lista.removeAll(lista);
                                String p = "HAS PERDIDO";
                                jTextField1.setText(p);
                                bRepetir.setEnabled(false);
                            }
                        }     
                        catch(InterruptedException ex)
                        {

                        }
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton11.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                setEnabled(false);
                Thread hilo = new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            if(lista.get(siguiente)== 11)
                            {
                                if (puntos == 0)
                                {
                                    puntos = 1;
                                }
                                if((siguiente+1) == lista.size())
                                {
                                    puntos = puntos * 2;
                                }
                                if(siguiente == 0)//para no quedarnos sin tiempo
                                {
                                    tiempo = tiempo - 30;
                                }
                                jButton11.setBackground(Color.darkGray);
                                Thread.sleep(75);
                                jButton11.setBackground(Color.BLACK);
                                
                                String p = Integer.toString(puntos);
                                jTextField1.setText(p);

                                if(siguiente < lista.size() - 1) //para saber si podemos agregar otro elemento
                                {
                                    siguiente++;
                                    bRepetir.setEnabled(false);
                                }
                                else
                                {
                                    siguiente = 0;
                                    int numAleatorio = (int) (Math.random()*12+1);
                                    lista.add(numAleatorio);
                                    switch(numAleatorio)
                                    {
                                        case 1: 
                                            jButton1.setBackground(Color.BLUE);
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.BLACK);
                                            break;
                                        case 2: 
                                            jButton2.setBackground(Color.RED);
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.BLACK);
                                            break;
                                        case 3: 
                                            jButton3.setBackground(Color.GREEN);
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.BLACK);
                                            break;
                                        case 4: 
                                            jButton4.setBackground(Color.CYAN);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.BLACK);
                                            break;
                                        case 5: 
                                            jButton5.setBackground(Color.LIGHT_GRAY);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.BLACK);
                                            break;
                                        case 6: 
                                            jButton6.setBackground(Color.YELLOW);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.BLACK);
                                            break;
                                        case 7: 
                                            jButton7.setBackground(Color.MAGENTA);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.BLACK);
                                            break;
                                        case 8: 
                                            jButton8.setBackground(Color.ORANGE);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.BLACK);
                                            break;
                                        case 9: 
                                            jButton9.setBackground(Color.pink);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.BLACK);
                                            break;
                                        case 10: 
                                            jButton10.setBackground(Color.WHITE);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.BLACK);
                                            break;
                                        case 11: 
                                            jButton11.setBackground(Color.darkGray);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.BLACK);
                                            break;
                                        case 12: 
                                            jButton12.setBackground(Color.GRAY);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.BLACK);
                                            break;                                                             
                                    }
                                    bRepetir.setEnabled(true);
                                }
                                
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Te has equivocado, intenta de nuevo");
                                puntos = 0;
                                lista.removeAll(lista);
                                String p = "HAS PERDIDO";
                                jTextField1.setText(p);
                                bRepetir.setEnabled(false);
                            }
                        }     
                        catch(InterruptedException ex)
                        {

                        }
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        jButton12.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                setEnabled(false);
                Thread hilo = new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            if(lista.get(siguiente)== 12)
                            {
                                if (puntos == 0)
                                {
                                    puntos = 1;
                                }
                                if((siguiente+1) == lista.size())
                                {
                                    puntos = puntos * 2;
                                }
                                if(siguiente == 0)//para no quedarnos sin tiempo
                                {
                                    tiempo = tiempo - 30;
                                }
                                jButton12.setBackground(Color.GRAY);
                                Thread.sleep(75);
                                jButton12.setBackground(Color.BLACK);
                                
                                String p = Integer.toString(puntos);
                                jTextField1.setText(p);

                                if(siguiente < lista.size() - 1) //para saber si podemos agregar otro elemento
                                {
                                    siguiente++;
                                    bRepetir.setEnabled(false);
                                }
                                else
                                {
                                    siguiente = 0;
                                    int numAleatorio = (int) (Math.random()*12+1);
                                    lista.add(numAleatorio);
                                    switch(numAleatorio)
                                    {
                                        case 1: 
                                            jButton1.setBackground(Color.BLUE);
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.BLACK);
                                            break;
                                        case 2: 
                                            jButton2.setBackground(Color.RED);
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.BLACK);
                                            break;
                                        case 3: 
                                            jButton3.setBackground(Color.GREEN);
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.BLACK);
                                            break;
                                        case 4: 
                                            jButton4.setBackground(Color.CYAN);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.BLACK);
                                            break;
                                        case 5: 
                                            jButton5.setBackground(Color.LIGHT_GRAY);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.BLACK);
                                            break;
                                        case 6: 
                                            jButton6.setBackground(Color.YELLOW);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.BLACK);
                                            break;
                                        case 7: 
                                            jButton7.setBackground(Color.MAGENTA);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.BLACK);
                                            break;
                                        case 8: 
                                            jButton8.setBackground(Color.ORANGE);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.BLACK);
                                            break;
                                        case 9: 
                                            jButton9.setBackground(Color.pink);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.BLACK);
                                            break;
                                        case 10: 
                                            jButton10.setBackground(Color.WHITE);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.BLACK);
                                            break;
                                        case 11: 
                                            jButton11.setBackground(Color.darkGray);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.BLACK);
                                            break;
                                        case 12: 
                                            jButton12.setBackground(Color.GRAY);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.BLACK);
                                            break;                                                             
                                    }
                                    bRepetir.setEnabled(true);
                                }
                                
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Te has equivocado, intenta de nuevo");
                                puntos = 0;
                                lista.removeAll(lista);
                                String p = "HAS PERDIDO";
                                jTextField1.setText(p);
                                bRepetir.setEnabled(false);
                            }
                        }     
                        catch(InterruptedException ex)
                        {

                        }
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        bRepetir.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {
                setEnabled(false);
                Thread hilo = new Thread()
                {
                    public void run()
                    {
                        try
                        {
                            if(puntos <= 0)
                            {
                                puntos = 0;
                            }
                            else
                            {
                                puntosRes = puntos / 4;
                                puntos = puntos - puntosRes;
                            }
                             String p = Integer.toString(puntos);
                             jTextField1.setText(p);
                                
                            for(int i = 0; i<lista.size(); i++){
                                    switch(lista.get(i))
                                    {
                                        case 1: 
                                            jButton1.setBackground(Color.BLUE);
                                            Thread.sleep(tiempo);
                                            jButton1.setBackground(Color.BLACK);
                                            break;
                                        case 2: 
                                            jButton2.setBackground(Color.RED);
                                            Thread.sleep(tiempo);
                                            jButton2.setBackground(Color.BLACK);
                                            break;
                                        case 3: 
                                            jButton3.setBackground(Color.GREEN);
                                            Thread.sleep(tiempo);
                                            jButton3.setBackground(Color.BLACK);
                                            break;
                                        case 4: 
                                            jButton4.setBackground(Color.CYAN);
                                            Thread.sleep(tiempo);
                                            jButton4.setBackground(Color.BLACK);
                                            break;
                                        case 5: 
                                            jButton5.setBackground(Color.LIGHT_GRAY);
                                            Thread.sleep(tiempo);
                                            jButton5.setBackground(Color.BLACK);
                                            break;
                                        case 6: 
                                            jButton6.setBackground(Color.YELLOW);
                                            Thread.sleep(tiempo);
                                            jButton6.setBackground(Color.BLACK);
                                            break;
                                        case 7: 
                                            jButton7.setBackground(Color.MAGENTA);
                                            Thread.sleep(tiempo);
                                            jButton7.setBackground(Color.BLACK);
                                            break;
                                        case 8: 
                                            jButton8.setBackground(Color.ORANGE);
                                            Thread.sleep(tiempo);
                                            jButton8.setBackground(Color.BLACK);
                                            break;
                                        case 9: 
                                            jButton9.setBackground(Color.pink);
                                            Thread.sleep(tiempo);
                                            jButton9.setBackground(Color.BLACK);
                                            break;
                                        case 10: 
                                            jButton10.setBackground(Color.WHITE);
                                            Thread.sleep(tiempo);
                                            jButton10.setBackground(Color.BLACK);
                                            break;
                                        case 11: 
                                            jButton11.setBackground(Color.darkGray);
                                            Thread.sleep(tiempo);
                                            jButton11.setBackground(Color.BLACK);
                                            break;
                                        case 12: 
                                            jButton12.setBackground(Color.GRAY);
                                            Thread.sleep(tiempo);
                                            jButton12.setBackground(Color.BLACK);
                                            break;                                                               
                                    }
                            }
                                
                        }     
                        catch(InterruptedException ex)
                        {

                        }
                        SwingUtilities.invokeLater(new Runnable()
                        {
                            public void run()
                            {
                                setEnabled(true);
                            }
                        });
                    }
                };
                hilo.start();
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        bRepetir = new javax.swing.JButton();
        bIniciar = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton2.setToolTipText("");

        bRepetir.setText("REPETIR");

        bIniciar.setText("INICIAR");
        bIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bRepetir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRepetir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bIniciarActionPerformed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIniciar;
    private javax.swing.JButton bRepetir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
