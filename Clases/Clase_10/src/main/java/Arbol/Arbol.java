package Arbol;

import javax.swing.JOptionPane;

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

    private void imprimeMenor(Nodo raiz) {
        if (raiz.getHijoIzq() == null) {
            System.out.println(raiz.getElemento().getNum() + "");
        } else {
            imprimeMenor(raiz.getHijoIzq());
        }
    }

    public void imprimirMenor() {
        this.imprimeMenor(raiz);
    }

    private void imprimeHojas(Nodo raiz) {
        if (raiz.getHijoIzq() != null && raiz.getHijoDer() != null) {
            imprimeHojas(raiz.getHijoIzq());
            imprimeHojas(raiz.getHijoDer());
        } else if (raiz.getHijoIzq() == null && raiz.getHijoDer() != null) {
            imprimeHojas(raiz.getHijoDer());
        } else if (raiz.getHijoIzq() != null && raiz.getHijoDer() == null) {
            imprimeHojas(raiz.getHijoIzq());
        } else {
            System.out.println(raiz.getElemento().getNum() + " ");
        }
    }

    public void imprimeHojas() {
        this.imprimeHojas(raiz);
    }

    private void imprimeNivel(Nodo raiz, int num, int cont) {
        if (num == cont) {
            System.out.println(raiz.getElemento().getNum() + " ");
        } else {
            try {
                imprimeNivel(raiz.getHijoIzq(), num, (cont + 1));
                imprimeNivel(raiz.getHijoDer(), num, (cont + 1));
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void imprimeNivel(int num) {
        this.imprimeNivel(raiz, num, 0);
    }

    public void crearRaiz() {
        Dato d = new Dato();
        d.setNum(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero:", "Insertar", 1)));
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

    private void preOrden(Nodo n) {
        if (n != null) {
            System.out.println(n.getElemento().getNum() + " ");
            preOrden(n.getHijoIzq());
            preOrden(n.getHijoDer());
        }
    }

    public void preOrden() {
        this.preOrden(raiz);
    }

    private void inOrden(Nodo n) {
        if (n != null) {
            inOrden(n.getHijoIzq());
            System.out.println(n.getElemento().getNum() + " ");
            inOrden(n.getHijoDer());
        }
    }

    public void inOrden() {
        this.inOrden(raiz);
    }

    private void postOrden(Nodo n) {
        if (n != null) {
            postOrden(n.getHijoIzq());
            postOrden(n.getHijoDer());
            System.out.println(n.getElemento().getNum() + " ");
        }
    }

    public void postOrden() {
        this.postOrden(raiz);
    }

}
