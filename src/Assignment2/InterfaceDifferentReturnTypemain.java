package Assignment2;

public class InterfaceDifferentReturnTypemain {
    public static void main(String[] args){
        InterfaceDifferentReturnTypeImplements obj = new InterfaceDifferentReturnTypeImplements();
        InterfaceDifferentReturnTypeImplements2 obj2 = new InterfaceDifferentReturnTypeImplements2();
        System.out.println(obj.getcolor());
        System.out.println(obj.getname());
        System.out.println(obj2.getcolor());
        System.out.println(obj2.getname());

    }
}
