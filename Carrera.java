package universidad.app;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private int codigo;
    private int creditos;
    private int semestres;
    private NivelCarrera nivel;
    private List<Curso> cursos; // Lista de cursos asociados

    // ✅ Constructor corregido
    public Carrera(String nombre, int creditos, int semestres, NivelCarrera nivel) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.semestres = semestres;
        this.nivel = nivel;
        this.cursos = new ArrayList<>();
    }

    // ✅ Método para agregar cursos
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    // ✅ Getters
    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public int getSemestres() {
        return semestres;
    }

    public NivelCarrera getNivel() {
        return nivel;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // ✅ Método para mostrar los cursos de la carrera
    public void mostrarCursos() {
        System.out.println("  Cursos en la carrera " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("    No hay cursos registrados en esta carrera.");
        } else {
            for (Curso curso : cursos) {
                System.out.println("    - " + curso.getNombre() + " (Código: " + curso.getCodigo() +
                        ", Créditos: " + curso.getCreditos() +
                        ", Salón: " + curso.getSalon() +
                        ", Edificio: " + curso.getEdificio() + ")");
            }
        }
    }
}
