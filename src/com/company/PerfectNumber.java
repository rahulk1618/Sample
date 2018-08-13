package com.company;

public class PerfectNumber {
    public static void main(String[] args){
        int num=28;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum= sum+i;
                }
        }if(num==sum){
            System.out.println("The given number is Perfect");
        }else{
            System.out.println("The given number is not Perfect Number");
        }

    }
}
