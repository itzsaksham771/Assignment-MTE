// Time Complexity: O(n), where n is the given number.
// ● Space Complexity: O(n), to store the dp array

public class Q21 {

    public static int countOnes(int n) {
        int[] dp = new int[n + 1];
        int total = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i & 1); // Right shift and check LSB
            total += dp[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = countOnes(n);
        System.out.println("Total 1s from 0 to " + n + ": " + result); // Output: 7
    }
}
