// Time Complexity: O(N), where N is the length of the array. We iterate through the array
// only once.
// Space Complexity: O(1), as we use only a constant amount of extra space.

public class Q41 {

    public static int maxSubarraySum(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE; // Initialize with negative infinity
        int currentMax = 0;
        
        for (int x : arr) {
            currentMax = Math.max(x, currentMax + x);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubarraySum(arr);
        System.out.println("Maximum subarray sum: " + maxSum); // Output: 6
    }
}
