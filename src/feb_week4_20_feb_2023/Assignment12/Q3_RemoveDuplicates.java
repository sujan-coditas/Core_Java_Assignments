package feb_week4_20_feb_2023.Assignment12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Duplicates {
    public String displayDuplicates() {
        String name="sujanshaikh";
        String result = "";
        ArrayList<Character> temp = new ArrayList<>();

        for (int i = 0; i < name.length(); i++) {
            if (temp.contains(name.charAt(i))) {
                continue;
            } else {
                temp.add(name.charAt(i));
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            result = result + temp.get(i);
        }
        System.out.println(" String  with no duplicates is :: " + result);

        return result;
    }
}
public class Q3_RemoveDuplicates {
    public static void main(String[] args) {
       Duplicates duplicates=new Duplicates();
        duplicates.displayDuplicates();

    }
}
/*=================OUTPUT=====================
*  String  with no duplicates is :: sujanhik
* */
