package stackandqueue.stockspan;

import java.util.Stack;
import java.util.Scanner;

class Stock_Span_Problem {
    static void calculateSpan(int arr[], int n) {
        int span[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(span[i]);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        calculateSpan(arr, n);
        sc.close();
    }
}
