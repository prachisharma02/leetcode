class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1) {
            return (double) nums[0];
        }
        int start = 0;
        int end = k - 1;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        double maxavg = (double) sum / k; 
        while (end < nums.length - 1) {
            sum = sum - nums[start] + nums[end + 1];
            start++;
            end++;
            double avg = (double) sum / k; 
            if (avg > maxavg) {
                maxavg = avg;
            }
        }
        return maxavg;
    }
}
