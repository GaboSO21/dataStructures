package ListaDobleCircular;

public class Nodo {

    private Vehiculo dato;
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
    }

    public Vehiculo getDato() {
        return dato;
    }

    public void setDato(Vehiculo dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
