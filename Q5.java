// Algorithm:
// 1. Calculate the sum of the first K elements. Store this as max_sum and
// window_sum.
// 2. Use a sliding window: Iterate from the Kth element to the end of the array.
// ○ Subtract the first element of the current window (arr[i-K]) from
// window_sum.
// ○ Add the next element (arr[i]) to window_sum.
// ○ Update max_sum if window_sum is greater.
// 3. Return max_sum.

// Time and Space Complexities:
// ● Time Complexity: O(n), where n is the length of the array.
// ● Space Complexity: O(1), as we use only a constant amount of extra space.

public class Q5 {

    // Method to find the maximum sum of subarray of size k
    public static String maxSubarraySumK(int[] arr, int k) {
        int n = arr.length;
        if (k > n) {
            return "Invalid k";
        }

        // Compute sum of first k elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < n; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return String.valueOf(maxSum);
    }

    // Sample usage
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        String maxSum = maxSubarraySumK(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSum); // Output: 39
    }
}
