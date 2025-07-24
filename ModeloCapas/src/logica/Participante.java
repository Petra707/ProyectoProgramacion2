
package logica;

import java.io.Serializable;

public class Participante <T> extends Persona implements Serializable{
    private String listaAcceso;
    private T id;

    public Participante(String listaAcceso, String x, String nombre, String paterno, String materno, int edad, int ci) {
        super(nombre, paterno, materno, edad, ci);
        this.listaAcceso = listaAcceso;
        id = (T)(Object)(ci+"-"+x);
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Lista Acceso: "+listaAcceso);
        System.out.println("Id: "+id);
    }

    public String getListaAcceso() {
        return listaAcceso;
    }

    public void setListaAcceso(String listaAcceso) {
        this.listaAcceso = listaAcceso;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
    
}
