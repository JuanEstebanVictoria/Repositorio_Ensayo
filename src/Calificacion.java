public class Calificacion {

    private final double nota1;
    private final double nota2;
    private final double nota3;
    private final double nota4;

    public Calificacion(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    // Método para calcular el promedio de un estudiante
    public void calcularPromedio(){
        double promedio;
        promedio = ((nota1) + (nota2) + (nota3) + (nota4) / 4);
    }

}