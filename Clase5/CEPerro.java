 import java.util.scanner;

 public class CalculadoraEdadDePerros {
      public static void main(String[] args) {
           Scanner cargaDeDatos = new Scanner(System.in);

           System.out.println("Ingrese la edad humana: ");
           int eddadHumana = scanner.netInt();

           int edadPerro;

           if(edadHumana<=2) {
              edadPerro = edadHumana * 10.5;
           } else {
              edadPerro = 21 + (edadHumana - 2) * 4;
           }
           System.out.println("La edad equivalente en años perro es: " + edadPerro);
      }
 }
