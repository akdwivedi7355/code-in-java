public class A18_stringComparision {
    public static void main(String[] args) {
        String a= "Aditya";
        String b="Aditya";
        String c="Dwivedi";
        // compare operation 
        /* String1 > string2 it gives = +ve value
         * String1 = String2 it gives = 0
           String1 < String2 it gives = -ve Value */
        int n = a.compareTo(b);
        System.out.println(n);
        System.out.println(a.compareTo(c));
        System.out.println(c.compareTo(a));

    }
}
