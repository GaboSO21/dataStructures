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
public class tarea_Practica {

    public static void main(String[] args) {
       
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero que desea invertir:"));
        invertirNum(num);
    }


    public static void invertirNum(int num){
        if(num<10){
            System.out.print(num);
        }else{
            System.out.print(num%10);
            num /= 10;
            invertirNum(num);
        }
    }

    public static void factorial(int num){

    }
}






