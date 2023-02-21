package feb_week4_20_feb_2023.Assignment11;


public class JavaLangClass {
    public static void main(String[] args) {

        try{

            Class c=Class.forName("java.lang.String" );
            Class c2 = void.class;


            System.out.println("get Class Name : " + c.getName());
            System.out.println("get Simple Name : " + c.getSimpleName());
            System.out.println("get Super Class : " +c.getSuperclass());
            System.out.println("toString : "+ c.toString());
            System.out.println("toString : "+ c2.toString());

            Object obj= c.newInstance();
            System.out.println("New instance : "+c.toString());
            boolean isAssignable = c.isAssignableFrom(Object.class);
            System.out.println("Is String assignable from Object? \n " + isAssignable);




        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
