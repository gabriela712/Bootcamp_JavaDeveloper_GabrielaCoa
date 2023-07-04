package Clase15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Figura objTriangulo = new Triangulo(10, 5);
        Figura objCuadrado = new Cuadrado(4);
        Figura objCirculo = new Circulo(10);


        System.out.println("El area del triangulo es: " + objTriangulo.calcularArea() );

        System.out.println("El perimetro del triangulo es: " + objTriangulo.calcularPerimetro() );

        Scanner teclado= new Scanner(System.in);

        int opcion;
        boolean mostrarMenu = true;
        while(mostrarMenu) {

            System.out.println("Seleccione, opcion(1), opcion(2), opcion(3)");
            System.out.println("(1) Opcion: Calcular el area del cuadrado");
            System.out.println("(2) Opcion: Calcular el area del triangulo");
            System.out.println("(3) Opcion: Calcular el area del circulo");
            System.out.println("(4) Opcion: Calcular el perimetro del cuadrado");
            System.out.println("(5) Opcion: Calcular el perimetro del triangulo");
            System.out.println("(6) Opcion: Calcular el perimetro del circulo");
            System.out.println("(0) Opcion: Salir");

            opcion = teclado.nextInt();

            switch(opcion) {
                case 1:
                    System.out.println("El area del cuadrado es: " + objCuadrado.calcularArea());
                    break;
                case 2:
                    System.out.println("El area del triangulo es: " + objTriangulo.calcularArea());
                    break;
                case 3:
                    System.out.println("El area del circulo es: " + objCirculo.calcularArea());
                    break;
                case 4:
                    System.out.println("El perimetro del cuadrado es: " + objCuadrado.calcularArea());
                    break;

                case 5:
                    System.out.println("El perimetro del triangulo es: " + objTriangulo.calcularArea());
                    break;

                case 6:
                    System.out.println("El perimetro del circulo es: " + objCirculo.calcularArea());
                    break;
                case 0:
                    mostrarMenu = false;break;
            }
            opcion = teclado.nextInt();
            }

        }
        while (mostrarMenu);

    }

}
