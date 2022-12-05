/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import java.util.Scanner;

import Arbol.Arbol;
import Arbol.Nodo;

/**
 *
 * @author 
 * Andres Ospina
 * Gabriel Sanchez
 * Johan Saenz
 */

public class Clase_12 {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertaR(new Nodo(10));
        arbol.insertaR(new Nodo(20));
        arbol.insertaR(new Nodo(5));
        arbol.insertaR(new Nodo(18));
        arbol.insertaR(new Nodo(32));
        arbol.insertaR(new Nodo(15));
        arbol.insertaR(new Nodo(3));
        arbol.insertaR(new Nodo(26));
        arbol.insertaR(new Nodo(8));
        arbol.insertaR(new Nodo(19));
        arbol.insertaR(new Nodo(40));

        //-------------Funcionalidad--------------
        
        // Modificar de arreglado.
        arbol.imprimirIO();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese el numero a modificar");
        arbol.modificar(arbol.getRaiz(), sc.nextInt());
        sc.close();
        


    }
}
