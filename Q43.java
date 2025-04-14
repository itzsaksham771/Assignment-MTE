// Time Complexity: O(N log k), where N is the length of the array. Counting frequencies is
// O(N). Heap operations (push and pop) are O(log k), and we do at most N of them.
// Space Complexity: O(N + k). O(N) for the frequency map and O(k) for the heap.

import java.util.*;

public class Q43 {

    public static List<Integer> kMostFrequent(int[] arr, int k) {
        if (arr == null || k <= 0) {
            return new ArrayList<>();
        }
        
        // Count element frequencies using a HashMap
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        
        // Create a min-heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue() // Compare by frequency
        );
        
        // Push all elements to the heap
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            heap.offer(entry);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        
        // Extract the k most frequent elements
        List<Integer> result = new ArrayList<>();
        while (!heap.isEmpty()) {
            result.add(heap.poll().getKey());
        }
        
        // Reverse to get the elements in descending order of frequency
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5};
        int k = 2;
        
        List<Integer> result = kMostFrequent(arr, k);
        System.out.println("The " + k + " most frequent elements are: " + result); // Output: [3, 1]
    }
}
