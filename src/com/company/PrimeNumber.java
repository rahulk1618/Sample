package com.company;

public class PrimeNumber {
    public static void main(String[] args){
        int num=12;
        boolean isPrime = true;

        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("prime Number");
        }else {
            System.out.println("Not a Prime Number");
        }
    }
}
