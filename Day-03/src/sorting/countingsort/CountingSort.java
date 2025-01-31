package sorting.countingsort;

public class CountingSort {

    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        // Create a count array and initialize it to 0
        int[] count = new int[range];

        // Count the frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Compute cumulative frequencies
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Create an output array to store the sorted ages
        int[] output = new int[ages.length];

        // Place the elements in their correct position in the output array
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // Copy the sorted array back to the original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        int[] ages = {16, 12, 18, 15, 14, 12, 16, 17, 13};
        countingSort(ages);

        System.out.println("Sorted Ages:");
        for (int age : ages) {
            System.out.println(age);
        }
    }
}
