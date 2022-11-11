package Menu;

import javax.swing.JOptionPane;

import Lista.Lista;

public class Menu {

    private int op;
    private Lista lista = new Lista();

    public void mostrar() {

        op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Menu Principal\n" +
                        "1. Agregar elemento\n" +
                        "2. Ordenar elemento\n" +
                        "3. Mostrar elemento\n" +
                        "4. Salir\n",
                "Menu principal", JOptionPane.QUESTION_MESSAGE));
        switch (op) {
            case 1:
                lista.Insertar(); 
                mostrar();
            case 2:
                lista.Ordenar();
                mostrar();
            case 3:
                lista.toString();
                mostrar();
            case 4:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida!", "Error", JOptionPane.ERROR_MESSAGE);
                mostrar();
        }

    }
}
