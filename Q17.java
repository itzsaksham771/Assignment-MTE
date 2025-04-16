// Time Complexity: O(n), where n is the number of bars in the histogram.
// Space Complexity: O(1), as we use only a constant amount of extra space.
public class Q17 {

    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        int[] histogram = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trappedWater = trap(histogram);
        System.out.println("Trapped water: " + trappedWater); // Output: 6
    }
}
