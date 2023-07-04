package Clase15;

public class Triangulo extends Figura {

    private double base;

    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {

        double area = (base * altura)/2;

        return area;
    }

    public double calcularPerimetro() {

        int hipotenusa = (int) Math.sqrt((Math.pow(base,2))+(Math.pow(altura,2);

        return (hipotenusa + base + altura);
    }

}
