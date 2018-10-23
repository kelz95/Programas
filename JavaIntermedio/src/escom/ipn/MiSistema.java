/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escom.ipn;

import escom.ipn.Cliente.Domicilio;
import java.io.Console;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class MiSistema {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Persona p = new Persona();
        //p.setNombre("Alex");
        System.out.println(p.getGenero());
//        Calendar cal = new GregorianCalendar();
//        Persona r = new Persona("Alex", "Botello", cal, 'M');
//        System.out.println(r);
//        // TODO code application logic here
//        
//        Cliente c = new Cliente("12345", "pancho", "lopez", cal, 'M');
//        Cliente.Domicilio dom;
//        dom = c.new Domicilio("Granjas", 12, "Alamos", "Juarez");
//        System.out.println(c + " -> " + dom);
        
        //Servicio s = new Servicio(cal);
//        Prestamo pr1 = new Prestamo(cal, 1, 3000F, cal);
//        Prestamo pr2 = new Prestamo(cal, 2, 6000F, cal);
//        Prestamo pr3 = new Prestamo(cal, 3, 9000F, cal);
//        Prestamo pr4 = new Prestamo(cal, 4, 2000F, cal);
      //  Prestamos prs = PrestamosFactory.createPrestamos();
        String url = "jdbc:mysql://localhost:3306/bancario?zeroDateTimeBehavior=convertToNull";
        String user = "root";
        String password = "";        
        
        PrestamosBD pr2 = PrestamosFactory.createPrestamosBD(url, user, password);
        pr2.agregar("1111", 40, "2017-3-5", 3000.00F, "2016-7-9");
        System.out.println(pr2.listado());
        pr2.modifica("1111", 40, "2018-9-3", 5000.00F, "2018-7-5");
        System.out.println(pr2.busqueda(40));
        pr2.elimina(40);
        if(pr2.vacio()){
            System.out.println("No hay datos");
        }
        
//        //prs.agregar(pr1);
        //prs.agregar(pr2);
        //prs.agregar(pr3);
        //prs.agregar(pr4);
//        System.out.println("Contenido:" + prs.listado());
//        //prs.guardaArchivo("prestamos.dat");
//        prs.abreArchivo("prestamos.dat");
//        System.out.println("Contenido:" + prs.listado());
////        PrestamosGen prs2 = PrestamosFactory.createPrestamosGen();
////        prs2.agregar(pr1);
//        System.out.println("Contenido:" + prs.listado());
//        
//        Traspaso t1 = new Traspaso("pancho", 1000, cal, 6);
//        Traspaso t2 = new Traspaso("laura", 4000, cal, 8);
//        Traspaso t3 = new Traspaso("paty", 5000, cal, 9);
//        Traspasos trs = new Traspasos();
//        trs.agregar(t1);
//        trs.agregar(t2);
//        trs.agregar(t3);
//        System.out.println("contenido: " + trs.listado());
//        trs.agregar(t1);
//        System.out.println("contenido: " + trs.listado());
        
//        Cuenta c1 = new Cuenta(new GregorianCalendar(2017,7,3), 20, 1111);
//        Cuenta c2 = new Cuenta(new GregorianCalendar(2018,3,3), 30, 2222);
//        Cuenta c3 = new Cuenta(new GregorianCalendar(2017,6,1), 20, 3333);
//        Cuentas cs = new Cuentas();
//        //cs.agrega(c1.getNoCuenta(), c1);
        //cs.agrega(c2.getNoCuenta(), c2);
        //cs.agrega(c3.getNoCuenta(), c3);
  //      System.out.println("Elementos ->" + cs.listado());
      //  cs.agrega(c3.getNoCuenta(), c3);
  //      System.out.println("Elementos ->" + cs.listado());
      //  cs.elimina(1111);
        
  //      System.out.println("Elementos (" + cs.tamanio() + ") ->" + cs.listado() );
       // Utilerias.guardaArchivoTexto(cs.listado(), "prueba.csv");
   //     System.out.println(Utilerias.leeArchivoTexto("prueba.csv"));
   //     cs.llenaCuentas(Utilerias.leeArchivoTexto("prueba.csv"));
   //     System.out.println("Elementos ->" + cs.listado());        
        //Console c = System.console();
  //      BaseDatos bd = new BaseDatos();
        //String url = "jdbc:derby://localhost:1527/Bancario";
  //      String url = "jdbc:mysql://localhost:3307/bancario?zeroDateTimeBehavior=convertToNull";
        //String user = "banco";
        //String password = "banco";
//        String user = "root";
//        String password = "root";        
//        bd.conexion(url, user, password);
//        String cliente = "create table cliente(\n" +
//"nocliente varchar(12),\n" +
//"nombre varchar(30) not null,\n" +
//"apellidos varchar(30) not null,\n" +
//"fechanac date not null,\n" +
//"genero char(1) not null check(genero = \'M\' or genero = \'F\'),\n" +
//"primary key(nocliente) \n" +
//");";
//     //   bd.actualiza(cliente);
//        String c = "select * from cliente";
//        System.out.println(bd.salidaCSV(bd.consulta(c)));
//        String g = "insert into cliente values"
//                + "(\'1111\',\'Juan\', \'Perez\', \'1990-3-6\', \'M\')";
//        //String i = "insert into prestamo values"
//        //        + "(6,\'2018-5-7\',6000.00, \'2018-8-9\',\'1111\')";
//        int r = bd.actualiza(g);
       // System.out.println("rengloes afcetados -> " + r);
        //String f = "select count(*) as res from prestamo";
 //       System.out.println(bd.salidaCSV(bd.consulta(c)));
 
        PrestamosBD [] prest = new PrestamosBD[7];
        for(int i = 0; i < 7; i++){
            prest[i] = new PrestamosBD("jdbc:mysql://localhost:3306/bancario?zeroDateTimeBehavior=convertToNull","root","");
            prest[i].start();
            if(i == 2){
                prest[i].interrupt();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                    Logger.getLogger(MiSistema.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        Thread [] bds = new Thread[7];
        for(int i = 0; i < 7; i++){
            BaseDatos bd = new BaseDatos();
            Thread t = new Thread(bd); //para que el objeto bd se comporte como Thread
            bds[i] = t;
            bds[i].start();
            bds[i].join();

        }
    }
    
}



