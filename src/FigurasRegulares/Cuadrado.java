public class Cuadrado {
    private double lado;

    public Cuadrado() {
        this.lado = 0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}
