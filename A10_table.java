
import java.util.Scanner;

public class A10_table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number which one you want to print a table : ");
        int table = scan.nextInt();
        for(int i=1;i<=10;i++){
            int r= (table*i);
            System.out.println(table+" X "+i+" = "+r);
        }
    }
    
}
