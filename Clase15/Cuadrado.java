package Clase15;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {

        double area = Math.pow(lado, 2);

        return area;
    }

    @Override
    public double calcularPerimetro() {

        double perimetro = Math.pow(lado * 2);
        return perimetro;
    }
}
