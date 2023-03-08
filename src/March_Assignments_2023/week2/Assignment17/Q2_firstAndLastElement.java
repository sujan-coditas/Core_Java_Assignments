package March_Assignments_2023.week2.Assignment17;

import java.util.HashSet;
import java.util.Iterator;

public class Q2_firstAndLastElement {
    public static void main(String[] args) {
        HashSet<String> name= new HashSet<>();
        name.add("sujan");
        name.add("karim");
        name.add("shaikh");
        System.out.println("Printing Hashset values ::" + name);

        String fullname[]=new String[name.size()];
        fullname=name.toArray(fullname);
        System.out.println("First Element is :: "+fullname[0] +"\n Last Element is :: " + fullname[fullname.length-1] );

    }
}

/*
* Printing Hashset values ::[karim, sujan, shaikh]
First Element is :: karim
 Last Element is :: shaikh
 * */
