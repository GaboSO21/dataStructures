package Menu;

import javax.swing.JOptionPane;

import Arbol.Arbol;

public class Menu {

    public Arbol arbol = new Arbol();

    public void mostrar() {

        int op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Menu Principal\n" +
                        "1. Agregar elemento\n" +
                        "2. Mostrar elemento (normal)\n" +
                        "3. Mostrar preOrden\n" +
                        "4. Mostrar inOrden\n" +
                        "5. Mostrar postOrden\n" +
                        "7. Imprimir menor\n" +
                        "8. Imprime hojas\n" +
                        "9. Imprime nivel\n" +
                        "6. Salir\n",
                "Menu principal", JOptionPane.QUESTION_MESSAGE));
        switch (op) {
            case 1:
                arbol.crearRaiz();
                mostrar();
            case 2:
                System.out.println(" ");
                arbol.mostrarRaiz();
                mostrar();
            case 3:
                arbol.preOrden();
                mostrar();
            case 4:
                arbol.inOrden();
                mostrar();
            case 5:
                arbol.postOrden();
                mostrar();
            case 6:
                System.exit(0);
                break;
            case 7:
                System.out.println(" ");
                arbol.imprimirMenor();
                mostrar();
            case 8:
                System.out.println(" ");
                arbol.imprimeHojas();
                mostrar();
            case 9:
                System.out.println(" ");
                arbol.imprimeNivel(2);
                mostrar();
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida!", "Error", JOptionPane.ERROR_MESSAGE);
                mostrar();
        }

    }

}
