// Time Complexity: O(n), where n is the size of the array.
// Space Complexity: O(n), in the worst case, the hash map might store the prefix
// sums for all n elements.


import java.util.HashMap;
import java.util.Map;

public class Q34 {
    public static int subarraySumEqualsK(int[] arr, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); // Initialize with sum 0 having one occurrence
        int currentSum = 0;
        int count = 0;
        
        for (int num : arr) {
            currentSum += num;
            if (prefixSumMap.containsKey(currentSum - k)) {
                count += prefixSumMap.get(currentSum - k);
            }
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1};
        int k1 = 2;
        int result1 = subarraySumEqualsK(arr1, k1);
        System.out.println("Number of subarrays with sum " + k1 + ": " + result1);
        
        int[] arr2 = {1, 2, 3};
        int k2 = 3;
        int result2 = subarraySumEqualsK(arr2, k2);
        System.out.println("Number of subarrays with sum " + k2 + ": " + result2);
    }
}
