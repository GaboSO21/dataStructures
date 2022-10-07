package Cola;

import javax.swing.JOptionPane;

public class Cola {

    private Nodo inicio;
    private Nodo fin;

    public Cola() {
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

    public void enQueue() {
        Dato dato = new Dato();
        dato.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante: "));
        dato.setCalificacion(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su calificacion: ")));

        Nodo temp = new Nodo();
        temp.setDato(dato);

        if (isEmpty()) {
            inicio = temp;
            fin = temp;
        } else {
            fin.setSiguiente(temp);
            fin = temp;
        }
    }

    public void deQueue() {
        if (!isEmpty()) {
            JOptionPane.showMessageDialog(null, inicio.getDato().toString() + "--> ha salido de la cola", "deQueue",
                    JOptionPane.INFORMATION_MESSAGE);
            inicio = inicio.getSiguiente();
        } else {
            JOptionPane.showMessageDialog(null, "La cola esta vacia.", "deQueue", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String toString() {
        if (!isEmpty()) {
            Nodo temp = inicio;
            String s = "";
            while (temp != null) {
                s += temp.getDato().toString() + "\n";
                temp = temp.getSiguiente();
            }
            return s;
        } else {
            return "Cola vacia";
        }
    }
}
