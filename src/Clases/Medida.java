package Clases;

public class Medida {

    private double largo;
    private double ancho;

    public Medida(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getLargo() {
        return largo;
    }

    @Override
    public String toString() {
        return largo + "x" + ancho;
    }

}
