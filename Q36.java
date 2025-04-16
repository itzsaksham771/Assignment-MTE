// Time Complexity: O(2N), where N is the length of the array. Each element can either be in
// a subset or not, leading to 2N possible combinations.
// Space Complexity: O(N), the maximum depth of the recursion is N, and we store a subset
// of at most size N. The result list can have 2N subsets, but that's the size of the output, not
// the auxiliary space used by the algorithm.


import java.util.*;

public class Q36 {
    public static List<List<Integer>> getAllSubsets(int[] arr) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(0, arr, new ArrayList<>(), subsets);
        return subsets;
    }

    private static void generateSubsets(int index, int[] arr, List<Integer> currentSubset, List<List<Integer>> subsets) {
        // Add the current subset (a copy) to the list of subsets
        subsets.add(new ArrayList<>(currentSubset));

        // Generate further subsets
        for (int i = index; i < arr.length; i++) {
            currentSubset.add(arr[i]); // Add the current element to the subset
            generateSubsets(i + 1, arr, currentSubset, subsets); // Move forward to the next index
            currentSubset.remove(currentSubset.size() - 1); // Backtrack, remove the last element
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = getAllSubsets(arr);
        System.out.println("All subsets of the array are: " + result);
    }
}
