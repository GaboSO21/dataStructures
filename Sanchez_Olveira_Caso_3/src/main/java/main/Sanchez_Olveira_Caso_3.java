/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import Grafo.Grafo;
import Menu.Menu;

/**
 *
 * @author gabos
 */
public class Sanchez_Olveira_Caso_3 {

    public static void main(String[] args) {
        //Grafo
        System.out.println("Grafo:");
        Grafo grafo = new Grafo(11);
        grafo.Agregar(0, 1);
        grafo.Agregar(1, 2);
        grafo.Agregar(2, 3);
        
        grafo.Agregar(0, 4);
        grafo.Agregar(4, 5);
        grafo.Agregar(6, 7);
        grafo.Agregar(7, 3);

        grafo.Agregar(0, 8);
        grafo.Agregar(8, 9);
        grafo.Agregar(9, 10);
        grafo.Agregar(10, 3);
        
        grafo.Imprimir();

        //Arbol
        Menu menu = new Menu();
        menu.mostrar();
    }
}
