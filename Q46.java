public class Q46 {

    public static String longestPalindromicSubstring(String s) {
        String longestPalindrome = "";
        
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindromes
            int left = i, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            String currentPalindrome = s.substring(left + 1, right);
            if (currentPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = currentPalindrome;
            }
            
            // Even length palindromes
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            currentPalindrome = s.substring(left + 1, right);
            if (currentPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = currentPalindrome;
            }
        }
        
        return longestPalindrome;
    }

    public static void main(String[] args) {
        String string = "babad";
        String result = longestPalindromicSubstring(string);
        System.out.println("Longest palindromic substring: " + result); // Output: "bab" or "aba"
    }
}
