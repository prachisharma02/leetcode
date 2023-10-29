class Solution {
    public int longestSubarray(int[] nums) {
         int start = 0; 
         int maxLen = 0; 
         int zeroes = 0;
    
    for (int end = 0;end < nums.length; end++) {
        if (nums[end] == 0) {
            zeroes++;
        }
        while (zeroes > 1) {
            if (nums[start] == 0) {
                zeroes--;
            }
            start++;
        }
     maxLen = Math.max(maxLen, end - start);
    }
    if (zeroes == 0) {
        return nums.length - 1;
    }
    return maxLen;
    }
}