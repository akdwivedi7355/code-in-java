public class A24_selectionsort {
    public static void printarr(int arr[]){
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]= {7,8,2,3,0,6,8,3,5,9,5,2};
        for (int i=0;i<arr.length-1;i++){
            int smallest =i;
            for(int j=i+1;j<(arr.length);j++){
                if (arr[j]<arr[smallest]){
                     smallest =j;
                }
            }
                int temp = arr[smallest];
                arr[smallest] =arr[i];
                arr[i] =temp;
            }
            printarr(arr);
        }
          
    }

