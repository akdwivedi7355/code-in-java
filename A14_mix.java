
import java.util.*;
public class A14_mix {
public void great(int n){
    n= 2+5;
    return (n);
}
public static void main(String[] args) {
    System.out.println("enter the string");
    Scanner scan =new Scanner(System.in);
    int m = scan.nextInt();
    int n = great(m);
    System.out.println(n);
    
}
}
