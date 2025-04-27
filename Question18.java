// KRISHNA KUMAR YADAV
// 22SCSE1410066
// QUESTION 18
// Find the maximum XOR of two numbers in an array. Write its algorithm, program.
// Find its time and space complexities. Explain with suitable example.
// ANSWER
// Algorithm: Use Trie for bit-level storage
// Time/Space: O(n)/O(n)
// Example: [3,10,5,25,2,8] → Max XOR = 28 (5 ^ 25)

import java.util.HashSet;
public class Question18 {
    public static int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) set.add(num & mask);
                int temp = max | (1 << i);
            for (int prefix : set)
            if (set.contains(temp ^ prefix)) {
                max = temp; break;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={3,10,5,25,2,8};
        int ans=findMaximumXOR(arr);
        System.out.println(ans);
    }
}
