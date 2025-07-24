package logica;

import java.io.Serializable;
import java.util.Scanner;

public class FeriaProyecto implements Serializable{
    private static final long serialVersionUID = 1L; 
	private int nroStands;
	private Stand[] st;
	private int nroVisitantes;
	private Visitante[] v;
	private String nombre;
	private String fechaInicio;
	private String fechaFinalizacion;
	private String ubicacion;
	private int nroRegistroParticipantes;
	private RegistroParticipante[] rp;
	public FeriaProyecto(String nombre, String fechaInicio, String fechaFinalizacion, String ubicacion) {
		this.st= new Stand[50];
		this.v=new Visitante[100];
		this.nombre=nombre;
		this.fechaInicio=fechaInicio;
		this.fechaFinalizacion=fechaFinalizacion;
		this.ubicacion=ubicacion;
		this.rp=new RegistroParticipante[50];
		this.nroStands=2;
		this.st[0]=new Stand(8,10,"Stand1");
		this.st[1]=new Stand(5,12,"Stand2");
		this.nroVisitantes = 0;
        this.nroRegistroParticipantes = 1;
        this.rp[0] = new RegistroParticipante();
	}
        public FeriaProyecto(String nombre, String fechaInicio, String fechaFinalizacion, String ubicacion, int x) {
		this.st= new Stand[50];
		this.v=new Visitante[100];
		this.nombre=nombre;
		this.fechaInicio=fechaInicio;
		this.fechaFinalizacion=fechaFinalizacion;
		this.ubicacion=ubicacion;
		this.rp=new RegistroParticipante[50];
		this.nroStands=x;
		for(int a=0; a<nroStands; a++){
                    st[a]=new Stand(Leer.datoInt(), Leer.datoInt(), Leer.dato());
                }
		this.nroVisitantes = 0;
        this.nroRegistroParticipantes = 1;
        this.rp[0] = new RegistroParticipante();
        }
	public void mostrarC() {
        System.out.println("*Feria de Proyectos");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha: " + this.fechaInicio + " a " + this.fechaFinalizacion);
        System.out.println("Ubicacion: " + this.ubicacion);
        System.out.println("Nro Stands: " + this.nroStands);
        if (this.nroStands > 0) {
            System.out.println("  Stands:");
            for (int i = 0; i < this.nroStands; i++) {
                System.out.println("    " + this.st[i].toString());
            }
        }
        System.out.println("Nro Visitantes: " + this.nroVisitantes);
        if (this.nroVisitantes > 0) {
            System.out.println("  Visitantes:");
            for (int i = 0; i < this.nroVisitantes; i++) {
                System.out.println("    " + this.v[i].toString());
            }
        }
        System.out.println("Nro Reg Participantes: " + this.nroRegistroParticipantes);
        if (this.nroRegistroParticipantes > 0) {
            System.out.println("  Registros de Participantes:");
            for (int i = 0; i < this.nroRegistroParticipantes; i++) {
                System.out.println("    " + this.rp[i].toString());
            }
        }
    }
	public void aperturaFeria() {
        System.out.println("Bienvenidos a la Feria de Proyectos " + this.nombre);
    }
    public void clausuraFeria() {
        System.out.println("Gracias por su presencia en la Feria " + this.nombre);
    }
    public boolean validarLugar() {
        if (this.ubicacion.equals("Ocupado") || this.ubicacion.equals("Reservado")) {
            System.out.println("El lugar " + this.ubicacion + " ya esta ocupado");
            return false;
        } else {
            System.out.println("El lugar " + this.ubicacion + " esta disponible");
            return true;
        }
    }
    public int participantesTotales() {
        return this.nroRegistroParticipantes;
    }
    public void registrarVisitante(int m){
        for(int x=0;x<m;x++){
            v[x]=new Visitante(Leer.dato(), Leer.dato(), Leer.dato(), Leer.datoInt(), Leer.datoInt());
        }
        nroVisitantes=nroVisitantes+m;
    }
    public void leer()
    {
        Scanner y=new Scanner(System.in);
        Scanner teclado=new Scanner(System.in);
        System.out.println("Nombre   Fecha-Inicio  Fecha-Finalizacion   Ubicacion");
        nombre=y.next();
        fechaInicio=y.next();
        fechaFinalizacion=y.next();
        nroStands=teclado.nextInt();
        nroVisitantes=0;
        ubicacion=y.next();
        nroRegistroParticipantes=teclado.nextInt();
        rp[0]=new RegistroParticipante();
        for(int i=0; i<nroStands;i++){
            st[i]=new Stand(Leer.datoInt(), Leer.datoInt(), Leer.dato());
        }
    }

    public int getNroStands() {
        return nroStands;
    }

    public void setNroStands(int nroStands) {
        this.nroStands = nroStands;
    }

    public Stand[] getSt() {
        return st;
    }

    public void setSt(Stand[] st) {
        this.st = st;
    }

    public int getNroVisitantes() {
        return nroVisitantes;
    }

    public void setNroVisitantes(int nroVisitantes) {
        this.nroVisitantes = nroVisitantes;
    }

    public Visitante[] getV() {
        return v;
    }

    public void setV(Visitante[] v) {
        this.v = v;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNroRegistroParticipantes() {
        return nroRegistroParticipantes;
    }

    public void setNroRegistroParticipantes(int nroRegistroParticipantes) {
        this.nroRegistroParticipantes = nroRegistroParticipantes;
    }
    public void setRp(RegistroParticipante[] rp) {
        this.rp = rp;
    }

    public RegistroParticipante[] getRp() {
        return rp;
    }
    
}


