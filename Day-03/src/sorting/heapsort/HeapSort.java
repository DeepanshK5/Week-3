package sorting.heapsort;

public class HeapSort {

    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Build a Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements one by one from the heap
        for (int i = n - 1; i > 0; i--) {
            swap(salaries, 0, i); // Move current root to end
            heapify(salaries, i, 0); // Reheapify the reduced heap
        }
    }

    public static void heapify(int[] salaries, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check if left child exists and is greater than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // Check if right child exists and is greater than root
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            swap(salaries, i, largest);
            heapify(salaries, n, largest);
        }
    }

    public static void swap(int[] salaries, int i, int j) {
        int temp = salaries[i];
        salaries[i] = salaries[j];
        salaries[j] = temp;
    }

    public static void main(String[] args) {
        int[] salaries = {60000, 45000, 75000, 55000, 80000};
        heapSort(salaries);

        System.out.println("Sorted Salaries (ascending):");
        for (int salary : salaries) {
            System.out.println(salary);
        }
    }
}
