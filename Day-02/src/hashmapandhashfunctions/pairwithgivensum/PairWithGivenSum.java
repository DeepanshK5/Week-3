package hashmapandhashfunctions.pairwithgivensum;

import java.util.*;

public class PairWithGivenSum {
    static boolean hasPairWithSum(int arr[], int n, int target) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (set.contains(target - arr[i])) {
                System.out.println("Pair found: (" + arr[i] + ", " + (target - arr[i]) + ")");
                return true;
            }
            set.add(arr[i]);
        }

        System.out.println("No pair found");
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        hasPairWithSum(arr, n, target);
        sc.close();
    }
}