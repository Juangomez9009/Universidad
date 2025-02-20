package universidad.app;

import java.util.List;
import java.util.ArrayList;

public class Curso_Profesor {
    private int cursoId;
    private int profesorId;
    private List<Profesor> profesores;  // Usamos una lista en lugar de un array

    public Curso_Profesor(int cursoId, int profesorId) {
        this.cursoId = cursoId;
        this.profesorId = profesorId;
        this.profesores = new ArrayList<>();
    }

    // Getters
    public int getCursoId() {
        return cursoId;
    }

    public int getProfesorId() {
        return profesorId;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    // Método para agregar profesores al curso
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }
}
