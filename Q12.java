// Algorithm:
// 13
// 1. Find the largest index i such that arr[i] < arr[i+1]. If no such i exists, the
// permutation is the last one (descending order). Reverse the whole array and
// return.
// 2. Find the largest index j > i such that arr[j] > arr[i].
// 3. Swap arr[i] and arr[j].
// 4. Reverse the subarray from i+1 to the end.

// Time and Space Complexities:
// ● Time Complexity: O(n), where n is the length of the array.
// ● Space Complexity: O(1), as we use only a constant amount of extra space

import java.util.Arrays;

public class Q12 {
    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        
        // Find the largest i such that arr[i] < arr[i+1]
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        
        if (i == -1) { // Array is in descending order
            reverse(arr, 0, n - 1);
            return;
        }
        
        // Find the largest j > i such that arr[j] > arr[i]
        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }
        
        // Swap arr[i] and arr[j]
        swap(arr, i, j);
        
        // Reverse the subarray from i+1 to the end
        reverse(arr, i + 1, n - 1);
    }
    
    // Helper function to swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper function to reverse a subarray
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(arr);
        
        System.out.println("Next permutation: " + Arrays.toString(arr)); // Output: [1, 3, 2]
    }
}
