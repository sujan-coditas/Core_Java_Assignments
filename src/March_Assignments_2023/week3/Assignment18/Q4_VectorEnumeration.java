package March_Assignments_2023.week3.Assignment18;

import java.util.Enumeration;
import java.util.Vector;

public class Q4_VectorEnumeration
{
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(675);
        v.add(453);
        v.add(74587);
        v.add(321);
        v.add(98);


        System.out.println("Enumeration");
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.print(e.nextElement()+"  ,");
        }

        v.addElement(40);
        System.out.println("\nFirst element: "+v.firstElement());

        System.out.println(v);

        System.out.println("Last element: "+v.lastElement());
    }
}
/*
* Enumeration
675  ,453  ,74587  ,321  ,98  ,
First element: 675
[675, 453, 74587, 321, 98, 40]
Last element: 40
*/
