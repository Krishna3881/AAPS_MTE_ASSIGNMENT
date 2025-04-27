// QUESTION 3
// Solve the problem of finding the equilibrium index in an array. Write its algorithm,
// program. Find its time and space complexities. Explain with suitable example.
// ANSWER
// Algorithm: Total sum - left sum - current element = left sum
// Time/Space: O(n)/O(1)
// Example: [1, 3, 5, 2, 2] → Index 2 is equilibrium (1+3 == 2+2)
public class Question3 {
    public static int findEquilibrium(int[] arr) {
        int total = 0, leftSum = 0;
        for (int num : arr) total += num;
        for (int i = 0; i < arr.length; i++) {
        total -= arr[i];
        if (leftSum == total) return i;
        leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 2, 2};
        int ans=findEquilibrium(arr);
        System.out.println(ans);
    }
}
