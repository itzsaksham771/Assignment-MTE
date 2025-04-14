// A prefix sum array is a new array where each element at index i stores the sum of
// all elements in the original array up to and including index i. For example, if the
// original array is [a₁, a₂, a₃, ..., an], the prefix sum array would be [a₁, a₁+a₂, a₁+a₂+a₃,
// ..., a₁+a₂+...+an].
// Applications of prefix sum arrays include:
// ● Range Sum Queries: Efficiently calculating the sum of elements within any
// given range [L, R] in the original array by subtracting the prefix sum at index L1 from the prefix sum at index R.
// ● Solving Subarray Sum Problems: Determining if a subarray with a specific
// sum exists.
// ● Image Processing: Calculating sums of pixel intensities in rectangular
// regions.
// ● Data Analysis: Quickly computing cumulative sums for various metrics.