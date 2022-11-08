package Lista;

public class Nodo {

    private Dato dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo() {
        this.siguiente = null;
        this.anterior = null;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    

}
