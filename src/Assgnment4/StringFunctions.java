package Assgnment4;

import java.util.Scanner;
public class StringFunctions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String reverse= "";

        String s = "This is a java class";
        System.out.println(s.length());
        int a = s.length();
        for (int i=a-1;i>=0 ; i-- ){
            reverse = reverse +s.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(s.charAt(a/2));
        System.out.println(s.indexOf("j"));
        System.out.println(s.replace("java" ,"sql"));
        System.out.println(s.indexOf("This"));
        System.out.println(s.toUpperCase());

    }
}
