package logica;

import java.io.Serializable;

public class Visitante extends Persona implements Serializable{

    public Visitante(String nombre, String paterno, String materno, int edad, int ci) {
        super(nombre, paterno, materno, edad, ci);
    }
    public void asistir(String mensaje){
        System.out.println("El lugar es super grande.");
        System.out.println("Primero quiero ir a ver "+ mensaje);
    }
    
}