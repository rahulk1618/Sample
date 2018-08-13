package lambda;

public class FunctionalInterface {
    public static void main(String[] args) {
        FunctionalInterface obj = new FunctionalInterface();
        MathOperation add = (int a, int b) -> (a + b);
        MathOperation sub = (int a, int b) -> (a - b);
        MathOperation mul = (int a, int b) -> (a * b);
       // System.out.println(obj.operate(2,3,add));

        System.out.println(add.operation(2,3));
        System.out.println(sub.operation(5,2));
        System.out.println(mul.operation(2,5));
    }

        @java.lang.FunctionalInterface
        interface MathOperation {
            int operation(int a, int b);
        }
        interface GreetingService {
            void sayMessage(String message);
        }
        private int operate ( int a, int b, MathOperation mathOperation){
            return mathOperation.operation(a, b);
        }
    }

