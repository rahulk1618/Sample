package Collections;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public class Comparable {
    public static void main(String[] args){
        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell",4,500));
        laps.add(new Laptop("Apple",16,1800));
        laps.add(new Laptop("HP",8,1000));

        /**Comparator<Laptop> com = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if (o1.getPrice()> o2.getPrice())
                return 1;
                else
                    return -1;
            }
        };
        Collections.sort(laps,com);

         **/
        Collections.sort(laps);
        for (Laptop l : laps){
            System.out.println(l);
        }

    }
}
