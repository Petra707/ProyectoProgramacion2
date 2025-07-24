package logica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ControladorFeria {
    private ArchFeria archivoFeria;
    private FeriaProyecto feriaActual;

    public ControladorFeria() throws IOException, ClassNotFoundException {
        archivoFeria = new ArchFeria("feria.dat");
        inicializarDatos();
    }

    private void inicializarDatos() throws IOException, ClassNotFoundException {
        if (!new java.io.File("feria.dat").exists()) {
            archivoFeria.crear();
            feriaActual = new FeriaProyecto(
                "Feria de Ciencias 2023", 
                "2023-11-20", 
                "2023-11-24", 
                "Auditorio Principal"
            );
            archivoFeria.adicionar(feriaActual);
        } else {
            List<FeriaProyecto> ferias = archivoFeria.leerTodo();
            feriaActual = ferias.isEmpty() ? 
                crearFeriaDefault() : ferias.get(0);
        }
    }

    private FeriaProyecto crearFeriaDefault() {
        return new FeriaProyecto(
            "Feria de Proyectos", 
            "2023-01-01", 
            "2023-01-03", 
            "Ubicación Principal"
        );
    }

    // ============ MÉTODOS PARA PARTICIPANTES ============
    public void registrarParticipante(Participante participante) throws IOException, ClassNotFoundException {
        feriaActual.getRegistrosParticipantes()[0].agregarParticipante(participante);
        guardarDatos();
    }

    public void eliminarParticipante(int ci) throws IOException, ClassNotFoundException {
        RegistroParticipante registro = feriaActual.getRegistrosParticipantes()[0];
        for (int i = 0; i < registro.getNroParticipantes(); i++) {
            if (registro.getP()[i] != null && registro.getP()[i].getCi() == ci) {
                registro.eliminarParticipante(i);
                guardarDatos();
                return;
            }
        }
        throw new IllegalArgumentException("Participante no encontrado");
    }

    public List<Participante> obtenerParticipantes() {
        List<Participante> participantes = new ArrayList<>();
        RegistroParticipante registro = feriaActual.getRegistrosParticipantes()[0];
        for (int i = 0; i < registro.getNroParticipantes(); i++) {
            if (registro.getP()[i] != null) {
                participantes.add(registro.getP()[i]);
            }
        }
        return participantes;
    }

    // ============ MÉTODOS PARA JUECES ============
    public void registrarJuez(Juez juez) throws IOException, ClassNotFoundException {
        // Asignar al primer proyecto del primer stand (ejemplo)
        if (feriaActual.getStands()[0] != null && feriaActual.getStands()[0].getProyectos()[0] != null) {
            feriaActual.getStands()[0].getProyectos()[0].agregarJuez(juez);
            guardarDatos();
        } else {
            throw new IllegalStateException("No hay proyectos disponibles");
        }
    }

    public List<Juez> obtenerJueces() {
        List<Juez> jueces = new ArrayList<>();
        for (Stand stand : feriaActual.getStands()) {
            if (stand != null) {
                for (Proyecto proyecto : stand.getProyectos()) {
                    if (proyecto != null) {
                        for (int i = 0; i < proyecto.getNroJueces(); i++) {
                            if (proyecto.getJueces()[i] != null) {
                                jueces.add(proyecto.getJueces()[i]);
                            }
                        }
                    }
                }
            }
        }
        return jueces;
    }

    // ============ MÉTODOS PARA VISITANTES ============
    public void registrarVisitante(Visitante visitante) throws IOException, ClassNotFoundException {
        if (feriaActual.getNroVisitantes() < feriaActual.getVisitantes().length) {
            feriaActual.getVisitantes()[feriaActual.getNroVisitantes()] = visitante;
            feriaActual.setNroVisitantes(feriaActual.getNroVisitantes() + 1);
            guardarDatos();
        } else {
            throw new IllegalStateException("Capacidad llena");
        }
    }

    public List<Visitante> obtenerVisitantes() {
        List<Visitante> visitantes = new ArrayList<>();
        for (int i = 0; i < feriaActual.getNroVisitantes(); i++) {
            if (feriaActual.getVisitantes()[i] != null) {
                visitantes.add(feriaActual.getVisitantes()[i]);
            }
        }
        return visitantes;
    }

    public int totalVisitantes() {
        return feriaActual.getNroVisitantes();
    }

    // ============ MÉTODOS AUXILIARES ============
    private void guardarDatos() throws IOException, ClassNotFoundException {
        archivoFeria.crear(); // Limpia el archivo
        archivoFeria.adicionar(feriaActual);
    }
}