/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.herencia;

/**
 *
 * @author GabrielPC
 */
public class Herencia {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        /*
         * En el print, se usa el metodo toString, heredado de la clase persona.
         * Al igual que ese, se pueden acceder individualmente a los atributos, ya sea por
         * los encapsuladores o directamente.
         * No se heredan los constructores, pero se pueden especificar mediante la palabra super.
         */
        System.out.println("empleado1 " + empleado1);

        Empleado empleado2 = new Empleado("Jose", 3000.0);
        System.out.println("empleado2 " + empleado2);

        ;
        Cliente cliente1 = new Cliente("Pepe", new java.util.Date(), true);
        System.out.println(cliente1.toString());
    }
}
