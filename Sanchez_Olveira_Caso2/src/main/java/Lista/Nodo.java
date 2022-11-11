package Lista;

public class Nodo {

    private Animal dato;
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
    }

    public Animal getDato() {
        return dato;
    }

    public void setDato(Animal dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
