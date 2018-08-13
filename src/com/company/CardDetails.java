package com.company;

import java.util.Scanner;

public class CardDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the card Number :");
        String number = scanner.nextLine();
        valid(number);
    }
     public static int valid (String enumber) {
         try {
             if (enumber.length() == 16) {
                 if (enumber.startsWith("4")) {
                     System.out.println("Visa card");
                 } else if (enumber.startsWith("5")) {
                     System.out.println("master card");
                 } else if (enumber.startsWith("37")) {
                     System.out.println("American Express");
                 }

                 else  {
                     throw new Exception();
                 }
             }

             else {
                 throw new Exception();
             }
         } catch (Exception e) {
             System.out.println("invalid card");
         }

    return 0;}

    }






