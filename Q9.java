// Algorithm:
// 1. If the list of strings is empty, return "".
// 2. Take the first string as the initial prefix.
// 3. Iterate through the remaining strings.
// ○ For each string, compare it character by character with the current prefix.
// ○ Shorten the prefix if it doesn't match the current string.
// 4. Return the final prefix.

// Time and Space Complexities:
// ● Time Complexity: O(S), where S is the total number of characters in all
// strings.
// ● Space Complexity: O(1), as we use only a constant amount of extra space

public class Q9 {

    // Method to find the longest common prefix
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < prefix.length() && j < strs[i].length() &&
                   prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);

            // Early exit if prefix becomes empty
            if (prefix.isEmpty()) break;
        }

        return prefix;
    }

    // Sample usage
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + result); // Output: "fl"
    }
}
