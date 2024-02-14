public class Materia {

    private final String nombre;
    private final String codigo;
    private final int capacidadMaxima;
    private final Boolean estadoApertura;
    private final Boolean indicadorHabilitacion;

    public Materia(String nombre, String codigo, int capacidadMaxima, Boolean estadoApertura, Boolean indicadorHabilitacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.capacidadMaxima = capacidadMaxima;
        this.estadoApertura = estadoApertura;
        this.indicadorHabilitacion = indicadorHabilitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Boolean getEstadoApertura() {
        return estadoApertura;
    }

    public Boolean getIndicadorHabilitacion() {
        return indicadorHabilitacion;
    }
}
