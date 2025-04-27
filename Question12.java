// KRISHNA KUMAR YADAV
// 22SCSE1410066
// QUESTION 12
// Rearrange numbers into the lexicographically next greater permutation. Write its
// algorithm, program. Find its time and space complexities. Explain with suitable
// example.
// ANSWER
// Algorithm:
// 1. Find the first decreasing element from the right.
// 2. Swap it with the next greater element to its right.
// 3. Reverse the suffix.
// Time/Space: O(n)/O(1)
// Example: [1,2,3] → [1,3,2]
public class Question12 {
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;
        if (i >= 0) {
        int j = nums.length - 1;
        while (nums[j] <= nums[i]) j--;
        swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
        }
        private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
        }
        private static void reverse(int[] nums, int start, int end) {
        while (start < end) swap(nums, start++, end--);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        nextPermutation(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
