package com.company;

import java.util.Scanner;

public class Mycar   {
    public static  void main(String[] args){
        Car obj = new Car();
        Vehicle obj1 = new Vehicle();
        obj.setColor("red");
        System.out.println(obj.getColor());
        String engine = obj1.buildengine("car");
        System.out.println(engine);

        }
}
