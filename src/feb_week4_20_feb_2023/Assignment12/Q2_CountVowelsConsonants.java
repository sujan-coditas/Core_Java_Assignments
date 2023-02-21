package feb_week4_20_feb_2023.Assignment12;

import java.util.Scanner;

class Calculatealphabets {
    public void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");

        String str1 = sc.nextLine();
        String str = str1.toLowerCase();
        int length = str.length();
        int countVowels = 0, countConsonants = 0;
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                countVowels++;
            } else {
                countConsonants++;
            }
        }
        System.out.println("Total Vowels : " + countVowels);
        System.out.println("Total Consonants : " + countConsonants);
    }
}
public class Q2_CountVowelsConsonants {
    public static void main(String[] args) {
         Calculatealphabets calculatealphabets= new Calculatealphabets();
         calculatealphabets.display();
    }
}
