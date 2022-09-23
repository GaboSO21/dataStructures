package com.practicaprogramada_1.controller;

import javax.swing.JOptionPane;

public class Programa {
  
    public void ejecutar(){
        int opcion = 0;
        while(opcion!=6){
            Ejercicios e = new Ejercicios();
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,   "RECURSIVIDAD\n" + 
                                                                                          "[1].Invertir numero recursivamente\n" + 
                                                                                          "[2].Imprimir String letra por letra recursivamente\n" + 
                                                                                          "[3].Llenar,mostrar y calcular mayor en vector recursivamente\n" + 
                                                                                          "[4].Sumar N numero recursivamente\n" +
                                                                                          "[5].Mostrar tablas de multiplicar de N numero recursivamente\n" +
                                                                                          "[6].Salir"));
        
            switch(opcion){

                case 1:
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero a invertir:"));
                    e.invertirNum(opcion);
                    break;
                case 2:
                    String nom = JOptionPane.showInputDialog(null, "Ingrese palabra a imprimir:");
                    e.imprimirString(nom, 0);
                    break;
                case 3:
                    e.vector(0, 0);
                    break;
                case 4:
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de numeros a sumar:"));
                    int calc = e.sumaNums(opcion);
                    System.out.println("Suma de numeros: " + calc);
                    break;
                case 5:
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero para mostrar sus tablas de multiplicar:"));
                    e.tablas(opcion, 0);
                    break;
                default:
                    break;
            }    
        }                                                                         
    }


}
