package Clase13_2;

public abstract class Personaje {

    protected String nombre;

    protected int nivel;

    protected int puntosDeVida;

    public abstract void atacar(Personaje personaje);

    public abstract int recibirDaño(Personaje personaje);

    public abstract void curarse(Personaje personaje);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }
}
