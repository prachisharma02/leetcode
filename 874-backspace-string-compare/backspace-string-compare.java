class Solution {
    public boolean backspaceCompare(String s, String t) {
        return newstr(s).equals(newstr(t));
    }

    public String newstr(String str) {
        char[] result = new char[str.length()];
        int index = 0;

        for (char c : str.toCharArray()) {
            if (c != '#') {
                result[index] = c;
                index++;
            } else if (index > 0) {
                index--;
            }
        }

        return new String(result, 0, index);
    }
}
