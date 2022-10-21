package Lista;

public class Dato {

    private String nombre;
    private int id;

    public Dato() {
        this.nombre = "";
        this.id = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dato{");
        sb.append("nombre=").append(nombre);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }

}
