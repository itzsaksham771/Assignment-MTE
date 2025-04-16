// Time Complexity: O(n), where n is the length of the array. Each element is
// pushed onto and popped from the stack at most once.
// ● Space Complexity: O(n), in the worst case, the stack might contain all the
// indices of the array.

import java.util.Stack;

public class Q25 {
    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        // Initialize result array with -1
        for (int i = 0; i < arr.length; i++) {
            result[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // Pop elements from the stack that are smaller than the current element
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int poppedIndex = stack.pop();
                result[poppedIndex] = arr[i];
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        int[] result = nextGreaterElement(arr);

        System.out.print("Next greater elements: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
        // Output: 3 4 4 -1
    }
}
