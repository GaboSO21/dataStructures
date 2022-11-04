package ListaDobleCircular;

public class Vehiculo {

    private String marca;
    private int modelo;

    public Vehiculo() {
        this.marca = "";
        this.modelo = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append('}');
        return sb.toString();
    }

}
