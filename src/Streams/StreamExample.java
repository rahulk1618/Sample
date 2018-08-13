package Streams;



import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {


        List<String> list = Arrays.asList("a1", "a2", "c1", "da2");
//        Iterator<String> iterator = list.iterator();
////        while (iterator.hasNext()) {
////            String a = iterator.next();
////            if(a.startsWith("a")){
////
////            }
////        }
        list.stream()
             .filter(s -> {
//                 System.out.println("inside filter");
                 return s.startsWith("a");
             })
             .forEach(s -> System.out.println(s));


    }
}





