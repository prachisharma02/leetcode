class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bool=new ArrayList<>();
        int n=candies.length;
        int sum;
      
        for(int i=0;i<n;i++){
          
            sum=candies[i]+extraCandies;
            boolean valid=true;

             for(int j=0;j<n;j++){
                 if(i!=j && sum<candies[j]){
                 valid=false;
                 break;
                 }
             }
             bool.add(valid);
        }
        return bool;
    }
}