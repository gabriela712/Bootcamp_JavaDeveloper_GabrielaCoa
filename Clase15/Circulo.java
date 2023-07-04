package Clase15;

public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo(){

    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {

        double area = (Math.PI * Math.pow(radio, 2));

        return area;
    }

    @Override
    public double calcularPerimetro() {
        int area;

        double perimetro = 2 * Math.PI * area;

        return perimetro;
    }
}
