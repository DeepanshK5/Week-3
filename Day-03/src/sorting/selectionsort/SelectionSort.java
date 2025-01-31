package sorting.selectionsort;

public class SelectionSort {

    public static void selectionSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            swap(scores, i, minIndex); // Swap the found minimum element with the first unsorted element
        }
    }

    public static void swap(int[] scores, int i, int j) {
        int temp = scores[i];
        scores[i] = scores[j];
        scores[j] = temp;
    }

    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88};
        selectionSort(scores);

        System.out.println("Sorted Exam Scores:");
        for (int score : scores) {
            System.out.println(score);
        }
    }
}
