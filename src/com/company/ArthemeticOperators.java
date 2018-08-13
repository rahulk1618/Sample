package com.company;

public class ArthemeticOperators {
    public static void main(String[] args){
        ArthemeticOperators obj1 = new ArthemeticOperators();
        System.out.println(obj1.add(5,10));
        System.out.println(obj1.sub(5,10));
        System.out.println(obj1.mul(5,10));
        System.out.println(obj1.div(5,10));
    }
    public  int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
}


