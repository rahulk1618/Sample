package com.company;

public class Strings {
    public static void main(String[] args) {
        String name = "Manchester United";
        System.out.println(name.charAt(5));
        System.out.println(name.codePointAt(4));
        System.out.println(name.replace("r", "R"));
        System.out.println(name.replaceAll("\\s", ""));
        System.out.println(name.length());
        String splitword = "We are Manchester United";
        System.out.println(splitword);
        String[] words = splitword.split("\\s");
        for (String x : words) {
            System.out.println(x);
        }
        System.out.println(splitword.startsWith("Un"));
        System.out.println(name.substring(3));
        System.out.println(name.substring(4, 10));
        char[] b = name.toCharArray();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println(splitword.toUpperCase());
        System.out.println(splitword.toLowerCase());
    }
}
