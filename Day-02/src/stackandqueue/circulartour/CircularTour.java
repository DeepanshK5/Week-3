package stackandqueue.circulartour;

import java.util.*;

public class CircularTour {
    static int findStartingPump(int petrol[], int distance[], int n) {
        int start = 0, deficit = 0, surplus = 0;

        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - distance[i];
            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }
        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int petrol[] = new int[n];
        int distance[] = new int[n];

        for (int i = 0; i < n; i++) {
            petrol[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            distance[i] = sc.nextInt();
        }

        System.out.println(findStartingPump(petrol, distance, n));
        sc.close();
    }
}
