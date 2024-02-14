public class Estudiante extends Persona {

    private final String edad;

    public Estudiante(String nombre, String apellido, String id, String edad) {
        super(nombre, apellido, id);
        this.edad = edad;
    }

    public String getEdad() {
        return edad;
    }
}
