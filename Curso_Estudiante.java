package universidad.app;

import java.util.List;
import java.util.ArrayList;

public class Curso_Estudiante {
    private int cursoId;
    private int estudianteId;
    private List<Curso_Profesor> cursoProfesores;

    public Curso_Estudiante(int cursoId, int estudianteId) {
        this.cursoId = cursoId;
        this.estudianteId = estudianteId;
        this.cursoProfesores = new ArrayList<>();
    }

    // Getters
    public int getCursoId() {
        return cursoId;
    }

    public int getEstudianteId() {
        return estudianteId;
    }

    public List<Curso_Profesor> getCursoProfesores() {
        return cursoProfesores;
    }

    // Método para asociar un curso con un profesor
    public void agregarCursoProfesor(Curso_Profesor cursoProfesor) {
        cursoProfesores.add(cursoProfesor);
    }
}
