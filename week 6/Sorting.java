public class Sorting {

    // recursive bubble sort
    static void bubbleSort(int arr[], int n) {
        if (n == 1) {
            return;
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count = count + 1;
            }

        if (count == 0)
            return;
        bubbleSort(arr, n - 1);
    }

    // recursive selection sort
    static void selectionSort(int arr[], int n, int index) {
        if (index == n)
            return;

        int minIndex = index;
        for (int j = index + 1; j < n; j++)
            if (arr[j] < arr[minIndex])
                minIndex = j;

        if (minIndex != index) {
            int temp = arr[minIndex];
            arr[minIndex] = arr[index];
            arr[index] = temp;
        }

        selectionSort(arr, n, index + 1);
    }

    // recursive insertion sort
    static void insertionSort(int arr[], int n) {
        if (n <= 1)
            return;

        insertionSort(arr, n - 1);
        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }

    static void printArray(int arr[]) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = { 64, 25, 12, 22, 11 };
        int arr2[] = arr1.clone();
        int arr3[] = arr1.clone();
        bubbleSort(arr1, arr1.length);
        System.out.print("Bubble Sorted: ");
        printArray(arr1);

        selectionSort(arr2, arr2.length, 0);
        System.out.print("Selection Sorted: ");
        printArray(arr2);

        insertionSort(arr3, arr3.length);
        System.out.print("Insertion Sorted: ");
        printArray(arr3);
    }
}
