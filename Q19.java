// Time Complexity: O(n), where n is the length of the array.
// ● Space Complexity: O(1), as we use only a constant amount of extra space

public class Q19 {

    public static int maxProductSubarray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // If current number is negative, swap max and min
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);
            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int maxProduct = maxProductSubarray(nums);
        System.out.println("Maximum product: " + maxProduct); // Output: 6
    }
}
