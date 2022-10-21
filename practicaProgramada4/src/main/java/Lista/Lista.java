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

    public void eliminar() {
        if (!isEmpty()) {
            JOptionPane.showMessageDialog(null, "Elemento extraido: " + inicio.getDato().toString(), "Extraer", 1);
            inicio = inicio.getSiguiente();
        } else {
            JOptionPane.showMessageDialog(null, "Elemento no extraido, lista vacia.", "Extraer", 0);
        }
    }

    public void agregar() {
        Dato v = new Dato();
        v.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona: ", "Agregar", 3));
        v.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id de la persona: ", "Agregar", 3)));
        Nodo nuevo = new Nodo();
        nuevo.setDato(v);

        if (isEmpty()) {
            inicio = nuevo;
        } else if (v.getId() < inicio.getDato().getId()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        } else if (inicio.getSiguiente() == null) {
            inicio.setSiguiente(nuevo);
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().getId() < v.getId()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public boolean existe(int id) {
        if (!isEmpty()) {
            Nodo aux = inicio;
            while (aux != null) {
                if (aux.getDato().getId() == id) {
                    JOptionPane.showMessageDialog(null, "La persona con id - " + id + " - si existe en la lista.",
                            "Existe", 1);
                    return true;
                } else {
                    aux = aux.getSiguiente();
                }
            }
        }
        JOptionPane.showMessageDialog(null, "La persona con id - " + id + " - no existe en la lista.", "Existe", 0);
        return false;
    }

    public void modifica(int id) {
        if (!isEmpty()) {
            Nodo aux = inicio;
            while (aux != null) {
                if (aux.getDato().getId() == id) {
                    aux.getDato()
                            .setNombre(JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ", "Modificar", 1));
                    return;
                } else {
                    aux = aux.getSiguiente();
                }
            }
        }
        JOptionPane.showMessageDialog(null, "La persona con id - " + id + " - no existe en la lista.", "Modificar", 0);
        return;
    }

    public void eliminar(int id) {
        if (!isEmpty()) {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                if (inicio.getDato().getId() == id) {
                    JOptionPane.showMessageDialog(null, "Persona eliminada: " + inicio.getDato().toString(),
                            "Eliminar", 1);

                    inicio = inicio.getSiguiente();
                    return;
                } else if (aux.getSiguiente().getDato().getId() == id) {
                    JOptionPane.showMessageDialog(null, "Persona eliminada: " + aux.getSiguiente().getDato().toString(),
                            "Eliminar", 1);
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    return;
                } else {
                    aux = aux.getSiguiente();
                }
            }
        }
        JOptionPane.showMessageDialog(null, "La persona con id - " + id + " - no existe en la lista.", "Eliminar", 0);
        return;
    }

    public Dato extraer(int id) {
        if (!isEmpty()) {
            Nodo aux = inicio;
            Dato dato = null;
            while (aux.getSiguiente() != null) {
                if (inicio.getDato().getId() == id) {
                    JOptionPane.showMessageDialog(null, "Persona extraida: " + inicio.getDato().toString(),
                            "Extraer", 1);
                    dato = aux.getDato();
                    inicio = inicio.getSiguiente();
                    return dato;

                } else if (aux.getSiguiente().getDato().getId() == id) {
                    JOptionPane.showMessageDialog(null, "Persona extraida: " + aux.getSiguiente().getDato().toString(),
                            "Extraer", 1);
                    dato = aux.getDato();
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    return dato;
                } else {
                    aux = aux.getSiguiente();
                }
            }
        }
        JOptionPane.showMessageDialog(null, "La persona con id - " + id + " - no existe en la lista.", "Eliminar", 0);
        return null;
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
