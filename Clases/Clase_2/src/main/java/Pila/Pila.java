package Pila;

import javax.swing.JOptionPane;

public class Pila {

    private Nodo top;

    public Pila() {
        this.top = null;
    }

    // Revisa si la pila esta vacia comprobando si la cima tiene dato o no.
    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push() {
        // Se crea el objeto animal y se le setean valores al objeto
        Animal a = new Animal();
        a.setEspecie(JOptionPane.showInputDialog(null, "Ingrese la especie del animal:"));
        a.setPrecio((Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el precio del animal:"))));
        a.setTiempoVida(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tiempo de vida del animal:")));

        // Se crea un nodo y se le pasa por parametros el nuevo dato de animal
        Nodo nuevo = new Nodo();
        nuevo.setDato(a);

        // Verifiar, si no hay algo se coloca en la cima
        if (isEmpty()) {
            top = nuevo;
        } else {
            // Si esta lleno, apuntamos al siguiente dato y creamos la nueva cima
            nuevo.setSiguiente(top);
            top = nuevo;
        }

    }

}
