//  if there are n element in a bubble sort then their is a n-1 passes in a bubble sort
public class A23_bubblesort {
    public static void printarr(int arr[]){
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]= {50,40,30,20,10};
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<(arr.length-i-1);j++){
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr [j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printarr(arr);
    }
}
