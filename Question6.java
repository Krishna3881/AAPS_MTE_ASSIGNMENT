// QUESTION 6
// Find the length of the longest substring without repeating characters. Write its
// algorithm, program. Find its time and space complexities. Explain with suitable
// example.
// ANSWER
// Algorithm: Use sliding window and HashSet to track characters.
// Time/Space: O(n)/O(n)
// Example: "abcabcbb" → Result: 3 ("abc")
import java.util.HashSet;
public class Question6 {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
        while (!set.add(s.charAt(right)))
        set.remove(s.charAt(left++));
        maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String a ="abcabcbb";
        int ans=lengthOfLongestSubstring(a);
        System.out.println(ans);
    }
}
