package universidad.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1️⃣ Crear la Universidad
        Universidad universidad = new Universidad("Universidad XYZ", "Juan Gómez", "Bogotá");

        // 2️⃣ Crear Facultades
        Facultad ingenieria = new Facultad(101, "Ingeniería");
        Facultad cienciasSociales = new Facultad(102, "Ciencias Sociales");

        // 3️⃣ Crear Carreras (Pregrado y Posgrado)
        Carrera sistemas = new Carrera("Ingeniería de Sistemas", 160, 10, NivelCarrera.PREGRADO);
        Carrera derecho = new Carrera("Derecho", 180, 10, NivelCarrera.PREGRADO);
        Carrera maestriaSistemas = new Carrera("Maestría en Ingeniería de Software", 60, 4, NivelCarrera.POSTGRADO);
        Carrera doctoradoDerecho = new Carrera("Doctorado en Derecho", 90, 6, NivelCarrera.POSTGRADO);

        // 4️⃣ Crear Cursos (Pregrado y Posgrado)
        Curso poo = new Curso(1001, "Programación Orientada a Objetos", 4, "A101", "Edificio 1");
        Curso derechoCivil = new Curso(2001, "Derecho Civil", 3, "B101", "Edificio 3");
        Curso inteligenciaArtificial = new Curso(3001, "Inteligencia Artificial Avanzada", 5, "C301", "Edificio 5");
        Curso filosofiaJuridica = new Curso(4001, "Filosofía del Derecho", 4, "D401", "Edificio 6");

        // 5️⃣ Crear Profesores
        Profesor prof1 = new Profesor(1, "100200300", "Carlos Pérez", "Ingeniero de Software", "Colombiano", 5000000, ingenieria);
        Profesor prof2 = new Profesor(2, "400500600", "Laura Sánchez", "Abogada", "Argentina", 4700000, cienciasSociales);
        Profesor prof3 = new Profesor(3, "700800900", "Ana Torres", "Especialista en IA", "Mexicana", 5500000, ingenieria);
        Profesor prof4 = new Profesor(4, "111222333", "Miguel Herrera", "Doctor en Derecho", "Español", 6000000, cienciasSociales);

        ingenieria.agregarProfesor(prof1);
        ingenieria.agregarProfesor(prof3);
        cienciasSociales.agregarProfesor(prof2);
        cienciasSociales.agregarProfesor(prof4);

        // 6️⃣ Asignar profesores a cursos
        poo.asignarProfesor(prof1);
        derechoCivil.asignarProfesor(prof2);
        inteligenciaArtificial.asignarProfesor(prof3);
        filosofiaJuridica.asignarProfesor(prof4);

        // 7️⃣ Crear Estudiantes (Pregrado y Posgrado)
        Estudiante est1 = new Estudiante(20241001, "Juan Gómez", "Colegio Nacional");
        Estudiante est2 = new Estudiante(20241002, "María Fernández", "Colegio Distrital");
        Estudiante est3 = new Estudiante(20241003, "Andrés López", "Colegio Internacional");
        Estudiante est4 = new Estudiante(20242001, "Camila Ruiz", "Maestría en Ingeniería de Software");
        Estudiante est5 = new Estudiante(20242002, "Sofía Martínez", "Doctorado en Derecho");

        // 8️⃣ Inscribir estudiantes en cursos
        poo.inscribirEstudiante(est1);
        poo.inscribirEstudiante(est2);
        derechoCivil.inscribirEstudiante(est3);
        inteligenciaArtificial.inscribirEstudiante(est4);
        filosofiaJuridica.inscribirEstudiante(est5);

        // 9️⃣ Agregar cursos a carreras
        sistemas.agregarCurso(poo);
        derecho.agregarCurso(derechoCivil);
        maestriaSistemas.agregarCurso(inteligenciaArtificial);
        doctoradoDerecho.agregarCurso(filosofiaJuridica);

        // 🔟 Agregar carreras a facultades
        ingenieria.agregarCarrera(sistemas);
        ingenieria.agregarCarrera(maestriaSistemas);
        cienciasSociales.agregarCarrera(derecho);
        cienciasSociales.agregarCarrera(doctoradoDerecho);

        // 🔹 Agregar facultades a la universidad
        universidad.agregarFacultad(ingenieria);
        universidad.agregarFacultad(cienciasSociales);

        // 🔹 Mostrar toda la estructura de la universidad
        universidad.mostrarFacultades();

        // 🔹 Buscar estudiantes inscritos en cursos
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n📌 Cursos disponibles: ");
        for (Facultad f : universidad.getFacultades()) {
            for (Carrera c : f.getCarreras()) {
                for (Curso cur : c.getCursos()) {
                    System.out.println(" - " + cur.getNombre() + " (Código: " + cur.getCodigo() + ")");
                }
            }
        }

        System.out.println("\nIngrese el código del curso para ver los estudiantes inscritos (o 0 para salir):");
        int codigoCurso = scanner.nextInt();

        while (codigoCurso != 0) {
            boolean encontrado = false;

            for (Facultad f : universidad.getFacultades()) {
                for (Carrera c : f.getCarreras()) {
                    for (Curso cur : c.getCursos()) {
                        if (cur.getCodigo() == codigoCurso) {
                            cur.mostrarEstudiantes();
                            encontrado = true;
                        }
                    }
                }
            }

            if (!encontrado) {
                System.out.println("⚠ Curso no encontrado.");
            }

            System.out.println("\nIngrese otro código de curso o 0 para salir:");
            codigoCurso = scanner.nextInt();
        }

        scanner.close();
    }
}
