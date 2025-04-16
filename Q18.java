// Time Complexity: O(n^2), where n is the number of elements in the array.
// ● Space Complexity: O(1), as we use only a constant amount of extra space.

public class Q18 {

    public static int findMaxXOR(int[] nums) {
        int maxXor = 0;
        for (int num1 : nums) {
            for (int num2 : nums) {
                maxXor = Math.max(maxXor, num1 ^ num2);
            }
        }
        return maxXor;
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};
        int result = findMaxXOR(nums);
        System.out.println("Maximum XOR: " + result); // Output: 28
    }
}
