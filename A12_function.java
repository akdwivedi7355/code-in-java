
import java.util.Scanner;

public class A12_function {
    public static void printMyName(String name) {
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        printMyName(name);//call the function

    }
}
