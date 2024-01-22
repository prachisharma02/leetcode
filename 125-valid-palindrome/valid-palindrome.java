class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       char[] a=s.toCharArray();
        int start=0;
        int end=a.length-1;
        while(start<end){
            if (a[start]!=a[end]){
                return false;
            }start++;
            end--;    
        }
        return true;

    }
}