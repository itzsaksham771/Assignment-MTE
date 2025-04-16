// Time Complexity: O(log10 n), where n is the input integer.
// Space Complexity: O(1), as we are using a constant amount of extra space for
// variables.


public class Q29 {
    public static boolean isPalindrome(int num) {
        // If the number is negative, it's not a palindrome
        if (num < 0) {
            return false;
        }
        
        int originalNum = num;
        int reversedNum = 0;
        
        // Reverse the digits of the number
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        // Check if the original number is equal to the reversed number
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        int number = 121;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        
        number = 123;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
