package Grafo;

public class Nodo {
    
    private int vertice;
    private int peso;
    private Nodo siguiente;

    public Nodo(int vertice, int peso) {
        this.vertice = vertice;
        this.peso = peso;
        this.siguiente = null;
    }

    public int getVertice() {
        return vertice;
    }

    public void setVertice(int vertice) {
        this.vertice = vertice;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
