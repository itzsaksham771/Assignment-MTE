// ● Time Complexity: O(n), where n is the length of the array.
// ● Space Complexity: O(1), as we use only a constant amount of extra space.

public class Q16 {

    public static int findMajorityElement(int[] arr) {
        int candidate = 0;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int majorityElement = findMajorityElement(arr);
        System.out.println("Majority element: " + majorityElement); // Output: 3
    }
}
