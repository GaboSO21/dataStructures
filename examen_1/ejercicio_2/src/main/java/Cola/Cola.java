package Cola;

import javax.swing.JOptionPane;

public class Cola {

    private Nodo inicio;
    private Nodo fin;
    private int total, cant;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    public int getTotal() {
        return total;
    }

    public int getCant() {
        return cant;
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
        dato.setNombre(JOptionPane.showInputDialog(null, "Ingrese su nombre para ingresar a la cola: ",
                "Ingresar a cola", JOptionPane.QUESTION_MESSAGE));
        int op = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Que tiquete desea?\n[1].Normal (5600) \n[2].VIP (15500) ",
                        "Comprar tiquete", JOptionPane.QUESTION_MESSAGE));
        switch (op) {
            case 1:
                dato.setTiquete(5600);
                break;
            case 2:
                dato.setTiquete(15500);
                break;
        }
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
            total += inicio.getDato().getTiquete();
            cant++;
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
