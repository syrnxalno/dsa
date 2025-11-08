public class RecursiveMax {
    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        // compare current element with max of the rest
        int maxOfRest = findMax(arr, index + 1);
        return Math.max(arr[index], maxOfRest);
    }

    public static void main(String[] args) {
        int[] numbers = {3, 17, 9, 5, 22, 14};
        int max = findMax(numbers, 0);
        System.out.println("Maximum element: " + max);
    }
}
