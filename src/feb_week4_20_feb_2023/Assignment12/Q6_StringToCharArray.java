package feb_week4_20_feb_2023.Assignment12;


class ArrayString{
    public void displayArrayString(){
        String str= " SujanShaikh";
        char ch[]=str.toCharArray();
        System.out.println("Array of String is : ");
         for(int i=0;i<str.length();i++){
             System.out.print(ch[i]+" ");
         }
    }
}
public class Q6_StringToCharArray {
    public static void main(String[] args) {
        ArrayString arrayString= new ArrayString();
        arrayString.displayArrayString();
    }
}
/*=====================OUTPUT==============
*Array of String is :
  S u j a n S h a i k h
* */
