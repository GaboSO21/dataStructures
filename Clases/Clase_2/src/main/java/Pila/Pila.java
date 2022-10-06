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
            // Si esta lleno, apuntamos al siguiente nodo y creamos la nueva cima
            nuevo.setSiguiente(top);
            top = nuevo;
        }

    }

    public void pop() {
        // Revisa si la pila esta vacia, si no, establece la anterior cima como la nueva
        // cima.
        if (!isEmpty()) {
            top = top.getSiguiente();
            JOptionPane.showMessageDialog(null, "Elemento desapilado.", "Pop", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Pila vacia.", "Pop", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String toString(){
        String s = "";
        if(!isEmpty()){
            Nodo aux = top;
            while(aux != null){
                s +=    aux.getDato().toString() + "\n";

                aux = aux.getSiguiente();
            }
            return s;
        }else{
            JOptionPane.showMessageDialog(null, "Pila vacia.", "Pop", JOptionPane.ERROR_MESSAGE);
            return s;
        }
        
    }

}
