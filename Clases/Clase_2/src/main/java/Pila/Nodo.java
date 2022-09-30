package Pila;

public class Nodo {

    private Animal dato;
    // Puntero
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
    }

    public Animal getDato() {
        return this.dato;
    }

    public void setDato(Animal dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
