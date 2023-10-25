class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1) {
            return (double) nums[0];
        }
        int start = 0;
        int end = k - 1;
        int sum = 0;

        // Calculate the sum of the first k elements
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }

        double maxavg = (double) sum / k; // Initialize maxavg with the average of the first k elements

        while (end < nums.length - 1) {
            // Update the sum by subtracting the element that is no longer part of the window and adding the new element
            sum = sum - nums[start] + nums[end + 1];
            start++;
            end++;

            double avg = (double) sum / k; // Calculate the average for the current window

            if (avg > maxavg) {
                maxavg = avg;
            }
        }

        return maxavg;
    }
}
