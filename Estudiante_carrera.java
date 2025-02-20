package universidad.app;

import java.util.List;
import java.util.ArrayList;

public class Estudiante_carrera {
    private Estudiante estudiante;
    private Carrera carrera;
    private List<Curso_Estudiante> cursosEstudiante;

    public Estudiante_carrera(Estudiante estudiante, Carrera carrera) {
        this.estudiante = estudiante;
        this.carrera = carrera;
        this.cursosEstudiante = new ArrayList<>();
    }

    // Getters
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public List<Curso_Estudiante> getCursosEstudiante() {
        return cursosEstudiante;
    }

    // Método para agregar un curso a la relación estudiante-carrera
    public void agregarCurso(Curso_Estudiante cursoEstudiante) {
        cursosEstudiante.add(cursoEstudiante);
    }
}
