package lambda;
@FunctionalInterface
interface Vehicle {
    void getbrand();

    default   String  getcolor(){
        return "green";
    }
    static int getEngine(){
        return 0;
    }
}
