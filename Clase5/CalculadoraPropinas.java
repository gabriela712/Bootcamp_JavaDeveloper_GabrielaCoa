package Clase5;

import java.util.Scanner;
public class CalculadoraPropinas {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Ingrese el total de la cuenta: ");
        double montoCuenta = cargaDeDatos.nextDouble();

        System.out.println("Ingrese el porcentaje de propina: ");
        double porcentajePropina = cargaDeDatos.nextDouble();

        double propina = montoCuenta * (porcentajePropina / 100);
        double totalPago = montoCuenta + propina;

        System.out.println("Monto de la cuenta: $" + montoCuenta);
        System.out.println("Propina: $" + propina);
        System.out.println("Total a pagar: $" + totalPago);
    }

}