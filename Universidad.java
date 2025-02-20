package universidad.app;

import java.util.List;
import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private String rector;
    private String ciudad;
    private List<Facultad> facultades;  // Lista de facultades en la universidad

    // Constructor
    public Universidad(String nombre, String rector, String ciudad) {
        this.nombre = nombre;
        this.rector = rector;
        this.ciudad = ciudad;
        this.facultades = new ArrayList<>();
    }

    // Método para agregar una facultad a la universidad
    public void agregarFacultad(Facultad facultad) {
        facultades.add(facultad);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getRector() {
        return rector;
    }

    public String getCiudad() {
        return ciudad;
    }

    public List<Facultad> getFacultades() {
        return facultades;
    }

    // Método para mostrar toda la información de la universidad
    public void mostrarFacultades() {
        System.out.println("Universidad: " + nombre + " - Rector: " + rector + " - Ubicación: " + ciudad);
        System.out.println("Facultades:");
        for (Facultad f : facultades) {
            System.out.println("- Facultad: " + f.getNombre() + " | Código: " + f.getCodigo());
            f.mostrarCarreras();  // ✅ Llamar a mostrarCarreras() dentro de cada facultad
            f.mostrarProfesores();  // ✅ Llamar a mostrarProfesores() dentro de cada facultad
        }
    }
}
