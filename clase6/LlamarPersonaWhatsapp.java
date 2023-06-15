package clase6;

import java.util.Scanner;

public class LlamarPersonaWhatsapp {
    public static void main(String[] args);
      Scanner teclado = new scanner(System.in);

      System.out.println("Ingrese numero de telefono (sin espacios): ");
      String telefono = teclado.nextLine();

      String url = "https://api.whatsapp.com/send?phone=" + telefono;

      System.out.println("Llamar por Whatsapp: " + url);
}
