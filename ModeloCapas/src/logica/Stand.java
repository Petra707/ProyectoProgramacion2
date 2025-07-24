package logica;
import java.io.Serializable;
import java.util.Scanner;
public class Stand implements Serializable{
    private int nroProyectos, tamanio;
    private String nombre;
    private Proyecto pr[];
    Scanner teclado=new Scanner(System.in);
    Scanner sc=new Scanner(System.in);
    public Stand(int nroProyectos, int tamanio, String nombre) {
        this.nroProyectos = nroProyectos;
        this.tamanio = tamanio;
        this.nombre = nombre;
        for(int i=0;i<nroProyectos; i++){
            pr[i]=new Proyecto(teclado.next(), teclado.next(), sc.nextInt());
        }
    }
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Numero Proyectos: "+nroProyectos);
        System.out.println("Tamaño: "+tamanio);
        for(int x=0;x<nroProyectos;x++){
            pr[x].mostrar();
        }
    }
    public int getNroProyectos() {
        return nroProyectos;
    }

    public void setNroProyectos(int nroProyectos) {
        this.nroProyectos = nroProyectos;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Proyecto[] getPr() {
        return pr;
    }

    public void setPr(Proyecto[] pr) {
        this.pr = pr;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    

    
}
