package Clase5;

import java.util.Random;
import java.util.Scanner;
public class JuegoAdiivinarNumero {
    public static void main(String[] args){
        Random cargAleatoria = new Random();
        int numeroAleatorio = cargAleatoria.nextInt(100) + 1;

        Scanner cargaDeDatos = new Scanner(System.in);
        int intentos = 0;
        int numeroAdivinado;


        System.out.println("Bienvenido al juego de adivinar el numero!");
        System.out.println("Adivina el numero del 1 al 100: ");

        do {
            intentos++;
            System.out.print("Intento #" + intentos + ": ");
            numeroAdivinado = cargaDeDatos.nextInt();

            if (numeroAdivinado < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (numeroAdivinado > numeroAleatorio){
                System.out.println("El numero es menor.");
            } else {
                System.out.println("¡Felicidades! ¡Has adivinado el numero en " + intentos + " intentos" );
            }
        } while (numeroAdivinado != numeroAleatorio);

        System.out.println("Fin del juego. Gracias por jugar.");
    }
}
