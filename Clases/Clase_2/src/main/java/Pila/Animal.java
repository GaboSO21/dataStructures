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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal{");
        sb.append("especie=").append(especie);
        sb.append(", tiempoVida=").append(tiempoVida);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

}
