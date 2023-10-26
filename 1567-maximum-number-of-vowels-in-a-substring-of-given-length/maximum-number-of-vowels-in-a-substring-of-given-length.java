class Solution {
    public int maxVowels(String s, int k) {
        int start = 0;
        int end = k - 1;
        int count = 0;
        int ans = 0;
        char[] str = s.toCharArray();
        
        // Initialize the vowel count for the first substring
        for (int i = start; i <= end; i++) {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
                count++;
            }
        }
        
        ans = count;
        
        while (end < str.length - 1) {
            start++;
            end++;
            
            // Remove the outgoing character from the count
            if (str[start - 1] == 'a' || str[start - 1] == 'e' || str[start - 1] == 'i' || str[start - 1] == 'o' || str[start - 1] == 'u') {
                count--;
            }
            
            // Add the incoming character to the count
            if (str[end] == 'a' || str[end] == 'e' || str[end] == 'i' || str[end] == 'o' || str[end] == 'u') {
                count++;
            }
            
            if (count > ans) {
                ans = count;
            }
        }
        
        return ans;
    }
}
