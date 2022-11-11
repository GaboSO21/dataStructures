package Lista;

public class Animal {

    private String nombre;
    private int edad;
    private String tratamiento;

    public Animal() {
        this.nombre = "";
        this.edad = 0;
        this.tratamiento = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", edad=" + edad + ", tratamiento=" + tratamiento + "]";
    }

}
