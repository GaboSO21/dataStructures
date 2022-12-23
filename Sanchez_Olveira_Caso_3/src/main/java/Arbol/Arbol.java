package Arbol;

public class Arbol {
    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void crearNodo(Nodo raiz, Nodo nuevo) {
        if (nuevo.getElemento().getNum() <= raiz.getElemento().getNum()) {
            if (raiz.getHijoIzq() == null) {
                raiz.setHijoIzq(nuevo);
            } else {
                crearNodo(raiz.getHijoIzq(), nuevo);
            }
        } else {
            if (raiz.getHijoDer() == null) {
                raiz.setHijoDer(nuevo);
            } else {
                crearNodo(raiz.getHijoDer(), nuevo);
            }
        }
    }

    public void imprimeIzq(Nodo raiz) {
        if (raiz.getHijoIzq() == null) {
            System.out.println(raiz.getElemento().getNum() + "");
        } else {
            System.out.println(raiz.getElemento().getNum() + "");
            imprimeIzq(raiz.getHijoIzq());
        }
    }

    private Nodo buscarIzq(int num, Nodo nodo) {
        if (nodo != null) {
            if (nodo.getElemento().getNum() == num) {
                imprimeIzq(nodo);
                return nodo;
            } else {
                Nodo nodoEncontrado = buscarIzq(num, nodo.getHijoIzq());
                if (nodoEncontrado == null) {
                    nodoEncontrado = buscarIzq(num, nodo.getHijoDer());
                }
                return nodoEncontrado;
            }
        } else {
            return null;
        }
    }

    public Nodo buscarIzq(int num) {
        return this.buscarIzq(num, raiz);
    }

    private int contarRepetidos(Nodo raiz, Nodo prev) {
        if (raiz == null) {
            return 0;
        }

        int count = 0;
        if (raiz.getElemento().getNum() == prev.getElemento().getNum()) {
            count++;
        }
        return count + contarRepetidos(raiz.getHijoIzq(), raiz) + contarRepetidos(raiz.getHijoDer(), raiz);
    }

    public int contarRepetidos() {
        return this.contarRepetidos(raiz, raiz);
    }


    public void crearRaiz(int num) {
        Dato d = new Dato();
        d.setNum(num);
        Nodo nuevo = new Nodo();
        nuevo.setElemento(d);

        if (isEmpty()) {
            raiz = nuevo;
        } else {
            crearNodo(raiz, nuevo);
        }
    }

    public void mostrarNodo(Nodo n) {
        if (n != null) {
            mostrarNodo(n.getHijoIzq());
            System.out.print(n.getElemento().getNum() + " ");
            mostrarNodo(n.getHijoDer());
        }
    }

    public void mostrarRaiz() {
        if (!isEmpty()) {
            mostrarNodo(raiz);
        } else {
            System.out.println("Arbol vacio");
        }
    }

}
