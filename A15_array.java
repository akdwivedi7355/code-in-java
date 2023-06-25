
public class A15_array {
    public static void main(String[] args) {
        int sum =0;
        int[] arr = {0,1,2,3,4,5};
        for(int i=0;i<arr.length; i++){
            sum =  sum + arr[i];
            System.out.print(i);
            if (i<arr.length-1){
                System.out.print("+");
            }
        }
        System.out.print("=");
        System.out.print(sum);
        }
    }

