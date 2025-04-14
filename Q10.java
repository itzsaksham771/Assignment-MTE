// Algorithm:
// 1. If the string is empty or has only one character, return the string itself as the
// only permutation.
// 2. For a string of length n:
// ○ Fix the first character and recursively generate all permutations of the
// remaining (n-1) characters.
// ○ For each of the permutations obtained from the recursive call, insert the
// fixed first character at all possible positions.

// Time and Space Complexities:
// ● Time Complexity: O(n! * n), where n is the length of the string. (n! for the
// number of permutations, and n for the string concatenation in each
// permutation)
// ● Space Complexity: O(n!), to store the generated permutations.

import java.util.ArrayList;
import java.util.List;

public class Q10 {

    // Method to get all permutations of a string
    public static List<String> getPermutations(String s) {
        List<String> permutations = new ArrayList<>();
        
        if (s.length() <= 1) {
            permutations.add(s);
            return permutations;
        }

        char firstChar = s.charAt(0);
        String restChars = s.substring(1);
        List<String> permsOfRest = getPermutations(restChars);

        for (String perm : permsOfRest) {
            for (int i = 0; i <= perm.length(); i++) {
                String newPerm = perm.substring(0, i) + firstChar + perm.substring(i);
                permutations.add(newPerm);
            }
        }

        return permutations;
    }

    // Sample usage
    public static void main(String[] args) {
        String s = "abc";
        List<String> result = getPermutations(s);
        System.out.println("Permutations of " + s + ": " + result);
        // Output: [abc, bac, bca, acb, cab, cba]
    }
}
