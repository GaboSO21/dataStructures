package Menu;

import javax.swing.JOptionPane;

import Lista.*;

public class Menu {
    private int op;
    private Lista p = new Lista();
    private Dato[] extraidos = new Dato[10];

    public void Mostrar() {
        op = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Menu Principal\n"
                        + "[1]. Agregar Elemento\n"
                        + "[2]. Eliminar Elemento\n"
                        + "[3]. Mostar Elementos\n"
                        + "[4]. Encontrar\n"
                        + "[5]. Modificar\n"
                        + "[6]. Eliminar\n"
                        + "[7]. Extraer\n"
                        + "[8]. Mostrar datos extraidos\n"
                        + "[9]. Salir\n"
                        + "Digite su opcion:"));
        switch (op) {
            case 1:
                p.agregar();
                Mostrar();
            case 2:
                p.eliminar();
                Mostrar();
            case 3:
                p.toString();
                Mostrar();
            case 4:
                p.existe(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ID a buscar:")));
                Mostrar();
            case 5:
                p.modifica(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ID a modificar:")));
                Mostrar();
            case 6:
                p.eliminar(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ID a eliminar:")));
                Mostrar();
            case 7:
                for (int i = 0; i < extraidos.length; i++) {
                    if (extraidos[i] == null) {
                        extraidos[i] = p
                                .extraer(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ID a extraer:")));
                        break;
                    }
                }
                Mostrar();
            case 8:
                String info = "Datos extraidos:\n";
                for (int i = 0; i < extraidos.length; i++) {
                    if (extraidos[i] != null) {
                        info += extraidos[i].toString() + " || ";
                    }
                }
                JOptionPane.showMessageDialog(null, info, "Datos extraidos", 1);
                Mostrar();
            case 9:
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Error, opcion invalida");
                Mostrar();

        }
    }
}
