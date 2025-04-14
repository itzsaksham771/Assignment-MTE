// Algorithm:
// 1. Use two pointers, left starting at the beginning of the array, and right starting
// at the end.
// 2. While left < right:
// ○ Calculate the sum of the elements at left and right.
// ○ If the sum equals the target, return the indices left and right.
// ○ If the sum is less than the target, increment left.
// ○ If the sum is greater than the target, decrement right.
// 3. If no such pair is found, return -1, -1.

// Time and Space Complexities:
// ● Time Complexity: O(n), where n is the length of the array.
// ● Space Complexity: O(1), as we use only a constant amount of extra space

public class Q11 {
    public static int[] findTwoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                return new int[]{left, right};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[]{-1, -1}; // Return -1, -1 if no solution is found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = findTwoSum(arr, target);
        
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]"); // Output: [0, 1]
    }
}
