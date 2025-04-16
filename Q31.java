// Time Complexity: O(n), where n is the size of the input array.
// Space Complexity: O(k), where k is the size of the sliding window.


import java.util.*;

public class Q31 {
    public static List<Integer> findMaxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        List<Integer> maxValues = new ArrayList<>();
        
        // Deque to store indices of elements
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            // Remove elements from the back of deque that are smaller than the current element
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            
            // Add current element's index to the back of deque
            deque.offer(i);
            
            // Remove elements from the front of deque that are out of the current window
            if (deque.peekFirst() == i - k) {
                deque.pollFirst();
            }
            
            // If the window size is reached, the front of deque has the index of the maximum element
            if (i >= k - 1) {
                maxValues.add(arr[deque.peekFirst()]);
            }
        }
        
        return maxValues;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        
        List<Integer> result = findMaxSlidingWindow(arr, k);
        System.out.println("Maximums in sliding windows of size " + k + ": " + result);
        // Expected output: [3, 3, 5, 5, 6, 7]
    }
}
