package Menu;

import javax.swing.JOptionPane;

import Cola.Cola;

public class Menu {

    private int op;
    private Cola cola = new Cola();

    public void mostrar() {

        op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Menu Principal\n" +
                        "[1]. Agregar elemento\n" +
                        "[2]. Extraer elemento\n" +
                        "[3]. Buscar elemento\n" +
                        "[4]. Ordenar ascendentemente\n" +
                        "[5]. Ordener descendentemente\n" +
                        "[6]. Mostrar elementos\n" +
                        "[7]. Salir\n",
                "Menu principal", JOptionPane.QUESTION_MESSAGE));
        switch (op) {
            case 1:
                cola.enQueue(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para la cola: ",
                        "enQueue", JOptionPane.QUESTION_MESSAGE)));
                mostrar();
                break;
            case 2:
                cola.extrae(Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingrese un numero para extraer de la cola: ", "Extraer", JOptionPane.QUESTION_MESSAGE)));
                mostrar();
                break;
            case 3:
                if (cola.encuentra(
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero a buscar en la cola: ",
                                "enQueue", JOptionPane.QUESTION_MESSAGE)))) {
                    JOptionPane.showMessageDialog(null, "El elemento se encuentra encolado.", "Encontrado",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "El elemento no se encuentra en la cola.", "No econtrado",
                            JOptionPane.ERROR_MESSAGE);
                }
                mostrar();
                break;
            case 4:
                cola.ordenarAscendente();
                mostrar();
                break;
            case 5:
                cola.ordenarDescendente();
                mostrar();
                break;
            case 6:
                JOptionPane.showMessageDialog(null, cola.toString(), "Mostrar elementos",
                        JOptionPane.INFORMATION_MESSAGE);
                mostrar();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida!", "Error", JOptionPane.ERROR_MESSAGE);
                mostrar();
        }

    }

}
