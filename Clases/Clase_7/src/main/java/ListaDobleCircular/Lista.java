package ListaDobleCircular;

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
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca(Dialogo.Capturar(
                "Ingrese la marca del vehiculo:", "Agregar", 3));
        vehiculo.setModelo(Integer.parseInt(Dialogo.Capturar(
                "Ingrese el modelo del vehiculo:", "Agregar", 3)));

        Nodo nuevo = new Nodo();
        nuevo.setDato(vehiculo);
        if (isEmpty()) {
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        } else if (vehiculo.getModelo() < inicio.getDato().getModelo()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
        } else if (vehiculo.getModelo() >= ultimo.getDato().getModelo()) {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente().getDato().getModelo() < vehiculo.getModelo()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public void extraer() {
        if (!isEmpty()) {
            inicio = inicio.getSiguiente();
            ultimo.setSiguiente(inicio);
            Dialogo.Mostrar("Elemento extraido.", "Extraer", 1);
        } else {
            Dialogo.Mostrar("Elemento no extraido.", "Extraer", 0);
        }
    }

    public void extraerEspecifico() {
        try {
            if (!isEmpty()) {
                String marca = Dialogo.Capturar("Ingrese marca del vehiculo a eliminar:", "Extraer", 3);
                if (inicio.getDato().getMarca().equals(marca)) {
                    inicio = inicio.getSiguiente();
                    ultimo.setSiguiente(inicio);
                    Dialogo.Mostrar("Elemento extraido.", "Extraer", 1);
                } else {
                    Nodo anterior = inicio;
                    Nodo aux = inicio.getSiguiente();
                    while ((aux != inicio) && (!aux.getDato().getMarca().equals(marca))) {
                        anterior = anterior.getSiguiente();
                        aux = aux.getSiguiente();
                    }
                    if (aux != inicio) {
                        anterior.setSiguiente(aux.getSiguiente());
                        ultimo.setSiguiente(inicio);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
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
