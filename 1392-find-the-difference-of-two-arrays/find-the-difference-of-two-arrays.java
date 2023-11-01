class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums1) {
            s1.add(num);
        }
        for (int num : nums2) {
            s2.add(num);
        }

        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();

        for (int num : nums1) {
            if (!s2.contains(num) && !a1.contains(num)) {
                a1.add(num);
            }
        }

        for (int num : nums2) {
            if (!s1.contains(num) && !a2.contains(num)) {
                a2.add(num);
            }
        }

        result.add(a1);
        result.add(a2);
        return result;
    }
}
