package feb_week3_13_feb_2023.Assignment10;


class AdditionOp{
    public void add(int a,int b){
        int sum=a+b;
        System.out.println("Addition of a b is : " + sum);
    }
    public void add(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("Addition of a b c is : "+ sum);
    }
}

class VarargsAddition{
    public void varArgsAdd(int...n){
        int sum=n[0]+n[1];
        System.out.println( " varargs Addition : "+ sum );
    }
}
public class AdditionOperation {
    public static void main(String[] args) {
        AdditionOp additionOp= new AdditionOp();
        additionOp.add(10,47);
        additionOp.add(3,6,7);


        VarargsAddition varargsAddition=new VarargsAddition();
        varargsAddition.varArgsAdd(2,5);

    }
}
/*=========OUTPUT==============
Addition of a b is : 57
Addition of a b c is : 16
 varargs Addition : 7
 */