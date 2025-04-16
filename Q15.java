// Time and Space Complexities:
// ● Time Complexity: O(n * log(max - min)), where n is the number of
// rows/columns in the matrix, and max and min are the maximum and minimum
// values in the matrix.
// ● Space Complexity: O(1), as we use only a constant amount of extra space.

public class Q15{

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            for (int r = 0; r < n; r++) {
                int c = n - 1;
                while (c >= 0 && matrix[r][c] > mid) {
                    c--;
                }
                count += (c + 1);
            }

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        int result = kthSmallest(matrix, k);
        System.out.println("8th smallest element: " + result); // Output: 13
    }
}
