class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        int []arr=new int[2];
        while(start<end){
           int sum=numbers[start]+numbers[end];
           if(target==sum){
               arr[0]=start+1;
               arr[1]=end+1;
               break;
           }else if(sum>target){
               end--;
           }
           else if(sum<target){
               start++;
           }
        }
        return arr;
    }
}