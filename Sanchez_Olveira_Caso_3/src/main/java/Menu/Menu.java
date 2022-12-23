package Menu;

import javax.swing.JOptionPane;

import Arbol.Arbol;

public class Menu {

    public Arbol arbol = new Arbol();
   
    public Menu(){
        arbol.crearRaiz(10);
        arbol.crearRaiz(11);
        arbol.crearRaiz(14);
        arbol.crearRaiz(12);
        arbol.crearRaiz(1);
        arbol.crearRaiz(5);
        arbol.crearRaiz(8);
        arbol.crearRaiz(80);

    }

    public void mostrar() {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Menu Principal\n" +
                        "1. Mostrar elemento (normal)\n" +
                        "2. Contar repetidos\n" +
                        "3. Imprimir hermanos izquierdos de nodo\n" +
                        "9. Salir\n",
                "Menu principal", JOptionPane.QUESTION_MESSAGE));
        switch (op) {
            case 1:
                System.out.println(" ");
                arbol.mostrarRaiz();
                mostrar();
            case 2:
                System.out.println("Se repiten " + arbol.contarRepetidos() + " elementos.");
                mostrar();
            case 3:
                System.out.println(" ");
                arbol.buscarIzq(Integer.parseInt(
                        JOptionPane.showInputDialog(null, "Ingrese nodo para imprimir sus hermanos izquierdos: ", "Hermanos", 1)));
                mostrar();
            case 9:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida!", "Error", JOptionPane.ERROR_MESSAGE);
                mostrar();
        }

    }

}
