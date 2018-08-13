package com.company;

public class AmsrongNumber {
    public static void main(String[] args){
        int num = 371;
        int rem,sum=0;
        int org=num;
        while(num>0){
            rem= num%10;
            num= num/10;
            sum= sum + rem*rem*rem;
        }
        if(org==sum){
            System.out.println("The given number is a Amstrong number");
        }else{
            System.out.println("The given number is not an Amstrong number ");
        }
    }
}
