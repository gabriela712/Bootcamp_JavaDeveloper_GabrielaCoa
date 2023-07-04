package clase8;
import java.util.Scanner;
public class CalcularAreaTriangulo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la longitud de la base del triangulo: ");
        double base = teclado.nextDouble();

        System.out.print("Ingresa la altura del triangulo: ");
        double altura = teclado.nextDouble();

        double area = (base * altura) / 2;

        System.out.print("El area del triangulo es: " + area);
    }
}
