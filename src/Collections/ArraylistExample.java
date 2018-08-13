package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistExample {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        //Collections.unmodifiableList();
        names.add("Rooney");
        names.add("Giggs");
        names.add("Scholes");
        //names.add(null);
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

        Collections.reverse(names);
        System.out.println(names);

        System.out.println(names.indexOf("Scholes"));
        System.out.println(names.size());
        //names.remove(0);

        names.set(1,"Pogba");
        /**Iterator iterator = names.iterator();
        while ( iterator.hasNext()){
            System.out.println(iterator.next());
        }**/
        for (String s : names){
            System.out.println(s);
        }
    }
}
