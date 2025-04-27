// QUESTION 2
// Write a program to find the sum of elements in a given range [L, R] using a prefix sum
// array. Write its algorithm, program. Find its time and space complexities. Explain with
// suitable example.
// ANSWER
// Algorithm:
// 1. Build prefix array: prefix[i] = prefix[i-1] + arr[i].
// 2. Range sum from L to R: prefix[R] - prefix[L-1].
// Time Complexity: O(n) for preprocessing, O(1) for queries
// Space Complexity: O(n)
// Example: Sum of index 1 to 3 in [1,2,3,4,5] is 2+3+4 = 9.
public class Question2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int L = 1, R = 3;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
        prefix[i] = prefix[i - 1] + arr[i];
        int sum = (L > 0) ? prefix[R] - prefix[L - 1] : prefix[R];
        System.out.println("Sum: " + sum);
        }
}
