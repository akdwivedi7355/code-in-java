import java.util.Scanner;

public class A17_String {
    public static void main(String[] args) {
        String firstname ="Aditya";
        String lastname = "dwivedi";
        String fullName = "Aditya Kumar Dwivedi";
        String sentence = "My name is Aditya Kumar dwivedi";
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        System.out.println(c);
        // contatination
        String name = firstname+" "+lastname;
        System.out.println(name);
        // length of the string 
        System.out.println(name.length());
        // print string by character form
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
