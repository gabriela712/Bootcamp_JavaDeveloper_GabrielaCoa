package clase6;

import java.util.Scanner;
public class BuscadorPaises {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Ingrese el pais a buscar:");
        String pais = cargaDeDatos.nextLine();

        String url = "https://www.google.com/maps/search/" + pais;

        System.out.println("Ubicacion: " + url);
    }
}
