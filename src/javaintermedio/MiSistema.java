/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintermedio;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author alumno
 */
public class MiSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Calendar cal = new GregorianCalendar();
//        Persona p = new Persona();
//        Persona r = new Persona("Alex", "Botella", cal, 'M');
//        Cliente c = new Cliente("01", "Pancho", "Reyes", cal, 'M');
//        Cliente.Domicilio dom;
//        dom = c.new Domicilio ("Granjas", 12, "Almoca", "Juarez");
//        //p.setNombre("Alex");
//        System.out.println(r);
//        System.out.println(c + " - > " + dom);
//    
//        //Servicio s = new Servicio(cal);
//        Prestamo pr1 = new Prestamo(3000F, cal, 1, cal);
//        Prestamo pr2 = new Prestamo(4000F, cal, 2, cal);
//        Prestamo pr3 = new Prestamo(5000F, cal, 3, cal);
//        Prestamo pr4 = new Prestamo(6000F, cal, 4, cal);
//        Prestamo pr5 = new Prestamo(7000F, cal, 5, cal);
//        Prestamos prs = PrestamosFactory.createPrestamos();
        /*prs.agregar(pr1);
        prs.agregar(pr2);
        prs.agregar(pr3);
        prs.agregar(pr4);
        prs .agregar(pr5);*/
        //System.out.println("Contenidos: \n" + prs.listado());
        //prs.guardaArchivo("prestamos.dat");
        //prs.abreArchivo("prestamos.dat");
        //System.out.println("Contenidos: \n" + prs.listado()); 
        
        //PrestamoGen prs2 = PrestamosFactory.createPrestamoGen();
        //prs2.agregar(pr1);
        /*Traspaso t1 = new Traspaso ("pancho", 1000, 6, cal);
        Traspaso t2 = new Traspaso ("laura", 1000, 8, cal);
        Traspaso t3 = new Traspaso ("paty", 1000, 9, cal);
        Traspasos trs = new Traspasos();
        trs.agregar(t1);
        trs.agregar(t2);
        trs.agregar(t3);
        System.out.println("Contenido: \n" + trs.listado());
        trs.agregar(t1);
        System.out.println("Contenido: \n" + trs.listado());        
        
        Cuenta c1 = new Cuenta(1111,20,new GregorianCalendar(2017,7,3));
        Cuenta c2 = new Cuenta(2222,30,new GregorianCalendar(2018,3,3));
        Cuenta c3 = new Cuenta(3333,20,new GregorianCalendar(2017,6,1));
        Cuentas cs = new Cuentas();
        cs.agrega(c1.getNoCuenta(), c1);
        cs.agrega(c2.getNoCuenta(), c2);
        cs.agrega(c3.getNoCuenta(), c3);
        System.out.println("Elementos: \n" +  cs.listado());
        
        Utilerias.guardaArchivoTexto(cs.listado(), "prueba.txt");     
        System.out.println(Utilerias.leerArchivoTexto("prueba.txt"));
        cs.llenaCuentas(Utilerias.leerArchivoTexto("prueba.txt"));
        System.out.println("Elementos: \n" +  cs.listado());*/
        BaseDatos bd = new BaseDatos();
        //String url = "jdbc:derby://localhost:1527/bBancario";
        String url = "jdbc:mysql://localhost:3307/bancario";
//        String user = "banco";
//        String password = "banco";
        String user = "root";
        String password = "root";
        bd.conexion(url, user, password);       
        
//        String cliente = "CREATE TABLE CLIENTE (\n" +
//"    nocliente varchar(20) ,\n" +
//"    nombre varchar(30) not null,\n" +
//"    apellidos varchar(30) not null,\n" +
//"    fechanac date not null,\n" +
//"    genero char(1) not null check (genero ='M' or genero ='F'),\n" +
//"\n" +
//"    primary key (nocliente)\n" +
//"\n" +
//");";
        //bd.actualiza(cliente);
        String query = "select * from cliente";  
        String f ="select * from prestamo";
        System.out.println(bd.salidaCSV(bd.consulta(query)));
       // String r = "insert into prestamo values (6, '2018-5-7', 6000.00, '2018-8-9', '1111')";
        String g = "insert into cliente values ('1111', 'Juan', 'Perez', '1990-3-6', 'M');";
        bd.actualiza(g);
        System.out.println("renglones afectador -> " + g);
        
        System.out.println(bd.salidaCSV(bd.consulta(query)));
    }

}
