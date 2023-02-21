package feb_week4_20_feb_2023.Assignment12;

import java.util.StringTokenizer;

class MultipleDelimiter {

    public void displaydelimiter() {
        StringTokenizer stringTokenizer = new StringTokenizer("hii , all. How are u ?", " ,.?");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
public class Q7_UsingDelimiters {
    public static void main(String[] args) {
        MultipleDelimiter multipleDelimiter= new MultipleDelimiter();
        multipleDelimiter.displaydelimiter();

    }
}

/*=============OUTPUT==========
* hii
all
How
are
u
* */
