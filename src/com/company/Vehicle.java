package com.company;

public class Vehicle {
   public String vehicletype;

     public  String buildengine(String vehicletype){
         if (vehicletype == "car") {
             return "V6";
         }else {
             return "V8";
         }
     }


}
