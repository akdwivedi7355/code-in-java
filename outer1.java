class outer1 {
   void outermethod(){
    System.out.println("inside method");
class Inner{
    void innerMethod(){
        System.out.println("INNER METHOD");
    }
}
Inner y = new Inner();
y.innerMethod();
   }

}
class LocalInner {
    public static void main(String[] args) {
        outer1 x =new outer1();
        x.outermethod();
    }
}
