
import java.util.Scanner;


public class A13_functionadd {
        public static int count(int a){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        return (n);
    }
    public static int calculateAdd(int a, int b) {
        int sum = a+b;
        return sum;
    }
    public static int calculateSub(int a, int b) {
        int sum = a-b;
        return sum;
    }
    public static int calculateMul(int a, int b) {
        int sum = a*b;
        return sum;
    }
    public static int calculateDiv(int a, int b) {
        int sum = a/b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("enter the operation : ");
        int a = scan.nextInt();
        int counter = count(a);
        if(counter>4){
            System.out.println("invalid operation");
        }
        else{
        System.out.print("enter the first number : ");
        int a = scan.nextInt();
        System.out.print("enter the second number : ");
        int b = scan.nextInt();
        switch(counter){
            case 1:
            {int s = calculateAdd(a, b);
                System.out.println(a+" + "+b+" = "+s);}
            break;
            case 2:
                {int s = calculateSub(a, b);
                    System.out.println(a+" - "+b+" = "+s);}
            break;
            case 3:
                {int s = calculateMul(a, b);
                System.out.println(a+" X "+b+" = "+s);}
            break;
            case 4:
                {int s = calculateDiv(a, b);
                System.out.println(a+" / "+b+" = "+s);}
            break;
            default:
            {System.out.println("invalid operation");}
                }                          
        }
        
    }
}
