class Solution {
    public String removeStars(String s) {
        Stack st=new Stack();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='*' && !st.isEmpty()){
                st.pop();
            }else
            st.push(s.charAt(i));
        }
       StringBuffer sb=new StringBuffer();
       while (!st.isEmpty()) {
            sb.insert(0,st.pop());
        }
    return sb.toString();
    }
}