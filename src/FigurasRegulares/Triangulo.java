public class Triangulo {
    private double base;
    private double altura;

    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularPerimetro() {
        // Suponiendo un triángulo equilátero
        return 3 * base;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}

