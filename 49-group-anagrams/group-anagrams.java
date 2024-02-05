class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> mp=new HashMap<>();

       for(String ch:strs){
           char[] charr=ch.toCharArray();
          Arrays.sort(charr);
           String str=new String(charr);
           if(!mp.containsKey(str)){
                 mp.put(str,new ArrayList<String>());
           }mp.get(str).add(ch);          
       }
       return new ArrayList<>(mp.values());
    }
}