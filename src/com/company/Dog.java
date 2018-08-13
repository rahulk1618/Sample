package com.company;

public class Dog extends Animal {
    public static void main(String[] args){
        Animal obj = new Dog();

        int a=obj.getNumberOfLegs("wild");
        System.out.println(a);
        String s= obj.animalType();
        System.out.println(s);
        }

    String animalType(){
        return "Abstract method" ;
    }
}
