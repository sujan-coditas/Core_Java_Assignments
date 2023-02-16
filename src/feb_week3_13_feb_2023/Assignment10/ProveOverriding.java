package feb_week3_13_feb_2023.Assignment10;

class Multiplication{
    public int display(int a,int b){
        return a*b;
    }

}
class Substraction extends Multiplication{
    public float display(float a, float b){
        return a*b;
    }
}
public class ProveOverriding {
    public static void main(String[] args) {
    Multiplication multiplication=new Substraction();
        System.out.println(multiplication.display(6,7));
        System.out.println(multiplication.display(4,9));

    }
}

/*===========OUTPUT==============
42
36
*/
