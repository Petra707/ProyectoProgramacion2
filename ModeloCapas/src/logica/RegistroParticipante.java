package logica;

import java.io.Serializable;
import java.util.Scanner;

public class RegistroParticipante implements Serializable {
    private int nroParticipantes;
    private Participante p[];
    Scanner teclado=new Scanner(System.in);
    Scanner sc=new Scanner(System.in);
    public RegistroParticipante() {
        this.nroParticipantes = 0;
        //Participante p[]=new Participante[nroParticipantes];
        //for(int j=0;j<nroParticipantes;j++){
            //p[j]=new Participante(teclado.next(), teclado.next(), teclado.next(), 
               //     teclado.next(), teclado.next(), teclado.nextInt(), teclado.nextInt());
        //}
    }
    public void mostrar(){
        System.out.println("Número de participantes: "+nroParticipantes);
        for(int i=0;i<nroParticipantes;i++){
            System.out.println(p[i]);
        }
    }
    public void agregarParticipante(int x){
        for(int j=0;j<x;j++){
            p[j]=new Participante(teclado.next(), teclado.next(), teclado.next(), 
                    teclado.next(), teclado.next(), sc.nextInt(), sc.nextInt());
        }
        nroParticipantes=nroParticipantes+x;
    }
    public void eliminarParticipante(int y){
        for(int k=0;k<nroParticipantes;k++){
            if(k==y){
                p[k]=p[k+1];
            }
        }
        nroParticipantes--;
    }
    public void buscarParticipante(Persona e){
        for(int f=0;f<nroParticipantes;f++){
            if(p[f].getNombre().equalsIgnoreCase(e.getNombre())){
                System.out.println("Esta en la lista. Participante encontrado");
            }
            else{
                System.out.println("No esta en la lista. Participante no encontrado.");
            }
        }
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

    void agregarParticipante(Participante participante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
