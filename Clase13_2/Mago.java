package Clase13_2;

public class Mago extends Personaje{

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setNivel(int nivel) {
        super.setNivel(nivel);
    }

    @Override
    public void setPuntosDeVida(int puntosDeVida) {
        super.setPuntosDeVida(puntosDeVida);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public int getNivel() {
        return super.getNivel();
    }

    @Override
    public int getPuntosDeVida() {
        return super.getPuntosDeVida();
    }

    @Override
    public void atacar(Personaje personaje) {
        System.out.println("Personaje que esta atacando: " + personaje.getNombre());
    }

    @Override
    public int recibirDaño(Personaje personaje) {
        return 0;
    }

    @Override
    public void curarse(Personaje personaje) {

    }
    public void lanzarHechizos(){
        System.out.println("Hechizo lanzado");
    }
}
