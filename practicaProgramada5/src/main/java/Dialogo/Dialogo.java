package Dialogo;

import javax.swing.JOptionPane;

public class Dialogo {

    // Clase para facilitar el uso del JOptionPane

    public static String Capturar(String mensaje, String titulo, int tipo) {
        return JOptionPane.showInputDialog(null, mensaje, titulo, tipo);
    }

    public static void Mostrar(String mensaje, String titulo, int tipo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);
    }

}
