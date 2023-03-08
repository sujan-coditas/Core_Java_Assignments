package March_Assignments_2023.week2.Assignment17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Q5_HashsetToArray {
    public static void main(String[] args) {
        HashSet<String> name= new HashSet<>();
        name.add("sujan");
        name.add("karim");
        name.add("shaikh");
        System.out.println("Printing Hashset values ::" + name);

//        String fullname[]=new String[name.size()];
//        fullname=name.toArray(fullname);
//
//        System.out.println("Displaying Hashset to Array : " + Arrays.toString(fullname));

        Iterator<String> iterator = name.iterator();
        String first = iterator.next();
        System.out.println("First element: " + first);

        String last = null;
        while (iterator.hasNext()) {
            last = iterator.next();
        }
        System.out.println("Last element: " + last);




    }
}
/*
Printing Hashset values ::[karim, sujan, shaikh]
First element: karim
Last element: shaikh
*/
