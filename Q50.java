// Concept of Equilibrium Index:
// An equilibrium index in an array is an index such that the sum of elements at
// indices lower than it is equal to the sum of elements at indices greater than it.
// For an array arr of size n, an index i is an equilibrium index if:
// arr[0] + arr[1] + ... + arr[i-1] = arr[i+1] + arr[i+2] + ... + arr[n-1]
// 67
// If i = 0, the sum of the left side is considered 0. Similarly, if i = n - 1, the sum of the
// right side is considered 0.
// Applications in Array Problems:
// The concept of equilibrium index can be applied to various array problems:
// 1. Array Balancing: Finding an equilibrium index helps identify a point in the
// array where the "weight" of the elements on the left is balanced with the
// "weight" of the elements on the right.
// 2. Prefix Sum Problems: The equilibrium index problem is related to prefix sum
// calculations. Efficiently computing prefix sums can help in finding equilibrium
// indices.
// 3. Divide and Conquer Algorithms: The concept can be used in divide-andconquer strategies for solving certain array-related problems.
// 4. Load Balancing: In distributed systems, the idea of equilibrium can be
// extended to balance the load across different nodes.
// 5. Game Theory: Equilibrium points in certain games can be related to the
// concept of equilibrium indices in arrays