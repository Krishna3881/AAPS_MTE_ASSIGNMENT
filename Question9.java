// QUESTION 9
// Find the longest common prefix among a list of strings. Write its algorithm, program.
// Find its time and space complexities. Explain with suitable example.
// ANSWER
// Algorithm: Compare characters column-wise
// Time/Space: O(n·m)/O(1)
// Example: ["flower","flow","flight"] → Result: "fl"
public class Question9 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
        while (!strs[i].startsWith(prefix))
        prefix = prefix.substring(0, prefix.length() - 1);
        }
        return prefix;
    }
    public static void main(String[] args) {
        String arr[]={"flower","flow","flight"};
        String ans=longestCommonPrefix(arr);
        System.out.println(ans);
    }
}
