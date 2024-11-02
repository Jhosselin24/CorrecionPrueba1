public class Circulo {
    private double radio;

    public Circulo() {
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

