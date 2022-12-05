package Arbol;

import java.util.Scanner;

public class Arbol {

    private Nodo raiz;

    public Arbol() {
        anular();
    }

    public void anular() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null ? true : false;
    }

    public boolean esHoja(Nodo n) {
        return n.getHijoDer() == null && n.getHijoIzq() == null ? true
                : esHoja(n.getHijoDer()) && esHoja(n.getHijoIzq());
    }

    private void insertaR(Nodo n, Nodo r) {
        if (n.getDato() < r.getDato()) {
            if (r.getHijoIzq() == null) {
                r.setHijoIzq(n);
            } else {
                insertaR(n, r.getHijoIzq());
            }
        } else {
            if (r.getHijoDer() == null) {
                r.setHijoDer(n);
            } else {
                insertaR(n, r.getHijoDer());
            }
        }
    }

    public void insertaR(Nodo n) {
        if (isEmpty()) {
            raiz = n;
        } else {
            if (n.getDato() < raiz.getDato()) {
                if (raiz.getHijoIzq() == null) {
                    raiz.setHijoIzq(n);
                } else {
                    insertaR(n, raiz.getHijoIzq());
                }
            } else {
                if (raiz.getHijoDer() == null) {
                    raiz.setHijoDer(n);
                } else {
                    insertaR(n, raiz.getHijoDer());
                }
            }
        }
    }

    private void inOrden(Nodo r) {
        if (r != null) {
            inOrden(r.getHijoIzq());
            System.out.print(r.getDato() + "\t");
            inOrden(r.getHijoDer());
        }
    }

    public void imprimirIO() {
        inOrden(raiz);
    }

    public Nodo modificar(Nodo r, int dato) {
        if (r == null) {
            return null;
        } else {
            if (dato == r.getDato()) {
                System.out.println("\nEl nodo con el dato " + r.getDato() + " ha sido encontrado." + "\nIngrese dato nuevo:");
                Scanner sc = new Scanner(System.in);
                r.setDato(sc.nextInt());
                System.out.println("\nDato modificado a " + r.getDato());
                inOrden(raiz);
                sc.close();
                return r;
            } else {
                if (dato < r.getDato()) {
                    return modificar(r.getHijoIzq(), dato);
                } else {
                    return modificar(r.getHijoDer(), dato);
                }
            }
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

}
