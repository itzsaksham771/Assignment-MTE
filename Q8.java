// Algorithm:
// 1. Iterate through each character in the string.
// 2. For each character, consider it as the center of a potential palindrome and
// expand outwards, checking for both odd-length and even-length
// palindromes.
// 3. Keep track of the longest palindrome found so far.


// Time and Space Complexities:
// ● Time Complexity: O(n^2), where n is the length of the string.
// ● Space Complexity: O(1), as we use only a constant amount of extra space.

public class Q8 {

    // Method to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) return s;

        String longest = "";

        for (int i = 0; i < n; i++) {
            // Odd length palindrome
            int l = i, r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > longest.length()) {
                    longest = s.substring(l, r + 1);
                }
                l--;
                r++;
            }

            // Even length palindrome
            l = i;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if ((r - l + 1) > longest.length()) {
                    longest = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
        }

        return longest;
    }

    // Sample usage
    public static void main(String[] args) {
        String s = "babad";
        String result = longestPalindrome(s);
        System.out.println("Longest palindrome: " + result); // Output: "bab" or "aba"
    }
}
