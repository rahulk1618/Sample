package com.company;

public class LargestOf4Numbers {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=30;
        int d=15;
        if(a>b && a>c && a>d){
            System.out.println("a is the largest");
        }else if(b>a && b>c && b>d){
            System.out.println("b is the largest");
        }else if (c>a && c>b && c>d){
            System.out.println("c is the largest");
        }else {
            System.out.println("d is the largest");
        }
    }
}
