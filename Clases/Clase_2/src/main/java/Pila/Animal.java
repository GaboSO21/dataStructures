package Pila;

public class Animal {

    private String especie;
    private int tiempoVida;
    private double precio;

    public Animal() {
        this.especie = "";
        this.tiempoVida = 0;
        this.precio = 0f;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getTiempoVida() {
        return this.tiempoVida;
    }

    public void setTiempoVida(int tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
