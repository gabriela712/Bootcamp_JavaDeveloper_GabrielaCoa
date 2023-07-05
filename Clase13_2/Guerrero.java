package Clase13_2;

public class Guerrero extends Personaje{

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public int getNivel() {
        return super.getNivel();
    }

    @Override
    public void setNivel(int nivel) {
        super.setNivel(nivel);
    }

    @Override
    public int getPuntosDeVida() {
        return super.getPuntosDeVida();
    }

    @Override
    public void setPuntosDeVida(int puntosDeVida) {
        super.setPuntosDeVida(puntosDeVida);
    }

    @Override
    public void atacar(Personaje personaje) {
    }

    @Override
    public int recibirDaño(Personaje personaje) {
        return 0;
    }

    @Override
    public void curarse(Personaje personaje) {

    }
}
