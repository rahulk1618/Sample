package com.company;

public class Employee {
    int id;
    String name;
     int salary;
    public Employee(){}
    public Employee(int id,String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    public static void main(String[] args){
        Employee obj1 = new Employee(10,"rahul",1000);
        System.out.println(obj1.getSalary());
        Employee obj2 = new Employee(101,"rooney",100);
        System.out.println(obj2.name);

    }
    public int getSalary(){
        return salary;
    }
}
