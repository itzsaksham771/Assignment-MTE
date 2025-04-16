// Time Complexity: O(N), where N is the length of the array. We iterate through the array
// once to build the frequency map and once to find the maximum frequency.
// Space Complexity: O(N), in the worst case, the hash map might store all unique elements
// of the array

import java.util.HashMap;
import java.util.Map;

public class Q40 {
    public static Integer findMaxFrequencyElement(int[] arr) {
        // Return null if the array is empty
        if (arr == null || arr.length == 0) {
            return null;
        }

        // Map to store frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Populate the frequency map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        Integer maxElement = null;

        // Find the element with the maximum frequency
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 2, 5};
        Integer result = findMaxFrequencyElement(arr);
        System.out.println("The element with the maximum frequency is: " + result);  // Output: 2
    }
}
