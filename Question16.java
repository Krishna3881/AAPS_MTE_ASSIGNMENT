// KRISHNA KUMAR YADAV
// 22SCSE1410066
// QUESTION 16
// Find the majority element in an array that appears more than n/2 times. Write its
// algorithm, program. Find its time and space complexities. Explain with suitable
// example.
// ANSWER
// Algorithm: Moore’s Voting Algorithm
// Time/Space: O(n)/O(1)
// Example: [2,2,1,1,1,2,2] → Majority is 2
public class Question16 {
    public static int findMajority(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
        if (count == 0) candidate = num;
        count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        int ans=findMajority(arr);
        System.out.println(ans);
    }
}
