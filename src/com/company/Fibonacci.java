package com.company;

public class Fibonacci {
    public static void main(String[] args){
        int num=10;
        int a=0,b=1,c;
        System.out.println(+a +b);
        for(int i=2;i<num;i++){
            c= a+b;
            System.out.println( +c);
            a=b;
            b=c;
        }
    }
}
