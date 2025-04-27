// QUESTION 1
// Explain the concept of a prefix sum array and its applications.
// ANSWER
// A prefix sum array stores the cumulative sum of elements in an array. For an array arr, the 
// prefix sum array prefix[i] = arr[0] + arr[1] + ... + arr[i]. It enables efficient
// range sum queries in O(1) time after an O(n) preprocessing step. Applications include:
// • Range sum queries
// • Equilibrium index checks
// • Frequency/count queries in binary strings
// • Optimization problems like subarray sums