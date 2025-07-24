package logica;

import java.io.Serializable;
import java.util.Scanner;

public class Proyecto implements Serializable{
    private String nombre, tipo;
    private int nroJueces, nroParticipantes;
    private Participante p[];
    private Juez j[];
    Scanner teclado=new Scanner(System.in);
    Scanner sc=new Scanner(System.in);
    Scanner tecl=new Scanner(System.in);
    public Proyecto(String nombre, String tipo, int nroParticipantes) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroJueces = 0;
        this.nroParticipantes = nroParticipantes;
        for(int i=0;i<nroParticipantes;i++){
            p[i]=new Participante(teclado.next(), teclado.next(), 
                    teclado.next(), teclado.next(), teclado.next(), sc.nextInt(), sc.nextInt());
        }
    }
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Tipo: "+tipo);
        System.out.println("Numero Jueces: "+nroJueces);
        System.out.println("Numero de Participantes: "+nroParticipantes);
        for(int j=0;j<nroParticipantes;j++){
            p[j].mostrar();
        }
        for(int k=0; k<nroJueces;k++){
            j[k].mostrar();
        }
    }
    public void agregarJuez(int n){
        for(int x=0;x<n;x++){
            j[x]=new Juez(sc.nextInt(), tecl.nextDouble(), 
                    teclado.next(), teclado.next(), teclado.next(), teclado.next(), teclado.next(), sc.nextInt(), sc.nextInt() );
        }
        nroJueces=nroJueces+n;
    }
    public void eliminarJuez(int a){
        for(int u=0;u<nroJueces;u++){
            if(u==a){
                j[u]=j[u+1];
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNroJueces() {
        return nroJueces;
    }

    public void setNroJueces(int nroJueces) {
        this.nroJueces = nroJueces;
    }

    public int getNroParticipantes() {
        return nroParticipantes;
    }

    public void setNroParticipantes(int nroParticipantes) {
        this.nroParticipantes = nroParticipantes;
    }

    public Participante[] getP() {
        return p;
    }

    public void setP(Participante[] p) {
        this.p = p;
    }

    public Juez[] getJ() {
        return j;
    }

    public void setJ(Juez[] j) {
        this.j = j;
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

    public Scanner getTecl() {
        return tecl;
    }

    public void setTecl(Scanner tecl) {
        this.tecl = tecl;
    }
    
}
