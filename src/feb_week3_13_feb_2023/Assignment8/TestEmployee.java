//package feb_week3_13_feb_2023.Assignment8;
//
//import java.util.Scanner;
//
//public class TestEmployee {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the type for Wage Employee, 2 for Sales person 3 for manager ");
//        int type = sc.nextInt();
//        System.out.println("Enter the size of array");
//        int len = sc.nextInt();
//        Employee[] arr=new Employee[len];
//        switch (type) {
//            case 1:
//
//                for(int i=0;i<len;i++){
//
//                    System.out.println("Enter the hours and rate for wagesemployee "+i+1);
//                    int hour=sc.nextInt();
//                    int rate=sc.nextInt();
//                    arr[i]=new WageEmployee(hour,rate);
//                }
//                System.out.println("Record entered");
//                break;
//
//            case 2:
//
//                for(int i=0;i<len;i++){
//
//                    System.out.println("Enter the hours and rate for Salesperson "+i+1);
//                    int hour=sc.nextInt();
//                    int rate=sc.nextInt();
//                    System.out.println("Enter the sales and commission ");
//                    int sales = sc.nextInt();
//                    int commission = sc.nextInt();
//                    arr[i]=new SalesPerson(sales,commission,hour,rate);
//                }
//                System.out.println("Record entered");
//                break;
//            case 3:
//
//                for(int i=0;i<len;i++){
//
//                    System.out.println("Enter the hours and rate for manager "+i+1);
//                    int hour=sc.nextInt();
//                    int rate=sc.nextInt();
//                    System.out.println("Enter the incentive ");
//                    int incentive = sc.nextInt();
//
//                    arr[i]=new Manager(incentive,hour,rate);
//                }
//                System.out.println("Record entered");
//                break;
//        }
//    }
//}
//
