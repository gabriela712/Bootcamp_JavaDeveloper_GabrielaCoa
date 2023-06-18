package Clase9;

import java.util.Scanner;
public class Busqueda {
    public static void main(String[] args) {

        String [] personas = {"Lucas Moy", "Aldo Angelini", "Julia Gomez", "Manuel Santillan", "Juan Torres"};

        /*
        String[] personas = new String[10];
        personas[0] = "Lucas Moy";
        personas[1] = "Aldo Angelini";
        personas[2] = "Julia Gomez";
         */

        System.out.println("Ingrese su busqueda:");
        Scanner teclado = new Scanner(System.in);
        String busqueda = teclado.nextLine();

        for (String nombrePersona : personas) {
             if (nombrePersona.toLowerCase().contains(busqueda.toLowerCase())) {
                 System.out.println("La persona es: " + nombrePersona);
             }
        }

    }
}
