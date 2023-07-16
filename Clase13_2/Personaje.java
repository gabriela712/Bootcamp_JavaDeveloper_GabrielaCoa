package Clase13_2;

public class Personaje {

    private String nombre;
    protected int nivel;
    protected int puntosDeVida;

    public Personaje(String nombre, int nivel, int puntosDeVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
    }

    public void atacar(Personaje objetivo) {
        System.out.println(nombre + "ataca a " + objetivo.getNombre());
        //Lógica de ataque aqui
    }
    public  void recibirDanio(int cantidadDanio) {
        puntosDeVida -= cantidadDanio;
        System.out.println(nombre + " recibe " + cantidadDanio + "puntos de daño.");
        if ( puntosDeVida <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }

    public void curarse(int cantidadCuracion) {
        puntosDeVida += cantidadCuracion;
        System.out.println(nombre + " se ha curado en " + cantidadCuracion + " puntos de vida.");
    }
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

}
