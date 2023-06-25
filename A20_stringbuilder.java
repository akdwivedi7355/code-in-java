public class A20_stringbuilder {
    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder("Aditya");    
    // add a char at starting
    sentence.insert(0,"M");
    System.out.println(sentence);
    sentence.insert(3,"D");
     System.out.println(sentence);
    //  delete a char or substring
     sentence.delete(3,4);
     sentence.delete(0,1);
     System.out.println(sentence);
    //  append or Adding a substring
    sentence.append(" Kumar");
    System.out.println(sentence);
}

    
    
}
