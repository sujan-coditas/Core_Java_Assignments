package feb_week4_20_feb_2023;
class Methods{
    public void methodDisplay(){
         String name="SujanShaikh";
         String name1="sujanshaikh";
         String city=" Nanded";
         String name2="SujanShaikh";
         String name4= new String();
         name4="SujanShaikh";
         String name6=new String("SujanShaikh");
        System.out.println("Char At: "+ name.charAt(5));// returns character at particular index.

        // returns the Unicode value of the character at the specified index in a string.
        System.out.println("Code Point At : "+ name.codePointAt(3));

        System.out.println("Code Point Count : "+ name.codePointCount(1,10));
        System.out.println("compare To : "+  name.compareTo(city));
        System.out.println("compare To Ingnore Case : "+ name.compareToIgnoreCase(name1));
        System.out.println("concat name and city : " + name.concat(city));
        System.out.println("Contains : " + name.contains("jan"));
        System.out.println("Equals : " + name.equals(name1));
        System.out.println("Length : " + name1.length());
        System.out.println("Intern : ");
        // Here name and name2 are equal strings, so they will refer to the same object in memory
        System.out.println(" == "+name == name2); // true
        // name is a new object, even though it has the same content as name and str2
        System.out.println(name6 == name4); // false
        // But if we call intern() on str3, it will return a reference to the same object as str1 and str2
        String name5 = name4.intern();
        System.out.println("using interns() : "+name == name4); // true

        System.out.println("isEmpty :" + name.isEmpty());

        System.out.println("starts with :" + name.startsWith("S") );
        System.out.println("Sub String : "+ name.substring(0,4));
        System.out.println("LowerCase : "+ name.toLowerCase());
        System.out.println("Upper Case : " + name.toUpperCase());
        System.out.println("Replace : " + city.replace("N","M"));
        System.out.println("Replace All : "+ city.replaceAll("d","s"));
        System.out.println("index Of : "+ city.indexOf("a"));
        boolean result= toString().matches("Sujan.*");
        System.out.println("Matches : " + result);




    }
}
public class StringMethods {
    public static void main(String[] args) {
         Methods methods= new Methods();
         methods.methodDisplay();
    }
}
