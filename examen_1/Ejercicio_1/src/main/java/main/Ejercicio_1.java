/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import javax.swing.JOptionPane;

/**
 *
 * @author GabrielPC
 */
public class Ejercicio_1 {

    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero mas grande: ", "Primer numero", JOptionPane.INFORMATION_MESSAGE));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero menor: ", "Segundo numero", JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion rusa es: " + multiRusa(x, y), "Multiplicacion Rusa", JOptionPane.INFORMATION_MESSAGE);

    }

    public static int multiRusa(int x, int y) {
        if (x == 1) {
            return y;
        } else {
            if (x % 2 != 0) {
                return y + multiRusa(x / 2, y * 2);
            } else {
                return multiRusa(x / 2, y * 2);
            }
        }
    }
}
