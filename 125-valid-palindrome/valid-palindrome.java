class Solution {
    public boolean isPalindrome(String s) {
s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        char[] a = s.toCharArray();
        // int i = 0;
        int n = a.length ;

        for (int i = 0; i < n / 2; i++) {
        if (a[i] != a[n - i - 1]) {
            return false;
        }
    }
     return true;
}
}
