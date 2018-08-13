package com.company;

public class ReverseOrder {
    public static void main(String[] args){
        int num = 571;
        int rem,rev=0;
        while(num>0){
            rem= num%10;
            num= num/10;
            rev= rev *10+ rem;
        }
        System.out.println("the reverse of the number is "+ rev);
    }
}
