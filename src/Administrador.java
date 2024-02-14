
import java.util.List;
public class Administrador {

    private final List<Docente>docentes;
    private final List<Materia>materias;
    private final List<Estudiante>estudiantes;
    private final List<Calificacion>calificaciones;
    private final int capacidadMaxima;
    private final String pin;

    public Administrador(List<Docente> docentes, List<Materia> materias, List<Estudiante> estudiantes, List<Calificacion> calificaciones, int capacidadMaxima, String pin) {
        this.docentes = docentes;
        this.materias = materias;
        this.estudiantes = estudiantes;
        this.calificaciones = calificaciones;
        this.capacidadMaxima = capacidadMaxima;
        this.pin = pin;
    }

    // Método para registrar un estudiante verificando la capacidad máxima
    public void registrarEstudiante(Estudiante estudiante) {
        if (estudiantes.size() <= capacidadMaxima) {
            estudiantes.add(estudiante);
            System.out.println("Estudiante agregado a la materia.");
        } else {
            System.out.println("La materia ha alcanzado su capacidad máxima. No se puede agregar más estudiantes.");
        }
    }
}