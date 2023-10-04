class Solution {
    public String interpret(String command) {
      
      String bra=command.replace("()","o");
      String a=bra.replace("(al)","al");
      return a;
    }
}