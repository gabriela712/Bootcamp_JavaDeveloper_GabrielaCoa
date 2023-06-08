package Clase5;

import java.util.Scanner;
public class MillasAKilometros {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de millas: ");
        double millas = cargaDeDatos.nextDouble();

        //Factor de conversión: 1 milla = 1.60934 kilómetros
        double kilometros = millas * 1.60934;

        System.out.println(millas + "millas equivalentes a " + kilometros + " kilómetros.");
    }
}
