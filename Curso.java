package universidad.app;

import java.util.List;
import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nombre;
    private int creditos;
    private String salon;
    private String edificio;
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;

    public Curso(int codigo, String nombre, int creditos, String salon, String edificio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.salon = salon;
        this.edificio = edificio;
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public void asignarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getSalon() {
        return salon;
    }

    public String getEdificio() {
        return edificio;
    }

    public void mostrarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("    No hay profesores asignados a este curso.");
        } else {
            System.out.println("    Profesores del curso " + nombre + ":");
            for (Profesor p : profesores) {
                System.out.println("      - " + p.getNombre() + " | " + p.getProfesion());
            }
        }
    }

    public void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("    No hay estudiantes inscritos en este curso.");
        } else {
            System.out.println("    Estudiantes inscritos en " + nombre + ":");
            for (Estudiante e : estudiantes) {
                System.out.println("      - " + e.getNombre() + " (ID: " + e.getId() + ")");
            }
        }
    }
}
