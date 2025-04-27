// QUESTION 8
// Find the longest palindromic substring in a given string. Write its algorithm, program.
// Find its time and space complexities. Explain with suitable example.
// ANSWER
// Algorithm: Expand around each center
// Time/Space: O(n²)/O(1)
// Example: "babad" → Result: "bab" or "aba"
public class Question8 {
    public static String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
        String odd = expand(s, i, i);
        String even = expand(s, i, i + 1);
        if (odd.length() > res.length()) res = odd;
        if (even.length() > res.length()) res = even;
        }
        return res;
        }
        private static String expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
        l--; r++;
        }
        return s.substring(l + 1, r);
    }
    public static void main(String[] args) {
        String a ="babad";
        String ans=longestPalindrome(a);
        System.out.println(ans);
    }
}
