// QUESTION 10
//  Generate all permutations of a given string. Write its algorithm, program. Find its time
// and space complexities. Explain with suitable example.
// ANSWER
// Algorithm: Backtracking by swapping
// Time/Space: O(n!) / O(n)
// Example: "abc" → "abc", "acb", "bac", "bca", "cab", "cba"
public class Question10 {
    public static void permute(String str, int l, int r) {
        if (l == r) System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
        }
        private static String swap(String str, int i, int j) {
        char[] ch = str.toCharArray();
        char temp = ch[i]; ch[i] = ch[j]; ch[j] = temp;
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        String a="abababba";
        permute(a, 0, 3);
    }
}
