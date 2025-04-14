// Algorithm:
// An equilibrium index of an array is an index such that the sum of elements at lower
// indices is equal to the sum of elements at higher indices.
// 1. Calculate the Total Sum: Calculate the sum of all elements in the array.
// 2. Iterate and Check:
// ○ Initialize a variable left_sum to 0.
// ○ Iterate through the array from left to right (index i from 0 to n-1).
// ○ For each index i, calculate the right_sum as total_sum - left_sum - array[i].
// ○ If left_sum is equal to right_sum, then i is an equilibrium index. Return i.
// ○ Update left_sum by adding the current element array[i] to it.
// 3. No Equilibrium Index: If the loop completes without finding an equilibrium
// index, return -1.

// Time and Space Complexities:
// ● Time Complexity: O(n), where n is the size of the array.
// ● Space Complexity: O(1), as we are using a constant amount of extra space
// for variables.

public class Q3 {

    // Method to find the equilibrium index
    public static int findEquilibriumIndex(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }

        return -1;
    }

    // Sample usage
    public static void main(String[] args) {
        int[] arr1 = {-7, 1, 5, 2, -4, 3, 0};
        int index1 = findEquilibriumIndex(arr1);
        System.out.println("Equilibrium index of arr1: " + index1); // Output: 3

        int[] arr2 = {1, 2, 3};
        int index2 = findEquilibriumIndex(arr2);
        System.out.println("Equilibrium index of arr2: " + index2); // Output: -1
    }
}
