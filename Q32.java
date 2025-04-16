// Time Complexity: O(n), where n is the number of bars in the histogram.
// Space Complexity: O(n) in the worst case, as the stack might store all the indices
// of the histogram bars if they are in increasing order.


import java.util.Stack;

public class Q32 {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        
        // Traverse through all bars in the histogram
        for (int i = 0; i <= n; i++) {
            // Add a sentinel value at the end to process remaining bars
            int currentHeight = (i < n) ? heights[i] : 0;
            
            // Pop from the stack while the current height is less than the height of the bar at the top of the stack
            while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {
                int height = heights[stack.pop()];
                int width = (stack.isEmpty()) ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        
        return maxArea;
    }

    public static void main(String[] args) {
        int[] histogram = {2, 1, 5, 6, 2, 3};
        int maxArea = largestRectangleArea(histogram);
        System.out.println("The largest rectangular area in the histogram is: " + maxArea);
    }
}
