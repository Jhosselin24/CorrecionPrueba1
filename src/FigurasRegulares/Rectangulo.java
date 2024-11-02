public class Rectangulo {
    private double ancho;
    private double altura;

    public Rectangulo() {
        this.ancho = 0;
        this.altura = 0;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularPerimetro() {
        return 2 * (ancho + altura);
    }

    public double calcularArea() {
        return ancho * altura;
    }
}
