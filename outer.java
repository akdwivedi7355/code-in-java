class outer {
class inner{
public void show(){
    System.out.println("IN A NESTED ");
}
} 
}
class mainInner{
    public static void main(String[] args) {
        outer out = new outer();
        outer.inner in = out.new inner();
        in.show();
    }
}
