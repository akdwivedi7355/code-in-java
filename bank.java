
public class bank {
    void getRateofInterest(){
        public static string 
        System.out.println("interest is 0%");
            }
}
class sbi extends bank{
    void getRateofInterest(){
        System.out.println("interest is 3%");
            }
}
class icici extends bank{
    void getRateofInterest(){
        System.out.println("interest is 5%");
            }
}
class axis extends bank{
    void getRateofInterest(){
        System.out.println("interest is 7%");
            }
}
class demo  extends bank{
    public static void main(String[] args) {
        bank b= new bank();
        sbi  s= new sbi();
        icici i = new icici();
        axis a = new axis();
        b.getRateofInterest();
        s.getRateofInterest();
        i.getRateofInterest();
        a.getRateofInterest();
    }
    
}