// Algorithm:
// 1. Initialize a seen dictionary to store the last seen index of each character.
// 2. Initialize start and max_length to 0.
// 3. Iterate through the string:
// ○ If the current character is in seen and its last seen index is greater than or
// equal to start, update start to seen[character] + 1.
// ○ Update seen[character] with the current index.
// ○ Update max_length to the maximum of max_length and the current
// substring length (index-start+1)

// Time and Space Complexities:
// ● Time Complexity: O(n), where n is the length of the string.
// ● Space Complexity: O(min(m, n)), where n is the length of the string, and m is
// the size of the character set

import java.util.HashMap;

public class Q6 {

    // Method to find the length of the longest substring with all unique characters
    public static int longestUniqueSubstringLength(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int start = 0;
        int maxLength = 0;

        for (int index = 0; index < s.length(); index++) {
            char character = s.charAt(index);

            if (seen.containsKey(character) && seen.get(character) >= start) {
                start = seen.get(character) + 1;
            }

            seen.put(character, index);
            maxLength = Math.max(maxLength, index - start + 1);
        }

        return maxLength;
    }

    // Sample usage
    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = longestUniqueSubstringLength(input);
        System.out.println("Length of longest unique substring: " + result); // Output: 3 ("abc")
    }
}
