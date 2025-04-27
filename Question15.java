// KRISHNA KUMAR YADAV
// 22SCSE1410066
// QUESTION 15
// Find the k-th smallest element in a sorted matrix. Write its algorithm, program. Find its 
// time and space complexities. Explain with suitable example.
// ANSWER
// Algorithm: Min-heap or binary search over value range
// Time/Space: O(k·log(n))/O(n)
// Example: [[1,5,9],[10,11,13],[12,13,15]], k=8 → Result: 13

import java.util.PriorityQueue;

public class Question15 {
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] -
        b[0]);
        for (int i = 0; i < matrix.length; i++)
        pq.offer(new int[]{matrix[i][0], i, 0});
        while (--k > 0) {
        int[] curr = pq.poll();
        if (curr[2] + 1 < matrix[0].length)
        pq.offer(new int[]{matrix[curr[1]][curr[2] + 1], curr[1],
        curr[2] + 1});
        }
        return pq.peek()[0];
    }
    public static void main(String[] args) {
        int arr[][]={{1,5,9},{10,11,13},{12,13,15}};
        int k=8;
        int ans=kthSmallest(arr, k);
        System.out.println(ans);

    }
}
