package arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 98, 27, 24, 21, 15, 99 };
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1] = arr[j];
                } else{
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }
}
