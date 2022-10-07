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

    public void enQueue(int x) {
        Dato dato = new Dato();
        dato.setNum(x);

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

    public boolean encuentra(int x) {
        if (!isEmpty()) {
            Nodo temp = inicio;
            while (temp != null) {
                if (temp.getDato().getNum() == x) {
                    return true;
                } else {
                    temp = temp.getSiguiente();
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public void extrae(int x) {
        if (!isEmpty()) {
            Nodo temp = inicio;
            while (temp != null) {
                if (temp.getDato().getNum() == x) {
                    inicio = inicio.getSiguiente();
                    JOptionPane.showMessageDialog(null, "Elemento extraido.", "Extraer",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                } else if (temp.getSiguiente().getDato().getNum() == x) {
                    temp.setSiguiente(temp.getSiguiente().getSiguiente());
                    JOptionPane.showMessageDialog(null, "Elemento extraido.", "Extraer",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                } else {
                    temp = temp.getSiguiente();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cola vacia.", "Vacia", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ordenarAscendente() {
        Nodo auxInicio = null;
        Nodo auxFin = null;
        while (!isEmpty()) {
            Nodo temp = inicio;
            int mayor = temp.getDato().getNum();
            while (temp != null) {
                if (mayor < temp.getDato().getNum()) {
                    mayor = temp.getDato().getNum();
                } else {
                    temp = temp.getSiguiente();
                }
            }
            Nodo nuevo = new Nodo();
            Dato dato = new Dato();
            nuevo.setDato(dato);
            nuevo.getDato().setNum(mayor);
            if (auxInicio == null) {
                auxInicio = nuevo;
                auxFin = nuevo;
            } else {
                auxFin.setSiguiente(nuevo);
                auxFin = nuevo;
            }
            extrae(mayor);
        }
        inicio = auxInicio;
        fin = auxFin;
    }

    public void ordenarDescendente() {
        Nodo auxInicio = null;
        Nodo auxFin = null;
        while (!isEmpty()) {
            Nodo temp = inicio;
            int mayor = temp.getDato().getNum();
            while (temp != null) {
                if (mayor > temp.getDato().getNum()) {
                    mayor = temp.getDato().getNum();
                } else {
                    temp = temp.getSiguiente();
                }
            }
            Nodo nuevo = new Nodo();
            Dato dato = new Dato();
            nuevo.setDato(dato);
            nuevo.getDato().setNum(mayor);
            if (auxInicio == null) {
                auxInicio = nuevo;
                auxFin = nuevo;
            } else {
                auxFin.setSiguiente(nuevo);
                auxFin = nuevo;
            }
            extrae(mayor);
        }
        inicio = auxInicio;
        fin = auxFin;
    }
}
