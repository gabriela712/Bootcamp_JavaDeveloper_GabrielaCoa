package Clase5;

import java.util.Scanner;

public class EjemploDeEdad {
    public static void main(String[] args) {
        System.out.println("¿Que edad tienes?");
        Scanner cargaDeDatos = new Scanner(System.in);
        Integer edad = cargaDeDatos.nextInt();


        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}