class Solution {
    public static void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
   public static void reverse(int start, int end, int[] nums) {
      while (start < end) {
            swap(start, end, nums);
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(0,n-1,nums);
            return;
        }
        for (int i = n - 1; i >index; i--) {
        if (nums[i] > nums[index]) {
            swap(i, index, nums);
            break;
        }
    }
        reverse(index+1,n-1,nums);
        
        
    }
}