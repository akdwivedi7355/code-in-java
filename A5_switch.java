
import java.util.*;
public class A5_switch {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            int button = scan.nextInt();
            switch(button){
                case 1:System.out.println("hello");
                break;
                case 2:System.out.println("namaste");
                break;
                default : System.out.println("nikal bsdk");
            }
        }


    }
    
}
