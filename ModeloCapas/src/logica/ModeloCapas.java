package logica;

import igu.Pantalla;
import java.io.IOException;
import java.util.Scanner;

public class ModeloCapas {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        try {
            ControladorFeria controlador = new ControladorFeria();
            Pantalla pantalla = new Pantalla(controlador);
            pantalla.setVisible(true);
        } catch (Exception e) {
            System.err.println("Error al iniciar la aplicación: " + e.getMessage());
            e.printStackTrace();
        }
        Pantalla panta=new Pantalla();
        panta.setVisible(true);
        //pantalla hacemelo visible
        panta.setLocationRelativeTo(null);
        //ponemela relatica con respecto a null (nada)
        Scanner sc=new Scanner(System.in);
        boolean sw=true;
        ArchFeria feri=new ArchFeria("feria.dat");
        while(sw) {
 System.out.println("1. Crear Archivo Feria");
 System.out.println("2. Adicionar Archivo Feria");
 System.out.println("3. Listar Archivo Feria");
 System.out.println("0. Salir ");
 System.out.println("Elegir una opcion: ");
 String resp=sc.next();
switch(resp){
 case "1": feri.crear();break;
 case "2": feri.adicionar();break;
 case "3": feri.listado();break;
 default: sw=false;
 System.exit(0);
 //termina el igu
 break;
 }
    }
    
    }
}
