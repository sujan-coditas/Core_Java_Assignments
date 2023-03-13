package March_Assignments_2023.week3.Assignment18;

import java.util.Hashtable;
import java.util.Map;

public class Q1_HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> studentList= new Hashtable<>();
        studentList.put(1,"Sujan");
        studentList.put(2,"Tanmay");
        studentList.put(3,"Aryaman");


        for(Map.Entry m: studentList.entrySet()){
            System.out.println(m.getKey()+ " " + m.getValue() );
        }
    }
}
/*
 3 Aryaman
2 Tanmay
1 Sujan

Process finished with exit code 0  */