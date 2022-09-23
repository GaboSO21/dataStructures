package com.clase_1.controller;

public class ejemplo_1 {
  
    /*
     * RECURSION EXAMPLES
     */

    //empty constructor
    public ejemplo_1(){
    }

    //Return 1 to x, separeted by spaces
    public void serieNum(int num){
        if(num<=5){
            System.out.print(num + " ");
            serieNum(num+1);
        }
    }

    //Return factorial of a number
    public int factorial(int num){
        if(num == 1){
            return num;
        }else{
            return num * factorial(num-1);
        }            
    }

    public int fibonacci(int num){
        if(num == 1 || num == 2){
            return 1;
        }else{
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    //Return an inverted number 
    public void invertirNum(int num){
        if(num<10){
            System.out.print(num);
        }else{
            System.out.print(num%10);
            num /= 10;
            invertirNum(num);
        }
    }
}
