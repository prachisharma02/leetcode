class Solution {
    public int maxOperations(int[] nums, int k) {
        int start=0;
        int count=0;
        int end=nums.length-1;
        Arrays.sort(nums);
        while(start<end){
            int temp=nums[start]+nums[end];
            if(temp==k){
                count++;
                start++;
                end--;
            }
            else if(temp>k){
                end--;
            }else
            start++;
            
        }
        return count;
    }
}