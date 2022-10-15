package Cola;

public class Dato {

    private String nombre;
    private int tiquete;

    public Dato() {
        this.nombre = "";
        this.tiquete = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiquete() {
        return tiquete;
    }

    public void setTiquete(int tiquete) {
        this.tiquete = tiquete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dato{");
        sb.append("nombre=").append(nombre);
        sb.append(", tiquete=").append(tiquete);
        sb.append('}');
        return sb.toString();
    }

}
