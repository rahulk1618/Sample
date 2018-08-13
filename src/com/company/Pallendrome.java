package com.company;

public class Pallendrome {
    public static void main(String[] args){
        int num = 121;
        int rem,rev=0;
        int org=num;
        while(num>0){
            rem= num%10;
            rev= rev *10+ rem;
            num= num/10;
        }
        if(org==rev){
            System.out.println("the given number is Pallendrome");
        }else {
            System.out.println("the given number is not a Pallendrome");
        }
    }
}
