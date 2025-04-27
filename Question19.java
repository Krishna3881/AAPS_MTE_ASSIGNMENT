// KRISHNA KUMAR YADAV
// 22SCSE1410066
// QUESTION 19
// How to find the maximum product subarray. Write its algorithm, program. Find its time
// and space complexities. Explain with suitable example.
// ANSWER
// Algorithm: Track both max and min (for negative flips)
// Time/Space: O(n)/O(1)
// Example: [2,3,-2,4] → Max product: 6
public class Question19 {
    public static int maxProduct(int[] nums) {
        int max = nums[0], currMax = nums[0], currMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
        int temp = currMax;
        currMax = Math.max(nums[i], Math.max(currMax * nums[i], currMin
        * nums[i]));
        currMin = Math.min(nums[i], Math.min(temp * nums[i], currMin *
        nums[i]));
        max = Math.max(max, currMax);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
        int ans=maxProduct(arr);
        System.out.println(ans);
    }
}
