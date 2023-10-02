import java.util.ArrayList;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Ensure k is within the range of array length

        ArrayList<Integer> ar = new ArrayList<>();

        // Copy the last k elements to ar
        for (int i = n - k; i < n; i++) {
            ar.add(nums[i]);
        }

        // Copy the first (n - k) elements to ar
        for (int j = 0; j < n - k; j++) {
            ar.add(nums[j]);
        }

        // Copy the elements from ar back to nums
        for (int i = 0; i < n; i++) {
            nums[i] = ar.get(i);
        }
    }
}
