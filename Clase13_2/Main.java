package Clase13_2;


/*Ejercicio 2)
        Crea una clase base llamada "Personaje" con atributos como nombre, nivel y puntos de vida.
        Implementa métodos para que el personaje pueda atacar, recibir daño y curarse.
        Luego, crea clases derivadas como "Guerrero", "Mago" y "Arquero",
        que hereden de la clase base y añadan atributos y métodos específicos para cada tipo de personaje.
        Por ejemplo, la clase "Guerrero" podría tener un atributo adicional para la fuerza de ataque, mientras
        que la clase "Mago" podría tener un método para lanzar hechizos. Crea instancias de los diferentes personajes
        y simula un combate entre ellos.
        Puedes añadir más funcionalidades al juego de rol, como habilidades especiales, armas, armaduras,
        y enemigos con los que los personajes pueden luchar. La idea es que te diviertas creando y personalizando
        tu propio juego de rol utilizando la herencia y el polimorfismo en la programación orientada a objetos.*/

import Clase13.Circulo;
import Clase13.Cuadrado;
import Clase13.Figura;
import Clase13.Triangulo;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Guerrero guerrero = new Guerrero("Jean ", 10, 100, 15);
        Mago mago = new Mago("Peter ", 8, 80, 50);
        Arquero arquero = new Arquero("Robin ", 9, 90, 20);


        //Combate Simulado
        guerrero.atacar(mago);
        mago.lanzarHechizo(guerrero);
        arquero.dispararFlecha(guerrero);
        guerrero.golpeEspada(arquero);




        /*List<Personaje> personajes = new ArrayList<>();
        personajes.add(objGuerrero);
        personajes.add(objMago);
        personajes.add(objArquero);

        for(Personaje p:personajes){
            System.out.println("Ingrese el nombre del personaje: ");
            p.setNombre(teclado.nextLine());
            System.out.println("Ingrese los puntos de vida del " + p.getNombre());
            p.setPuntosDeVida(teclado.nextInt());
            System.out.println("Ingrese el nivel del " + p.getNombre());
            p.setNivel(teclado.nextInt());
            teclado.nextLine();
        }*/
    }
}
