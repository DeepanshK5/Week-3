package sorting.quicksort;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1); // Left partition
            quickSort(arr, pivotIndex + 1, high); // Right partition
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // Taking the first element as pivot
        int i = low + 1;
        int j = high;

        while (true) {
            while (i <= high && arr[i] < pivot) {
                i++;
            }
            while (j > low && arr[j] >= pivot) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            } else {
                break;
            }
        }
        swap(arr, low, j); // Placing pivot at the correct position
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] prices = {199, 49, 159, 249, 99};
        quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Prices:");
        for (int price : prices) {
            System.out.println(price);
        }
    }
}
