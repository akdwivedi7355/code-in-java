
import java.util.*;
public class A3_scanner {
    public static void main(String args[]){
    Scanner scan =new Scanner(System.in);
   System.out.print("enter your full name");
    String name= scan.nextLine();
    System.out.println(name);
    System.out.print("enter your father name");
    String father= scan.next();
    System.out.println(father);
   /*  for integer / float*/
   int number = scan.nextInt();
   int x=number+18;
   System.out.println(x+4);

    }
}
// nextLine - for printing of whole string
// next - for printing of string (space bar is not come yet)