package feb_week4_20_feb_2023.Assignment11;

/*. Constructor Chaning:
Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
One of the main use of constructor chaining is to avoid duplicate codes while having multiple constructor (by means of constructor overloading)
and make code more readable.
Constructor chaining can be done in two ways:
1.Within same class: It can be done using this() keyword for constructors in the same class
2.From base class: by using super() keyword to call the constructor from the base class.*/
class ConstructorChainingSameClass{
    // Using this keyword
    private String name;
    private int age;

    public ConstructorChainingSameClass(String name,int age){
        this.name=name;
        this.age=age;
    }
    public ConstructorChainingSameClass(String name){
        this(name,0);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class ConstructorChainingDifferentClass extends ConstructorChainingSameClass {

    // using super keyword

    public ConstructorChainingDifferentClass(String name, int age)
    {
        super(name, age);
    }

}
public class ConstructorChainingDemo {
    public static void main(String[] args) {
        ConstructorChainingSameClass constructorChainingSameClass= new ConstructorChainingSameClass("Sujan",22);
        System.out.println(constructorChainingSameClass);
        ConstructorChainingDifferentClass constructorChainingDifferentClass=new ConstructorChainingDifferentClass("Aryaman",22);
        System.out.println(constructorChainingDifferentClass);
    }
}
