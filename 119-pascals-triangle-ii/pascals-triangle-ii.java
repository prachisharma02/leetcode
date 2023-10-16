class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l=new ArrayList<>();
         l.add(1);
        long prev = 1;
        for(int i=1;i<=rowIndex;i++){
         long next_val = prev * (rowIndex - i + 1) / i;
            l.add((int) next_val);
            prev = next_val;
        }
        return l;
    }
}