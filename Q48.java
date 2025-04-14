// Algorithm:
// 1. Find the largest index i such that arr[i] < arr[i + 1]. If no such i exists, the array
// is in descending order, and it's the last permutation. In this case, reverse the
// entire array and return.
// 2. Find the largest index j > i such that arr[j] > arr[i].
// 3. Swap arr[i] and arr[j].
// 4. Reverse the subarray arr[i + 1 ... n - 1].

// Time Complexity: O(N), where N is the length of the array. Each step takes at most O(N)
// time.
// Space Complexity: O(1), as we modify the array in place and use only a constant amount
// of extra space.

public class Q48 {

    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        
        // Step 1: Find the largest i such that arr[i] < arr[i + 1]
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        
        if (i == -1) { // Array is in descending order (last permutation)
            reverse(arr, 0, n - 1);
            return;
        }
        
        // Step 2: Find the largest j > i such that arr[j] > arr[i]
        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }
        
        // Step 3: Swap arr[i] and arr[j]
        swap(arr, i, j);
        
        // Step 4: Reverse the subarray arr[i + 1 ... n - 1]
        reverse(arr, i + 1, n - 1);
    }
    
    // Helper method to swap two elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper method to reverse a subarray
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(arr);
        
        // Print the next permutation
        System.out.print("Next permutation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: [1, 3, 2]
    }
}
