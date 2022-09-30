package Pila;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Pila {

    private Nodo top;
    private static int n;

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
            n++;
        } else {
            n++;
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
        } else {
            JOptionPane.showMessageDialog(null, "Pila vacia.", "Pop", JOptionPane.ERROR_MESSAGE);
        }
        return s;
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
                if (aux.getSiguiente().getDato().getNum() == x) {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    JOptionPane.showMessageDialog(null, "Elemento extraido.", "Extraer",
                            JOptionPane.INFORMATION_MESSAGE);
                    n--;
                    return;
                } else {
                    aux = aux.getSiguiente();
                }
            }

            JOptionPane.showMessageDialog(null, "Elemento no pudo ser extraido.", "Extraer", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void ordenar() {
        int[] vec = new int[n+1];
        for (int i = -1; !isEmpty(); i++) {
            vec[i] = pop();
        }
        Arrays.sort(vec);
        for (int i = 0; i < vec.length; i++) {
            push(vec[i]);
        }
    }

    private int pop() {
        if (!isEmpty()) {
            int x = top.getDato().getNum();
            top = top.getSiguiente();
            JOptionPane.showMessageDialog(null, "Elemento desapilado.", "Pop", JOptionPane.INFORMATION_MESSAGE);
            return x;
        } else {
            JOptionPane.showMessageDialog(null, "Pila vacia.", "Pop", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

}
