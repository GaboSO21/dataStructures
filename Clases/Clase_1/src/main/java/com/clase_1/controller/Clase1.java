/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.clase_1.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author GabrielPC
 */
public class Clase1 {

    public static void main(String[] args) {

        ejemplo_1 ej_1 = new ejemplo_1();
        int num = Integer.parseInt
        (JOptionPane.showInputDialog(null, "Ingrese un valor inicial para la serie:", JOptionPane.QUESTION_MESSAGE));
        ej_1.serieNum(num);
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el un numero:"));
        System.out.println("\n"+ej_1.factorial(num));
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el un numero para la serie Fibonacci:"));
        System.out.println(ej_1.fibonacci(num));
        
    }
}
