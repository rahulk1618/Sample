package lambda;

public class VehicleImplements implements Vehicle {
    public static void main(String[] args){
        VehicleImplements obj = new VehicleImplements();
        obj.getcolor();
        obj.getbrand();



    }


    static int getSpeed() {
        return 0;
    }


    @Override
    public void getbrand() {
        System.out.println("abstract method");
    }

    @Override
    public String getcolor() {
        System.out.println("green");
        return null;
        }
}
