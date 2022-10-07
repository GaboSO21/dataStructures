package Cola;

public class Dato {

    private String nombre;
    private double calificacion;

    public Dato() {
        this.nombre = "";
        this.calificacion = 0.0f;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dato{");
        sb.append("nombre=").append(nombre);
        sb.append(", calificacion=").append(calificacion);
        sb.append('}');
        return sb.toString();
    }

}
