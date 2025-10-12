package arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12, 56, 8, 75, 25, 22};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i < high && arr[i] < pivot) {
                i++;
            }
            while (j > low && arr[j] > pivot) {
                j--;
            }
            if (i >= j) {
                break;
            }

            swap(arr, i, j);
        }

        return j; // partition index
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p);       // left side
            quickSort(arr, p + 1, high);  // right side
        }
    }
}
