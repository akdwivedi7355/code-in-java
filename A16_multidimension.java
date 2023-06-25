
import java.util.Scanner;

public class A16_multidimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int sum=0;
        for (int i=0; i<n;i++){
            for (int j=0; j<n;j++){
            arr[i][j] = sc.nextInt();
            }  
        }
        System.out.println("your resultant array is");
        for (int i=0; i<n;i++){
            for(int j=0;j<n;j++){
             sum = sum + arr[i][j];
             
             System.out.print(arr[i][j]+" ");
            }  
            System.out.println();
        }
        System.out.println("sum  of the array element will be = "+sum);

    }
    
}
