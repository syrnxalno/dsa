package arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 98, 27, 24, 21, 15, 99 };
        mergeSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int start, int end){
        if(start<end){
            int mid = start +(end-start) / 2;
            // sort the two halves
            mergeSort(arr,start,mid);
            mergeSort(arr, mid+1, end);

            // merging after sorting
            merge(arr,start,mid,end);
        }
    }

    public static void merge(int arr[], int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;

        int left[] = new int[n1];
        int right[] = new int[n2];

        // temporarily fill up the left and right sub arrays
        for(int i=0;i<n1;i++){
            left[i] = arr[l+i];
        }
        for(int j=0;j<n2;j++){
            right[j] = arr[m+j+1];
        }

        // compare elements of subarrays and rearrange them
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        // fill up the remaining elements
         while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

         while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
