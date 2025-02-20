package universidad.app;
public class Estudiante {
    private int id;
    private String nombre;
    private String colegio;  // Se mantiene si es necesario

    // ✅ Constructor corregido
    public Estudiante(int id, String nombre, String colegio) {
        this.id = id;
        this.nombre = nombre;
        this.colegio = colegio;
    }

    // ✅ Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}

