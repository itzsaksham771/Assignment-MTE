// Algorithm:
// 1. Create a Prefix Sum Array:
// ○ Initialize a prefix sum array of the same size as the input array.
// ○ Set the first element of the prefix sum array equal to the first element of
// the input array.
// ○ Iterate through the input array from the second element (index 1) to the
// end.
// ○ For each element at index i in the input array, calculate the prefix sum at
// index i as the sum of the element at index i and the prefix sum at index i-1.
// 2. Calculate Range Sum:
// ○ Given the range [L, R].
// ○ If L is 0, the sum of elements in the range is simply the prefix sum at index
// R.
// ○ If L is greater than 0, the sum of elements in the range is the prefix sum at
// index R minus the prefix sum at index L-1.



// Time and Space Complexities:
// ● Time Complexity:
// ○ Creating the prefix sum array takes O(n) time, where n is the size of the
// input array.
// ○ Calculating the range sum using the prefix sum array takes O(1) time.
// ● Space Complexity: O(n) for storing the prefix sum array.


public class Q2 {

    // Method to generate prefix sum array
    public static int[] prefixSumArray(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];

        if (n > 0) {
            prefixSum[0] = arr[0];
            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + arr[i];
            }
        }

        return prefixSum;
    }

    // Method to compute range sum from index L to R (inclusive)
    public static String rangeSum(int[] prefixSum, int L, int R) {
        if (L < 0 || R >= prefixSum.length || L > R) {
            return "Invalid range";
        }

        if (L == 0) {
            return String.valueOf(prefixSum[R]);
        } else {
            return String.valueOf(prefixSum[R] - prefixSum[L - 1]);
        }
    }

    // Sample usage
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefixSum = prefixSumArray(arr);

        System.out.println("Range Sum [1, 3]: " + rangeSum(prefixSum, 1, 3)); // Should print 18
        System.out.println("Range Sum [0, 4]: " + rangeSum(prefixSum, 0, 4)); // Should print 30
    }
}
