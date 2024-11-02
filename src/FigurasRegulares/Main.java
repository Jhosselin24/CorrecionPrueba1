
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear e inicializar las figuras
        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();

        // Solicitar y asignar valores para cada figura
        System.out.println("Ingrese el lado del cuadrado:");
        cuadrado.setLado(scanner.nextDouble());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());

        System.out.println("Ingrese el ancho del rectángulo:");
        rectangulo.setAncho(scanner.nextDouble());
        System.out.println("Ingrese la altura del rectángulo:");
        rectangulo.setAltura(scanner.nextDouble());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        System.out.println("Ingrese el radio del círculo:");
        circulo.setRadio(scanner.nextDouble());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
        System.out.println("Área del círculo: " + circulo.calcularArea());

        System.out.println("Ingrese la base del triángulo:");
        triangulo.setBase(scanner.nextDouble());
        System.out.println("Ingrese la altura del triángulo:");
        triangulo.setAltura(scanner.nextDouble());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}

