package logica;

import java.io.Serializable;

public class Persona implements Serializable{
    private String nombre, paterno, materno;
    private int edad, ci;

    public Persona(String nombre, String paterno, String materno, int edad, int ci) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.ci = ci;
    }
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Paterno: "+paterno);
        System.out.println("Materno: "+materno);
        System.out.println("Edad: "+edad);
        System.out.println("CI: "+ci);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
    
}
