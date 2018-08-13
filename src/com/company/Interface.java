package com.company;

public class Interface {
    public static void main(String[] args){
        InterfaceMain obj = new InterfaceMain();
        String name =obj.mobileName();
        System.out.println(name);
        String type = obj.mobileType();
        System.out.println(type);
        String number = obj.mobileNumber();
        System.out.println(number);
    }
}
