// QUESTION 4
// Check if an array can be split into two parts such that the sum of the prefix equals the
// sum of the suffix. Write its algorithm, program. Find its time and space complexities.
// Explain with suitable example.
// ANSWER
// Algorithm: Check if any prefix sum equals total sum/2
// Time/Space: O(n)/O(1) ]
// Example: [1, 2, 3, 3] → Split after 2nd index: 1+2 = 3+3
public class Question4 {
    public static boolean canSplit(int[] arr) {
        int total = 0, prefixSum = 0;
        for (int num : arr) total += num;
        for (int i = 0; i < arr.length - 1; i++) {
        prefixSum += arr[i];
        if (prefixSum == total - prefixSum) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 3};
        boolean ans=canSplit(arr);
        System.out.println(ans);
    }
}
