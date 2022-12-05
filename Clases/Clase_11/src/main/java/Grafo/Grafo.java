package Grafo;

public class Grafo {

    private Nodo grafo[];
    private int nvertices;

    public Grafo(int nvertices) {
        this.nvertices = nvertices;
        this.grafo = new Nodo[nvertices];
        for (int i = 0; i < grafo.length; i++) {
            grafo[i] = null;
        }
    }

    public boolean existeArista(int v1, int v2) {
        if (grafo[v1] == null) {
            return false;
        } else {
            Nodo actual = grafo[v1];
            while (actual != null) {
                if (actual.getVertice() == v2) {
                    return true;
                }
                actual = actual.getSiguiente();
            }
        }
        return false;
    }

    public void insertaArista(int v1, int v2, int peso) {
        if (!existeArista(v1, v2)) {
            Nodo nuevo = new Nodo(v2, peso);
            if (grafo[v1] == null) {
                grafo[v1] = nuevo;
            } else {
                Nodo actual = grafo[v1];
                while (actual.getSiguiente() != null) {
                    actual = actual.getSiguiente();
                }
                actual.setSiguiente(nuevo);
            }
        } else {
            System.out.println("Ya existe una arista entre " + v1 + " y " + v2);
        }
    }

    public void eliminarArista(int v1, int v2) {
        if (!existeArista(v1, v2)) {
            Nodo actual = grafo[v1];
            if (actual.getVertice() == v2) {
                grafo[v1] = actual.getSiguiente();
            } else {
                Nodo anterior = actual;
                actual = actual.getSiguiente();
                while (actual.getVertice() == v2) {
                    if (actual.getVertice() == v2) {
                        anterior.setSiguiente(actual.getSiguiente());
                        return;
                    }
                }
                anterior = actual;
                actual.getSiguiente();
            }
        } else {
            System.out.println("Ya existe una arista entre " + v1 + " y " + v2);
        }
    }

    public boolean isEmpty(int v1) {
        if (grafo[v1] == null) {
            return true;
        } else {
            return false;
        }
    }

    public Nodo sigNodo(Nodo anterior) {
        if (anterior.getSiguiente() == null) {
            return null;
        } else {
            return anterior.getSiguiente();
        }
    }

    public Nodo getPrimerAd(int v) {
        return grafo[v];
    }

    public void mostrar() {
        for (int i = 0; i < grafo.length; i++) {
            Nodo actual = grafo[i];
            while (actual != null) {
                System.out.printf("%d ->", i);
                System.out.printf("%d(%d)\n", actual.getVertice(), actual.getPeso());
                actual = actual.getSiguiente();
            }
            System.out.println("");
        }
    }

}
