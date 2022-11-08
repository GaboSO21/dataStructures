package Lista;

import javax.swing.JOptionPane;

public class Lista {

    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertar() {
        Dato dato = new Dato();
        dato.setNum(Integer.parseInt(
                (JOptionPane.showInputDialog(null, "Ingrese un numero: ", "Insertar", JOptionPane.QUESTION_MESSAGE))));
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if (dato.getNum() < inicio.getDato().getNum()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if (dato.getNum() > fin.getDato().getNum()) {
            fin.setSiguiente(nuevo);
            fin = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente().getDato().getNum() < dato.getNum()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        }
    }

    public void extraer() {
        if (!isEmpty()) {
            inicio = inicio.getSiguiente();
            fin.setSiguiente(inicio);
            JOptionPane.showMessageDialog(null, "Elemento extraido.", "Extraer", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia.", "Extraer", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrar() {
        if (!isEmpty()) {
            String s = "";
            Nodo aux = inicio;
            s += aux.getDato().toString() + "//";
            aux = aux.getSiguiente();
            while (aux != inicio) {
                s += aux.getDato().toString() + " // ";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, s, "Mostrar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia", "Mostrar", JOptionPane.ERROR_MESSAGE);
        }
    }

}
