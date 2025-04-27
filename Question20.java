// KRISHNA KUMAR YADAV
// 22SCSE1410066
// QUESTION 20
// Count all numbers with unique digits for a given number of digits. Write its algorithm,
// program. Find its time and space complexities. Explain with suitable example.
// ANSWER
// Algorithm: Use permutations based on position and decreasing choices
// Time/Space: O(n)/O(1)
// Example: n = 2 → Result: 91 (from 0 to 99, excluding repeated digits)
// Here are the answers for questions 21 to 25, each within 200 words, with Java code and
// explanation:
public class Question20 {
    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int result = 10, uniqueDigits = 9, available = 9;
        for (int i = 2; i <= n && available > 0; i++) {
        uniqueDigits *= available--;
        result += uniqueDigits;
        }
        return result;
        }
}
