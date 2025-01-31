package sorting.insertionsort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 110, 104, 101, 109}; // example employee IDs array
        insertionSort(employeeIDs);

        // Print sorted employee IDs
        for (int i = 0; i < employeeIDs.length; i++) {
            System.out.println(employeeIDs[i]);
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Traverse the array from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // the element to be inserted into the sorted part
            int j = i - 1;

            // Move elements of the sorted part that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Insert the key at its correct position
            arr[j + 1] = key;
        }
    }
}
