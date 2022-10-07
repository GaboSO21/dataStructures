package Menu;

import javax.swing.JOptionPane;

import Cola.Cola;

public class Menu {

    private int op;
    private Cola cola = new Cola();

    public void mostrar() {

        op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Menu Principal\n" +
                        "1. Agregar elemento\n" +
                        "2. Extraer elemento\n" +
                        "3. Mostrar elemento\n" +
                        "4. Salir\n",
                "Menu principal", JOptionPane.QUESTION_MESSAGE));
        switch (op) {
            case 1:
                cola.enQueue();
                mostrar();
                break;
            case 2:
                cola.deQueue();
                mostrar();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, cola.toString(), "Mostrar elementos", JOptionPane.INFORMATION_MESSAGE);
                mostrar();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida!", "Error", JOptionPane.ERROR_MESSAGE);
                mostrar();
        }

    }

}
