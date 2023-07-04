package clase8;
import java.util.Scanner;
public class CalcularAreaCuadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado cuadrado: ");
        double lado = teclado.nextDouble();

        double area = lado * lado;

        System.out.print("El área del cuadrado es: " + area);

    }
}
