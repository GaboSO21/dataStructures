package Menu;

import javax.swing.JOptionPane;

import Cola.Cola;

public class Menu {

    private int op;
    private Cola cola = new Cola();

    public void mostrar() {

        op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Bienvenido al Cinema Fidelitas!\n" +
                        "1. Entrar a la cola\n" +
                        "2. Atender a la cola\n" +
                        "3. Visualizar cola\n" +
                        "4. Ver monto y cantidad de atendidos\n" +
                        "5. Salir\n",
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
                JOptionPane.showMessageDialog(null, cola.toString(), "Mostrar elementos",
                        JOptionPane.INFORMATION_MESSAGE);
                mostrar();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Monto total: " + cola.getTotal() + "\nPersonas atendidas: " + cola.getCant() , "Mostrar elementos",
                        JOptionPane.INFORMATION_MESSAGE);
                mostrar();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida!", "Error", JOptionPane.ERROR_MESSAGE);
                mostrar();
        }

    }

}
