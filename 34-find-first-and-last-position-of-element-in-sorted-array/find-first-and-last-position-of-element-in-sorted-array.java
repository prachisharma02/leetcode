class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int start= search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
        int search(int[] nums, int target,boolean found){
        int ans=-1;
        int start=0;
        int n=nums.length;
        int end=n-1;
        while(start<=end)
        {
           int mid=(start+end)/2;

        if(target<nums[mid])
        {
            end=mid-1;
        }
        else if(target==nums[mid])
        {
            ans=mid;
            if(found)
                end=mid-1;
            else
               start=mid+1;
        }
        else
        {
        start=mid+1;
        }
        }
        return ans;
    
        }
}