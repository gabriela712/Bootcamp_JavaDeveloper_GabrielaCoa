package Clase5;

import java.util.Scanner;
public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner cargaDeDatos= new Scanner(System.in);

        System.out.println("Ingrese el precio: ");
        double precio = cargaDeDatos.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        double descuento = cargaDeDatos.nextDouble();

        double precioFinal = calcularPrecioFinal(precio, descuento);

        System.out.println("Precio final despues del descuento: " + precioFinal);
    }
    public static double calcularPrecioFinal(double precio, double descuento) {
        double porcentajeDescuento = descuento / 100;
        double montoDescuento = precio * porcentajeDescuento;
        double precioFinal = precio - montoDescuento;

        return precioFinal;
    }
}
