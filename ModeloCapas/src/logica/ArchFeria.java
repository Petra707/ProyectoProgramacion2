package logica;
import java.io.*;
import java.util.*;
public class ArchFeria {

    static void adicionar(FeriaProyecto feriaActual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String nomD;
    public ArchFeria(String n)
    {
        nomD=n;
    }
    public void crear() throws ClassNotFoundException,
IOException
 {
 Scanner sc=new Scanner(System.in);
 File archivoFisico = new File(nomD);
 try{
 if(!archivoFisico.exists()){
 ObjectOutputStream archi = new
ObjectOutputStream(new FileOutputStream(nomD));
 archi.close();
 System.out.println("Archivo creado");
 }
 else{
 System.out.println("El archivo ya existe..!! ");
 System.out.println("Desea borrar sus datos???s/n");
 String resp=sc.next();
 if(resp.equals("s")){
 ObjectOutputStream archi = new
ObjectOutputStream(new FileOutputStream(nomD));
 archi.close();
 }
 }
 } catch(IOException e){
 System.out.println("Error al crear...."+e.getMessage());
 }
 }
    public void adicionar() throws ClassNotFoundException, IOException
 {
 Scanner sc=new Scanner(System.in);
 String resp;
 ObjectOutputStream archi=null;
 try{
 if(new File(nomD).exists())
 {
 archi = new AddObjectOutputStream(new
FileOutputStream(nomD,true));
 do{
  FeriaProyecto x=new FeriaProyecto(Leer.dato(), Leer.dato(), Leer.dato(), Leer.dato(), Leer.datoInt());

 archi.writeObject(x);
 System.out.println("Desea continuar s/n");
 resp=sc.next();
 }while(resp.equals("s"));
 }
 else
 System.out.println("No existe el archivo.... debe crear!!!");
 }
 catch(Exception e){
 System.out.println("error de archivo"+e.getMessage());
 e.printStackTrace();
 }
 finally{
 archi.close();
 }
 }
    
    public void listado()throws IOException, ClassNotFoundException
 {
 ObjectInputStream archi=null;
 try{
 archi=new ObjectInputStream(new
FileInputStream(nomD));
 while(true){
 FeriaProyecto x=(FeriaProyecto)archi.readObject();
 x.mostrarC();
 }
 }
 catch(Exception e){
 System.out.println("Fin listado!!!");
 }
 finally{
 archi.close();
 }

 }

    public String getNomD() {
        return nomD;
    }

    public void setNomD(String nomD) {
        this.nomD = nomD;
    }
    
}

