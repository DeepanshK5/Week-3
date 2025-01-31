package stackandqueue.slidingwindowmaximum;

import java.util.*;

class Sliding_Window_Maximum {
    static void findMaxInWindow(int arr[], int n, int k) {
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
            if (i >= k - 1) {
                System.out.println(arr[deque.peekFirst()]);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findMaxInWindow(arr, n, k);
        sc.close();
    }
}
