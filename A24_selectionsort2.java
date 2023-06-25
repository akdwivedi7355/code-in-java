public class A24_selectionsort2 {
    public static void printarr(int[] arr){
        for(int l=0;l<arr.length;l++){
            System.out.println(arr[l]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
     int arr[] ={1,3,9,5,6,9};
        for(int p=0;p<arr.length-1;p++){
            int smallest = p;
            for(int j=p+1;j<arr.length;p++){
                if(arr[j]<arr[smallest]){
                    smallest =j;
                }
                int temp= arr[smallest];
                arr[smallest]=arr[p];
                arr[p]=temp;
            }
        }
        printarr(arr);
    }
}
