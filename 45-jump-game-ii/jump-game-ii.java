class Solution {
    public int jump(int[] nums) {
        int count = 0;
        int maxReach = 0;
        int nextMaxReach = 0;
        for (int i = 0; i < nums.length - 1; i++) {
      nextMaxReach = Math.max(nextMaxReach, i + nums[i]);
            if (i == maxReach) {
                maxReach = nextMaxReach;
                count++;
            }
        }
        return count;
    }
}
