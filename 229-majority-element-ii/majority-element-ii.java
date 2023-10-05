class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int max = n / 3;
        ArrayList<Integer> ar = new ArrayList<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        
  
        for (int num : nums) {
    if (count.containsKey(num)) {
        count.put(num, count.get(num) + 1);
    } else {
        count.put(num, 1);
    }
}
for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > max) {
                ar.add(entry.getKey());
            }
        }
        
        return ar;
    }
}
