package logica;

import java.io.Serializable;

public class Juez extends Persona implements Serializable{
    private int nroProyectosCalificar;
    private double calificacion;
    private String listaProyectos, gradoAcademico;
    public Juez(int nroProyectosCalificar, double calificacion, String listaProyectos, String gradoAcademico, String nombre, String paterno, String materno, int edad, int ci) {
        super(nombre, paterno, materno, edad, ci);
        this.nroProyectosCalificar = nroProyectosCalificar;
        this.calificacion = calificacion;
        this.listaProyectos = listaProyectos;
        this.gradoAcademico = gradoAcademico;
    }
    public void calificar(double calificacion){
        this.calificacion=calificacion;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Número de Proyectos: "+nroProyectosCalificar);
        System.out.println("Calificacion: "+ calificacion);
        System.out.println("Lista de Proyectos: "+listaProyectos);
        System.out.println("Grado Academico: "+gradoAcademico);
    }

    public int getNroProyectosCalificar() {
        return nroProyectosCalificar;
    }

    public void setNroProyectosCalificar(int nroProyectosCalificar) {
        this.nroProyectosCalificar = nroProyectosCalificar;
    }

    public double getCalificacion() {
        return calificacion;
    }
    public String getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(String listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }
    
}
