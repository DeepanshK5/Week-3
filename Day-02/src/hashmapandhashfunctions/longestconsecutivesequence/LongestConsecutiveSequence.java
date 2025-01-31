package hashmapandhashfunctions.longestconsecutivesequence;

import java.util.*;

public class LongestConsecutiveSequence {
    static int findLongestConsecutiveSequence(int arr[], int n) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;

        for (int num : arr) {
            set.add(num);
        }

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findLongestConsecutiveSequence(arr, n));
        sc.close();
    }
}