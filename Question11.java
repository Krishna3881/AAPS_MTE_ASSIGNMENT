// KRISHNA KUMAR YADAV
// 22SCSE1410066
// QUESTION 11
// Find two numbers in a sorted array that add up to a target. Write its algorithm, program.
// Find its time and space complexities. Explain with suitable example.
// ANSWER
// Algorithm: Use two pointers from both ends.
// Time/Space: O(n)/O(1)
// Example: [1, 2, 4, 7, 11], target 9 → Output: [1, 3]
public class Question11 {
    public static int[] findTwoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
        int sum = arr[left] + arr[right];
        if (sum == target) return new int[]{left, right};
        else if (sum < target) left++;
        else right--;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 4, 7, 11};
        int target=9;
        int arr1[]=findTwoSum(arr, target);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
