package com.practicaprogramada_1.controller;

import javax.swing.JOptionPane;

public class Ejercicios {

    private int[] nums; 

  //Empty constructor
    public Ejercicios(){
        this.nums = new int[5];
    }

    public void invertirNum(int num){
        if(num<10){
            System.out.print(num + "\n");
        }else{
            System.out.print(num%10);
            invertirNum(num/10);
        }
    }

    public void imprimirString(String nom, int num){
        if(nom.length() > num){
            System.out.print(nom.charAt(num) + " ");
            imprimirString(nom, num+1);
        }
    }

    public void vector(int num, int mayor){
        if(num == 0){
            nums[num] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor para el vector en posicion " + num + ":"));
            System.out.print("\nVector: " + nums[num] + " ");
            if(mayor<nums[num]){
                mayor = nums[num];
            }
            vector(num+1,mayor);
        }else if(num == nums.length){
            System.out.println("\nNumero mayor del vector: " + mayor);
            return;
        }else{
            nums[num] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor para el vector en posicion " + num + ":"));
            System.out.print(nums[num] + " ");
            if(mayor<nums[num]){
                mayor = nums[num];
            }
            vector(num+1,mayor);
        }
    }

    public int sumaNums(int num){
        if(num == 0){
            return 0;
        }else{
            int res = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor #" + num + ":"));
            return res + sumaNums(num-1);
        }
    }

    public void tablas(int num, int x){
        if(x <= 12){
            System.out.println(num + " x " + x + " = " + num*x);
            tablas(num, x+1);
        }
    }



}











