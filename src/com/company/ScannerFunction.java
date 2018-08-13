package com.company;
import java.util.Scanner;
public class ScannerFunction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of i :");
        int i = scanner.nextInt();
        System.out.println("enter the value of j :");
        int j = scanner.nextInt();
        for (i=0; i<=j; i++){
            System.out.println("for loop :" +i);
        }
        System.out.println("enter the value of k");
        int k = scanner.nextInt();
        System.out.println("enter the value of l");
        int l = scanner.nextInt();
        while(k<=l){
            System.out.println("while loop :" +k);
            k++;
        }
        System.out.println("enter the value of a:");
        int a= scanner.nextInt();
        System.out.println("enter the value of b");
        int b = scanner.nextInt();
        do{
            System.out.println("do while loop:" +a);
            a++;
        }while (a<=b);

    }
}
