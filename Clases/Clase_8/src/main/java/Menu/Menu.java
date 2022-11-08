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
                        "2. Extraer elemento\n" +
                        "3. Extraer especifico\n" +
                        "4. Mostrar elemento\n" +
                        "5. Salir\n",
                "Menu principal", 3));
        switch (op) {
            case 1:
                lista.insertar();
                mostrar();
            case 2:
                lista.extraer();
                mostrar();
            case 3:
                
                mostrar();
            case 4:
                lista.mostrar();
                mostrar();
            case 5:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida!", "Error", 0);
                mostrar();
        }

    }

}
