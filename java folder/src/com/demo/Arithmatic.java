package com.demo;

public class Arithmatic {
    public int add(int a,int b) {
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b) {
        return a * b;
    }
    public int div(int a,int b) {
        return a / b;
    }
    public static void main (String[] args){
        Arithmatic art =new Arithmatic();
        System.out.println("Addition of 5,10 is ="+art.add(5,10));
       System.out.println("Substraction of 15,10 is= "+art.sub(15,10));
       System.out.println("Multiplication of 10,5 is= "+art.mul(10,5));
      System.out.println("Division of 10,5 is= "+art.div(10,5));

    }
}
