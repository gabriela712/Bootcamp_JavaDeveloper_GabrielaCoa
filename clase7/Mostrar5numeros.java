package clase7;

import java.util.Scanner;
public class Mostrar5numeros {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        Scanner cargaDeDatos = new Scanner(System.in);


        int contador = 0;
        while (contador < 5) {
            System.out.println("Ingrese un numero:");
            int numero = cargaDeDatos.nextInt();
            numeros[contador] = numero;
            contador++;
        }
        contador = 0;
        while (contador < 5) {
            System.out.print(numeros[contador]);
            contador++;
        }
    }

}
