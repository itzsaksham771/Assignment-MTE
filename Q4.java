// Algorithm:
// 1. Calculate the Total Sum: Calculate the sum of all elements in the array.
// 2. Iterate and Check:
// ○ Initialize a variable left_sum to 0.
// ○ Iterate through the array from left to right (index i from 0 to n-1).
// ○ Update left_sum by adding the current element array[i].
// 5
// ○ Calculate the right_sum as total_sum - left_sum.
// ○ If left_sum is equal to right_sum, it means the array can be split at index
// i+1 (after the current element) into two parts with equal sums. Return True.
// 3. No Split Found: If the loop completes without finding such a split, return
// False.

// Time and Space Complexities:
// ● Time Complexity: O(n), where n is the size of the array.
// ● Space Complexity: O(1), as we are using a constant amount of extra space

public class Q4 {

    // Method to check if array can be split into two parts with equal sum
    public static boolean canSplitEqualSum(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }

    // Sample usage
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3};
        System.out.println("Can split: " + canSplitEqualSum(arr1)); // Output: true

        int[] arr2 = {1, 2, 3, 5};
        System.out.println("Can split: " + canSplitEqualSum(arr2)); // Output: false
    }
}
