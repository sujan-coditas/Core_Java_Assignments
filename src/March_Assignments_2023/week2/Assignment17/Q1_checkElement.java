package March_Assignments_2023.week2.Assignment17;

import java.util.HashSet;
import java.util.Set;

public class Q1_checkElement {
    public static void main(String[] args) {
        Set<Integer>  elements=new HashSet<>();

        elements.add(11);
        elements.add(23);
        elements.add(141);
        elements.add(61);
        elements.add(19);
        elements.add(20);

        System.out.println("Check element 23  " + elements.contains(23));



    }
}

/*
* Check element 23  true
* */
