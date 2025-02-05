package binarysearch.search2darray;

public class MatrixSearch {
    public static boolean searchMatrix(int[][] m, int t) {
        int row, l = 0, r = m.length - 1, mid;
        int col = m[0].length-1;

        while (l < r) {
            mid = (l + r) / 2;
            if (m[mid][col] < t) l = mid + 1;
            else if (m[mid][0] > t) r = mid - 1;
            else {
                l = mid;
                break;
            };
        }
        row = l;

        l = 0;
        r = col;
        while (l <= r) {
            mid = (l + r) / 2;
            if (m[row][mid] < t) l = mid + 1;
            else if (m[row][mid] > t) r = mid - 1;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 16;
        System.out.println(searchMatrix(matrix, target));
    }
}
