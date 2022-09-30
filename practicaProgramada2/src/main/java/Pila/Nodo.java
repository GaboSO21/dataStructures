package Pila;

public class Nodo {

    private Dato dato;
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
    }

    public Dato getDato() {
        return this.dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
