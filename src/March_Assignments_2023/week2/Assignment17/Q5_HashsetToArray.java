package March_Assignments_2023.week2.Assignment17;

import java.util.Arrays;
import java.util.HashSet;

public class Q5_HashsetToArray {
    public static void main(String[] args) {
        HashSet<String> name= new HashSet<>();
        name.add("sujan");
        name.add("karim");
        name.add("shaikh");
        System.out.println("Printing Hashset values ::" + name);

        String fullname[]=new String[name.size()];
        fullname=name.toArray(fullname);

        System.out.println("Displaying Hashset to Array : " + Arrays.toString(fullname));




    }
}

/*
Printing Hashset values ::[karim, sujan, shaikh]
Displaying Hashset to Array : [karim, sujan, shaikh]
*/
