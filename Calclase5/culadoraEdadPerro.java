
import java.util.Scanner;

public class CalculadoraEdadPerro {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Ingrese la edad humana: ");
        int edadHumana = cargaDeDatos.nextInt();

        int edadPerro = edadHumana * 7;

        System.out.println("La edad equivalente en años de perro es: " + edadPerro);
    }
}
