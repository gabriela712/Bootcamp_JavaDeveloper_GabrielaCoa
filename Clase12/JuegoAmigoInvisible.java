package Clase12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JuegoAmigoInvisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de participantes: ");
        int cantidadParticipantes = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        List<String> participantes = new ArrayList<>();

        // Obtener los nombres de los participantes
        for (int i = 0; i < cantidadParticipantes; i++) {
            System.out.print("Ingresa el nombre del participante " + (i + 1) + ": ");
            participantes.add(scanner.nextLine());
        }

        // Mezclar la lista de participantes
        Collections.shuffle(participantes);

        // Asignar a cada participante su amigo invisible
        for (String participante : participantes) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.print(participante + ", presiona enter para ver a quién debes darle un regalo.");
            scanner.nextLine();


            String amigoInvisible = participantes.get((participantes.indexOf(participante) + 1) % cantidadParticipantes);
            System.out.println("¡Hola " + participante + "! Debes darle un regalo a: " + amigoInvisible);
            System.out.println("Presiona enter para continuar.");

            scanner.nextLine();
        }
    }
}
