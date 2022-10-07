package Pila;

import javax.swing.JOptionPane;

public class Pila {

    private Nodo top;

    public Pila() {
        this.top = null;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int x) {

        Dato a = new Dato();
        a.setNum(x);
        Nodo nuevo = new Nodo();
        nuevo.setDato(a);

        if (isEmpty()) {
            top = nuevo;
        } else {
            nuevo.setSiguiente(top);
            top = nuevo;
        }

    }

    public String toString() {
        String s = "";
        if (!isEmpty()) {
            Nodo aux = top;
            while (aux != null) {
                s += aux.getDato().toString() + "\n";

                aux = aux.getSiguiente();
            }
            return s;
        } else {
            JOptionPane.showMessageDialog(null, "Pila vacia.", "Pop", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

    public boolean encuentra(int x) {
        if (!isEmpty()) {
            Nodo aux = top;
            while (aux != null) {
                if (aux.getDato().getNum() == x) {
                    return true;
                }
                aux = aux.getSiguiente();
            }
        }
        return false;
    }

    public void extraer(int x) {
        if (!isEmpty()) {
            Nodo aux = top;
            while (aux != null) {
                if (aux.getDato().getNum() == x) {
                    top = top.getSiguiente();
                    JOptionPane.showMessageDialog(null, "Elemento extraido.", "Extraer",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                } else if (aux.getSiguiente().getDato().getNum() == x) {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    JOptionPane.showMessageDialog(null, "Elemento extraido.", "Extraer",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                } else {
                    aux = aux.getSiguiente();
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Elemento no pudo ser extraido.", "Extraer", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void ordenarAscendente() {

        Nodo aux = null;

        while (!isEmpty()) {
            Nodo temporal = top;
            int mayor = temporal.getDato().getNum();
            while (temporal != null) {
                if (mayor > temporal.getDato().getNum()) {
                    mayor = temporal.getDato().getNum();
                } else if (temporal.getSiguiente() == null) {
                    if (top.getSiguiente() == null) {
                        mayor = top.getDato().getNum();
                    }
                    break;
                } else {
                    temporal = temporal.getSiguiente();
                }
            }
            Nodo n = new Nodo();
            Dato dato = new Dato();
            n.setDato(dato);
            n.getDato().setNum(mayor);
            if (aux == null) {
                aux = n;
            } else {
                n.setSiguiente(aux);
                aux = n;
            }
            extraer(mayor);
        }
        top = aux;
    }

    public void ordenarDescendente() {

        Nodo aux = null;

        while (!isEmpty()) {
            Nodo temporal = top;
            int mayor = temporal.getDato().getNum();
            while (temporal != null) {
                if (mayor < temporal.getDato().getNum()) {
                    mayor = temporal.getDato().getNum();
                } else if (temporal.getSiguiente() == null) {
                    if (top.getSiguiente() == null) {
                        mayor = top.getDato().getNum();
                    }
                    break;
                } else {
                    temporal = temporal.getSiguiente();
                }
            }
            Nodo n = new Nodo();
            Dato dato = new Dato();
            n.setDato(dato);
            n.getDato().setNum(mayor);
            if (aux == null) {
                aux = n;
            } else {
                n.setSiguiente(aux);
                aux = n;
            }
            extraer(mayor);
        }
        top = aux;
    }
}
