public class A25_recursion {
    
    // recusion method 1
    public static void printnumber(int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n);
            printnumber(n-1);
        }
        }
    // recursion method 2
    public static void print(int n,int sum){
        if (n==8){
            System.out.println("sum of series"+sum);
            return ;
        }
        else{
            System.out.print(n);
            sum =sum+n;
            print(n+1,sum);
        }
    }
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        printnumber(n);
        print(n,sum);
        
    }
}
