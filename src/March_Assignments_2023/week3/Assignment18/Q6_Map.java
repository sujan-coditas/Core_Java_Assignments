package March_Assignments_2023.week3.Assignment18;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Q6_Map {
    public static void main(String[] args) {
        NavigableMap<String, Integer> nm = new TreeMap<>();


        nm.put("S", 556);
        nm.put("U", 3456);
        nm.put("J", 4545);
        nm.put("A", 45);
        nm.put("N", 435);
        nm.put("S", 55345);


        System.out.println("Mappings of NavigableMap : " + nm);

        System.out.println("Descending Set  :" + nm.descendingKeySet());
        System.out.println("Floor Entry  :" + nm.floorEntry("L"));
        System.out.println("First Entry  : " + nm.firstEntry());
        System.out.println("Last Key : " + nm.lastKey());
        System.out.println("First Key :" + nm.firstKey());
        System.out.println("Original Map : " + nm);
        System.out.println("Reverse Map : " + nm.descendingMap());


        Iterator<NavigableMap.Entry<String, Integer>> itr = nm.entrySet().iterator();

        System.out.println("Traversing using Iterator: ");

        while (((Iterator<?>) itr).hasNext()) {
            NavigableMap.Entry<String, Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
/*
* Mappings of NavigableMap : {A=45, J=4545, N=435, S=55345, U=3456}
Descending Set  :[U, S, N, J, A]
Floor Entry  :J=4545
First Entry  : A=45
Last Key : U
First Key :A
Original Map : {A=45, J=4545, N=435, S=55345, U=3456}
Reverse Map : {U=3456, S=55345, N=435, J=4545, A=45}
Traversing using Iterator:
Key = A, Value = 45
Key = J, Value = 4545
Key = N, Value = 435
Key = S, Value = 55345
Key = U, Value = 3456

* */