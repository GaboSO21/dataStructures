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

    public void Insertar() {
        Animal dato = new Animal();
        dato.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del animal: ", "Nombre", 3));
        dato.setEdad(
                Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del animal: ", "Edad", 3)));
        dato.setTratamiento(JOptionPane.showInputDialog(null, "Digite el tratamiento realizado: ", "Tratamiento", 3));
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if (isEmpty()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void Ordenar() {
        Animal dato = null;
        Nodo temp = null;
        while (!isEmpty()) {
            dato = extraer();
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);
            if (temp == null) {
                temp = nuevo;
            } else if (dato.getEdad() > temp.getDato().getEdad()) {
                nuevo.setSiguiente(temp);
                temp = nuevo;
            } else if (temp.getSiguiente() == null) {
                temp.setSiguiente(nuevo);
            } else {
                Nodo aux = temp;
                while (aux.getSiguiente() != null && aux.getSiguiente().getDato().getEdad() > dato.getEdad()) {
                    aux = aux.getSiguiente();
                }
                nuevo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(nuevo);
            }
        }
        inicio = temp;
        JOptionPane.showMessageDialog(null, "Elementos ordenados.", "Ordenar", 1);
    }

    public Animal extraer() {
        if (!isEmpty()) {
            Animal dato = inicio.getDato();
            inicio = inicio.getSiguiente();
            return dato;
        } else {
            return null;
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
