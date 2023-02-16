package feb_week3_13_feb_2023.Assignment10;

class Addition{
    public  int display (int a,int b){
        return  a+b;
    }
    public float display(float a, float b){
        return  a+b;
    }
}
public class ProveOverloading {
    public static void main(String[] args) {
      Addition addition=new Addition();
        System.out.println( addition.display(2,4));
        System.out.println(addition.display(5.7f,6.7f));
    }
}
/*===========OUTPUT=========
 6
18.2
* */