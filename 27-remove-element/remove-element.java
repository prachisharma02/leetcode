class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList ar =new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                ar.add(nums[i]);
            }
        
            for(int j=0;j<ar.size();j++){
                nums[j] = (int)ar.get(j);
            }
        }
        return ar.size();
    }
}