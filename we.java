
public class we{
    class we1 {
        void display() {
            System.out.println("this is mca class ");
        }
    } 
    class we2 extends we1(){
        void write() {
            System.out.println("I'm student of mca class");
        }
    }
    public static void main(String[] args) {
        we1 e1 = new we1();
        we2 e2 = new we2();
        e1.display();
        e2.write();
    }
}