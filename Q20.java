// ● Time Complexity: O(n), where n is the given number of digits.
// ● Space Complexity: O(1), as we use only a constant amount of extra space.

public class Q20 {

    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 10;

        int count = 10; // For n = 1 (0 to 9)
        int uniqueDigits = 9;

        for (int i = 2; i <= n; i++) {
            uniqueDigits *= (11 - i); // 9 * (10 - i + 1)
            count += uniqueDigits;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 2;
        int result = countNumbersWithUniqueDigits(n);
        System.out.println("Count for n = " + n + ": " + result); // Output: 91
    }
}
