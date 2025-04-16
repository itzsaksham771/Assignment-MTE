// Time Complexity: O(1), constant time.
// ● Space Complexity: O(1), constant space

public class Q22 {

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 8, 16, 24};
        for (int num : numbers) {
            System.out.println(num + " is a power of two: " + isPowerOfTwo(num));
        }
    }
}
