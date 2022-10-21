package Lista;

import javax.swing.JOptionPane;

public class Lista {

    private Nodo inicio;

    public Lista() {
        this.inicio = null;
    }

    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar() {
        Vehiculo v = new Vehiculo();
        v.setMarca(JOptionPane.showInputDialog(null, "Ingrese la marca del vehiculo: ", "Marca", 3));
        v.setModelo(
                Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el modelo del vehiculo: ", "Modelo", 3)));

        Nodo nuevo = new Nodo();
        nuevo.setDato(v);

        if (isEmpty()) {
            inicio = nuevo;
        } else if (v.getModelo() < inicio.getDato().getModelo()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        } else if (inicio.getSiguiente() == null) {
            inicio.setSiguiente(nuevo);
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().getModelo() < v.getModelo()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public void extraer() {
        if (!isEmpty()) {
            JOptionPane.showMessageDialog(null, "Elemento extraido: " + inicio.getDato().toString(), "Extraer", 1);
            inicio = inicio.getSiguiente();
        } else {
            JOptionPane.showMessageDialog(null, "Elemento no extraido, lista vacia.", "Extraer", 0);
        }
    }

    public String toString() {
        String datos = "";
        if (!isEmpty()) {
            Nodo aux = inicio;
            while (aux != null) {
                datos += aux.getDato().toString() + " || ";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Lista:\n" + datos, "toString", 1);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar, lista vacia.", "toString", 0);
        }
        return datos;
    }
}
