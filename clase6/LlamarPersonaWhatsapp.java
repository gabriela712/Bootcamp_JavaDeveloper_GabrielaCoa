package clase6;

import java.util.Scanner;

public class LlamarPersonaWhatsapp {
  public static void main(String[] args) {

    Scanner cargaDeDatos = new Scanner(System.in);

    System.out.println("Ingrese un numero de telefono (sin espacios): ");
    String telefono = cargaDeDatos.nextLine();

    String url = "https://api.whatsapp.com/send?phone=" + telefono;

    System.out.println("Llamar por Whatsapp: " + url);
  }
}
