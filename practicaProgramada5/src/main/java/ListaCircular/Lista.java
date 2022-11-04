package ListaCircular;

import Dialogo.Dialogo;

public class Lista {

    private Nodo inicio;
    private Nodo ultimo;

    public Lista() {
        this.inicio = null;
        this.ultimo = null;
    }

    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar() {
        Persona persona = new Persona();
        persona.setNombre(Dialogo.Capturar("Ingrese el nombre:", "Agregar", 1));
        persona.setId(Integer.parseInt(Dialogo.Capturar("Ingrese el id:", "Agregar", 1)));

        Nodo nuevo = new Nodo();
        nuevo.setDato(persona);
        if (isEmpty()) {
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        } else if (persona.getId() < inicio.getDato().getId()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
        } else if (persona.getId() >= ultimo.getDato().getId()) {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente().getDato().getId() < persona.getId()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public boolean encuentra(int id) {
        try {
            if (!isEmpty()) {
                if (inicio.getDato().getId() == id) {
                    Dialogo.Mostrar("Elemento encontrado.", "Encuentra", 1);
                    return true;
                } else {
                    Nodo anterior = inicio;
                    Nodo aux = inicio.getSiguiente();
                    while ((aux != inicio) && (aux.getDato().getId() != id)) {
                        anterior = anterior.getSiguiente();
                        aux = aux.getSiguiente();
                    }
                    if (aux != inicio) {
                        Dialogo.Mostrar("Elemento encontrado.", "Encuentra", 1);
                        return true;
                    } else {
                        Dialogo.Mostrar("Persona no encontrada.", "Encuentra", 0);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void modifica(int id) {
        try {
            if (!isEmpty()) {
                if (inicio.getDato().getId() == id) {
                    inicio.getDato().setNombre(Dialogo.Capturar("Ingrese el nuevo nombre:", "Modificar", 1));
                    Dialogo.Mostrar("Nombre modificado", "Modificar", 1);
                    return;
                } else {
                    Nodo anterior = inicio;
                    Nodo aux = inicio.getSiguiente();
                    while ((aux != inicio) && (aux.getDato().getId() != id)) {
                        anterior = anterior.getSiguiente();
                        aux = aux.getSiguiente();
                    }
                    if (aux != inicio) {
                        aux.getDato().setNombre(Dialogo.Capturar("Ingrese el nuevo nombre:", "Modificar", 1));
                        return;
                    } else {
                        Dialogo.Mostrar("Persona no encontrada.", "Modifica", 0);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        try {
            if (!isEmpty()) {
                if (inicio.getDato().getId() == id) {
                    inicio = inicio.getSiguiente();
                    ultimo.setSiguiente(inicio);
                    Dialogo.Mostrar("Elemento eliminado.", "Eliminar", 1);
                } else {
                    Nodo anterior = inicio;
                    Nodo aux = inicio.getSiguiente();
                    while ((aux != inicio) && (aux.getDato().getId() != id)) {
                        anterior = anterior.getSiguiente();
                        aux = aux.getSiguiente();
                    }
                    if (aux != inicio) {
                        anterior.setSiguiente(aux.getSiguiente());
                        ultimo.setSiguiente(inicio);
                        Dialogo.Mostrar("Elemento eliminado.", "Eliminar", 1);
                    } else {
                        Dialogo.Mostrar("Persona no encontrada.", "Eliminar", 0);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Persona extraer(int id) {
        try {
            if (!isEmpty()) {
                Persona persona = null;
                if (inicio.getDato().getId() == id) {
                    persona = inicio.getDato();
                    inicio = inicio.getSiguiente();
                    ultimo.setSiguiente(inicio);
                    Dialogo.Mostrar("Elemento eliminado.", "Eliminar", 1);
                    return persona;
                } else {
                    Nodo anterior = inicio;
                    Nodo aux = inicio.getSiguiente();
                    while ((aux != inicio) && (aux.getDato().getId() != id)) {
                        anterior = anterior.getSiguiente();
                        aux = aux.getSiguiente();
                    }
                    if (aux != inicio) {
                        Dialogo.Mostrar("Elemento eliminado.", "Eliminar", 1);
                        persona = aux.getDato();
                        anterior.setSiguiente(aux.getSiguiente());
                        ultimo.setSiguiente(inicio);
                        return persona;
                    } else {
                        Dialogo.Mostrar("Persona no encontrada.", "Extraer", 0);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void mostrar() {
        if (!isEmpty()) {
            String s = "";
            Nodo aux = inicio;
            s += aux.getDato().toString() + "->";
            aux = aux.getSiguiente();
            while (aux != inicio) {
                s += aux.getDato().toString() + "->";
                aux = aux.getSiguiente();
            }
            Dialogo.Mostrar("Lista:\n" + s, "Mostrar", 1);
        } else {
            Dialogo.Mostrar("Lista vacia.", "Mostrar", 0);
        }
    }

}
