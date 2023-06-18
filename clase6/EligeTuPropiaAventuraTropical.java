package clase6;

import java.util.Scanner;

public class EligeTuPropiaAventuraTropical {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¡Bienvenido a la aventura tropical!");

        // Primera elección
        System.out.println("Te encuentras en una playa. ¿Deseas explorar la jungla cercana o bucear en el arrecife de coral? (j/b)");
        String decision1 = teclado.nextLine();

        if (decision1.equalsIgnoreCase("j")) {
            // Segunda elección
            System.out.println("Te adentras en la jungla y encuentras un sendero misterioso. ¿Deseas seguirlo o regresar a la playa? (s/r)");
            String decision2 = teclado.nextLine();

            if (decision2.equalsIgnoreCase("s")) {
                // Resultado de la segunda elección - Descubrimiento
                System.out.println("Sigue el sendero y descubres una cascada escondida. Disfrutas de un baño refrescante en sus aguas cristalinas.");
                System.out.println("Continúas explorando la jungla y encuentras especies de plantas y animales exóticos.");
            } else if (decision2.equalsIgnoreCase("r")) {
                // Resultado de la segunda elección - Relax
                System.out.println("Decides regresar a la playa y disfrutar del sol y las olas. Pasas el día relajándote en el paraíso tropical.");
            } else {
                // Opción inválida
                System.out.println("Opción inválida. La aventura ha terminado.");
            }

        } else if (decision1.equalsIgnoreCase("b")) {
            // Resultado de la primera elección - Buceo
            System.out.println("Decides explorar el arrecife de coral. Te sumerges en sus aguas y descubres un mundo submarino lleno de vida y color.");
            System.out.println("Nadas junto a peces tropicales y disfrutas de la belleza del arrecife.");
        } else {
            // Opción inválida
            System.out.println("Opción inválida. La aventura ha terminado.");
        }

        System.out.println("¡Gracias por jugar!");
    }
}
