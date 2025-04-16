import java.util.*;

public class Q37 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);  // Sort to handle duplicates and optimize
        List<List<Integer>> combinations = new ArrayList<>();
        findCombinations(0, candidates, target, new ArrayList<>(), combinations);
        return combinations;
    }

    private static void findCombinations(int index, int[] candidates, int target,
                                          List<Integer> currentCombination, List<List<Integer>> combinations) {
        if (target == 0) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            // Skip duplicates
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Include the current candidate
            currentCombination.add(candidates[i]);

            // Recur with the reduced target (i+1 to prevent reusing the same candidate in the same position)
            findCombinations(i + 1, candidates, target - candidates[i], currentCombination, combinations);

            // Backtrack and remove the last element
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println("Combinations that sum to " + target + ": " + result);
    }
}