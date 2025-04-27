// KRISHNA KUMAR YADAV
// 22SCSE1410066
// QUESTION 14
// Find the median of two sorted arrays using binary search. Write its algorithm, program.
// Find its time and space complexities. Explain with suitable example.
// ANSWER
// Algorithm: Use binary search on the smaller array to find correct partition.
// Time/Space: O(log(min(m,n)))/O(1)
public class Question14 {
    public static double findMedianSortedArrays(int[] A, int[] B) {
        if (A.length > B.length) return findMedianSortedArrays(B, A);
        int m = A.length, n = B.length, half = (m + n + 1) / 2;
        int left = 0, right = m;
        while (left <= right) {
        int i = (left + right) / 2;
        int j = half - i;
        int Aleft = (i == 0) ? Integer.MIN_VALUE : A[i - 1];
        int Aright = (i == m) ? Integer.MAX_VALUE : A[i];
        int Bleft = (j == 0) ? Integer.MIN_VALUE : B[j - 1];
        int Bright = (j == n) ? Integer.MAX_VALUE : B[j];
        if (Aleft <= Bright && Bleft <= Aright)
        return (m + n) % 2 == 0 ? (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0 : Math.max(Aleft, Bleft);
    }
    // Add a return statement to handle cases where no value is returned in the loop
    return 0.0; // Default return value, adjust as needed based on requirements
    }
}
