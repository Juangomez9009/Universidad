package universidad.app;

public class Profesor {
    private int id;
    private String cedula;
    private String nombre;
    private String profesion;
    private String nacionalidad;
    private double sueldo;
    private Facultad facultad;

    // ✅ Constructor corregido
    public Profesor(int id, String cedula, String nombre, String profesion, String nacionalidad, double sueldo, Facultad facultad) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.profesion = profesion;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.facultad = facultad;
    }

    // ✅ Getters
    public int getId() {
        return id;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    // ✅ Método para mostrar información del profesor
    public void mostrarInfo() {
        System.out.println("  - " + nombre + " | " + profesion + " | " + nacionalidad);
    }
}
