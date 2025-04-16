// Time Complexity: O(N!), where N is the length of the array. There are N! possible
// permutations.
// Space Complexity: O(N), the maximum depth of the recursion is N, and we store a
// permutation of size N. The result list has N! permutations, but that's output space

import java.util.ArrayList;
import java.util.List;

public class Q38 {
    
    // Function to generate all permutations
    public static List<List<Integer>> getAllPermutations(int[] arr) {
        List<List<Integer>> permutations = new ArrayList<>();
        generatePermutations(0, arr, permutations);
        return permutations;
    }
    
    // Helper function to generate permutations using backtracking
    private static void generatePermutations(int index, int[] arr, List<List<Integer>> permutations) {
        // If index is at the end of the array, we have a complete permutation
        if (index == arr.length) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : arr) {
                currentPermutation.add(num);
            }
            permutations.add(currentPermutation); // Add the current permutation to the list
            return;
        }
        
        // Generate permutations by swapping elements
        for (int i = index; i < arr.length; i++) {
            // Swap the current element with element at index i
            swap(arr, index, i);
            
            // Recursively generate permutations for the next index
            generatePermutations(index + 1, arr, permutations);
            
            // Backtrack: Swap the elements back to their original positions
            swap(arr, index, i);
        }
    }
    
    // Helper function to swap elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // Main method to test the code
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = getAllPermutations(arr);
        
        // Printing the permutations
        System.out.println("All permutations of " + java.util.Arrays.toString(arr) + " are: ");
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}
