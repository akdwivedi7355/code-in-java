public class A21_reversestring {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("qwerty");
        for (int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() -1-i;
            char frontalpha = sb.charAt(front);
            char backalpha = sb.charAt(back);

            sb.setCharAt(front, backalpha);
            sb.setCharAt(back,frontalpha );
        }
        System.out.println(sb);
        for (int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() -1-i;
            char frontalpha = sb.charAt(front);
            char backalpha = sb.charAt(back);

            sb.setCharAt(front, backalpha);
            sb.setCharAt(back,frontalpha );
        }
        System.out.println(sb);
    }
}
