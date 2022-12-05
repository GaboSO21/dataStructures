package Arbol;

public class Nodo {

    private int dato;
    private Nodo hijoIzq;
    private Nodo hijoDer;

    public Nodo() {

    }

    public Nodo(int dato) {
        this.dato = dato;
        this.hijoIzq = null;
        this.hijoDer = null;
    }

    public Nodo(int dato, Nodo hijoIzq, Nodo hijoDer) {
        this.dato = dato;
        this.hijoIzq = hijoIzq;
        this.hijoDer = hijoDer;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Nodo getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Nodo hijoDer) {
        this.hijoDer = hijoDer;
    }

}
