class Solution {
    public int largestAltitude(int[] gain) {
        int maxalt = 0;
        int alt = 0;
        for (int i = 0; i < gain.length; i++) {
            alt += gain[i];
            maxalt = Math.max(maxalt, alt);
        }
        return maxalt;
    }
}
