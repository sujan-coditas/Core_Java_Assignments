package March_Assignments_2023.week2.Assignment17;

import java.util.HashSet;
import java.util.TreeSet;

public class Q4_hashsetToTreeset {
    public static void main(String[] args) {
        HashSet<String> name= new HashSet<>();
        name.add("sujan");
        name.add("karim");
        name.add("shaikh");

        System.out.println("Printing Hashset values ::" + name);
        TreeSet <String> fullName= new TreeSet<>(name);
        System.out.println("Conversion of HashSet to TreeSet ::" + fullName);

    }
}
/*
* Printing Hashset values ::[karim, sujan, shaikh]
Conversion of HashSet to TreeSet ::[karim, shaikh, sujan]
* */