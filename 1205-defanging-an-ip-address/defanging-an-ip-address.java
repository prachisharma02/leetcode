class Solution {
    public String defangIPaddr(String address) {
       String defang=address.replace(".","[.]");
       return defang;
    }
}