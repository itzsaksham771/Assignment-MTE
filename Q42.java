// Concept of Dynamic Programming:
// Dynamic programming (DP) is an algorithmic technique for solving optimization
// problems by breaking them down into smaller overlapping subproblems, solving
// each subproblem only once, and storing the results (often in a table) to avoid
// redundant computations. It's applicable when a problem exhibits the properties of:
// ● Overlapping Subproblems: The problem can be divided into subproblems
// that are reused multiple times.
// ● Optimal Substructure: The optimal solution to the problem can be
// constructed from the optimal solutions to its subproblems.
// Use of Dynamic Programming in Solving the Maximum Subarray Problem:
// While Kadane's algorithm is the standard and most efficient way to solve the
// maximum subarray problem, dynamic programming principles can be applied. We
// can define a subproblem as finding the maximum subarray sum ending at index i.
// Let max_so_far[i] be the maximum subarray sum ending at index i. Then we have
// the following recurrence relation:
// max_so_far[i] = max(arr[i], max_so_far[i-1] + arr[i])
// This relation has optimal substructure because the maximum subarray sum ending
// at i depends on the maximum subarray sum ending at i-1. It also has overlapping
// subproblems because to calculate max_so_far[i], we need max_so_far[i-1], and so
// on.
// Dynamic Programming Approach (Less Efficient than Kadane's):
// 1. Create an array max_so_far of the same size as the input array arr.
// 2. Initialize max_so_far[0] = arr[0].
// 3. Iterate from i = 1 to the end of the array:
// ○ Calculate max_so_far[i] = max(arr[i], max_so_far[i-1] + arr[i]).

// 4. The maximum subarray sum is the maximum value in the max_so_far array.
// Why Kadane's is Preferred:
// Kadane's algorithm is essentially an optimized version of this dynamic
// programming approach. It avoids the need to store the entire max_so_far array by
// keeping track of only the current maximum sum, making it more space-efficient.