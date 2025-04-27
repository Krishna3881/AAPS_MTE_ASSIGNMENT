// KRISHNA KUMAR YADAV
// 22SCSE1410066
// QUESTION 17
// Calculate how much water can be trapped between the bars of a histogram. Write its
// algorithm, program. Find its time and space complexities. Explain with suitable
// example.
// ANSWER
// Algorithm: Precompute left max and right max arrays
// Time/Space: O(n)/O(n)
// Example: [0,1,0,2,1,0,1,3,2,1,2,1] → Water = 6
public class Question17 {
    public static int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n], right = new int[n];
        left[0] = height[0];
        right[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) left[i] = Math.max(left[i - 1],
        height[i]);
        for (int i = n - 2; i >= 0; i--) right[i] = Math.max(right[i + 1],
        height[i]);
        int water = 0;
        for (int i = 0; i < n; i++)
        water += Math.min(left[i], right[i]) - height[i];
        return water;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int w=6;
        int ans=trap(arr);
        System.out.println(ans);
    }
}
