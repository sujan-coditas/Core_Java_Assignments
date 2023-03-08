package March_Assignments_2023.week2.Assignment17;

import java.util.HashSet;
import java.util.TreeSet;

public class Q3_treeSetToHashset {
    public static void main(String[] args) {
        TreeSet <String> countries=new TreeSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Saudi Arabia");
        System.out.println("TreeSet elements are  :"+ countries);

        HashSet<String> displaycountries=new HashSet<>(countries);
        System.out.println("HashSet displaying TreeSet :: "+ displaycountries);
    }
}
/*
* TreeSet elements are  :[India, Saudi Arabia, USA]
HashSet displaying TreeSet :: [Saudi Arabia, USA, India]
* */
