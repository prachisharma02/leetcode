class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int max = n / 3;
        ArrayList<Integer> ar = new ArrayList<>();
        
        // Create a HashMap to count occurrences of each element
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        // Count occurrences of each element
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Check if the count of each element is greater than n/3
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > max) {
                ar.add(entry.getKey());
            }
        }
        
        return ar;
    }
}
