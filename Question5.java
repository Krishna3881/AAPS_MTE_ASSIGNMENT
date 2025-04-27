// QUESTION 5
// Find the maximum sum of any subarray of size K in a given array. Write its algorithm,
// program. Find its time and space complexities. Explain with suitable example.
// ANSWER
// Algorithm: Use sliding window to sum k elements and track max
// Time/Space: O(n)/O(1)
// Example: [2, 1, 5, 1, 3, 2], K=3 → Max sum is 9 from [5,1,3]
public class Question5 {
    public static int maxSum(int[] arr, int k) {
        int maxSum = 0, windowSum = 0;
        for (int i = 0; i < k; i++) windowSum += arr[i];
        maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
        windowSum += arr[i] - arr[i - k];
        maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={2, 1, 5, 1, 3, 2};
        int k=3;
        int ans=maxSum(arr,k);
        System.out.println(ans);
    }
}
