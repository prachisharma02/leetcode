class Solution {
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
    }
    public void rotate(int[] nums, int k) {
       int n=nums.length;
       if (n == 1) {
           return; // No rotation needed for a single-element array
       }
       k = k % n; // Handle cases where k is greater than n
       if (k == 0) {
           return; // No rotation needed if k is a multiple of n
       }
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
        
    }
}