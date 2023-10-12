class Solution {
    public void reverseString(char[] s) {
        char temp;
        int n=s.length;
        for(int i=0;i<n/2;i++){
            temp=s[n-i-1];
            s[n-i-1]=s[i];
            s[i]=temp;
        }
    }
}