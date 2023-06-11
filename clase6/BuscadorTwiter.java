package clase6;

import java.util.Scanner;
public class BuscadorTwiter {
    public static void main(String[] args){
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Ingrese el nombre del actor de un solo nombre: ");
        String actor = cargaDeDatos.nextLine();

        String url = "“https://twitter.com/search?q= " + actor;

        System.out.println("Twiter: " + url);
    }
}
