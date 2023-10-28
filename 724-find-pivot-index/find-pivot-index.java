class Solution {
    public int pivotIndex(int[] nums) {
        
        int leftsum=0;
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
           s+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            s-=nums[i];
        if(s==leftsum)
        { return i;
        }
        leftsum+=nums[i];
    }
    return -1;
    }
};