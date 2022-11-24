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
                        "3. Imprimir menor\n" +
                        "4. Imprime hojas\n" +
                        "5. Imprime nivel\n" +
                        "6. Get altura\n" +
                        "7. Contar nodos\n" +
                        "9. Salir\n",
                "Menu principal", JOptionPane.QUESTION_MESSAGE));
        switch (op) {
            case 1:
                arbol.crearRaiz();
                mostrar();
            case 2:
                System.out.println(" ");
                arbol.mostrarRaiz();
                mostrar();
            case 9:
                System.exit(0);
                break;
            case 3:
                System.out.println(" ");
                arbol.imprimirMenor();
                mostrar();
            case 4:
                System.out.println(" ");
                arbol.imprimeHojas();
                mostrar();
            case 5:
                System.out.println(" ");
                arbol.imprimeNivel(Integer.parseInt(
                        JOptionPane.showInputDialog(null, "Ingrese nivel a imprimir del arbol: ", "Nivel", 1)));
                mostrar();
            case 6:
                System.out.println(" ");
                System.out.println(arbol.getAltura()-1);
                mostrar();
            case 7:
                System.out.println("");
                System.out.println(arbol.contarNodos());
                mostrar();
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida!", "Error", JOptionPane.ERROR_MESSAGE);
                mostrar();
        }

    }

}
