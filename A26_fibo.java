public class A26_fibo {
    public static void fibo(int a,int b,int n){
       if (n==10){
        return;
       }
       else{
        
        int c=a+b;
        System.out.println(c);
        fibo(b, c, n+1);
          
        
       }
    }
    public static void main(String[] args) {
        int n=0;
        System.out.println(0);
        System.out.println(1);
        fibo(0,1,n);
    }
}
