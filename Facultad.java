package universidad.app;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private int codigo;
    private String nombre;
    private List<Carrera> carreras;
    private List<Profesor> profesores; // ✅ Lista de profesores

    // ✅ Constructor
    public Facultad(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carreras = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    // ✅ Método para agregar una carrera a la facultad
    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }

    // ✅ Método para agregar un profesor a la facultad
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    // ✅ Método para mostrar las carreras en la facultad
    public void mostrarCarreras() {
        if (carreras.isEmpty()) {
            System.out.println("  No hay carreras registradas en esta facultad.");
        } else {
            for (Carrera c : carreras) {
                System.out.println("   - " + c.getNombre());
                c.mostrarCursos(); // ✅ Mostrar cursos dentro de cada carrera
            }
        }
    }

    // ✅ Método para mostrar los profesores de la facultad
    public void mostrarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("  Profesores en la facultad " + nombre + ":");
            System.out.println("    No hay profesores registrados en esta facultad.");
        } else {
            System.out.println("  Profesores en la facultad " + nombre + ":");
            for (Profesor p : profesores) {
                System.out.println("    - " + p.getNombre() + " | " + p.getProfesion() + " | " + p.getNacionalidad());
            }
        }
    }

    // ✅ Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }
}
