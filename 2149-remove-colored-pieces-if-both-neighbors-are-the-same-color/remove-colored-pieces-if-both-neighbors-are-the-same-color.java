class Solution {
    public boolean winnerOfGame(String colors) {
        int len = colors.length();
        int AliceCount = 0;
        int BobCount = 0;

        for(int i=1;i<len-1;i++){
            if(colors.charAt(i-1) == 'A' && colors.charAt(i) == 'A' && colors.charAt(i+1)  == 'A' )
                AliceCount++;
            else if(colors.charAt(i-1) == 'B' && colors.charAt(i) == 'B' && colors.charAt(i+1)  == 'B')
                BobCount++;
        }
        if(AliceCount>BobCount)
            return true;
            else
            return false;
    }
}