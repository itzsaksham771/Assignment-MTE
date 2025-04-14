// Time Complexity: O(N), where N is the length of the array. We iterate through the array
// only once. Hash set operations (add and check) take O(1) on average.
// Space Complexity: O(N), in the worst case, we might store all the elements of the array in
// the seen set

import java.util.HashSet;
import java.util.Set;

public class Q44 {

    public static int[] findPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return new int[] {complement, num};
            }
            seen.add(num);
        }
        
        return null; // Return null if no such pair exists
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = findPairWithSum(arr, target);
        
        if (result != null) {
            System.out.println("Pair with sum " + target + ": (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("No pair found with sum " + target);
        }
    }
}
