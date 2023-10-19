class Solution {
    public int compress(char[] chars) {
        if (chars.length <= 1)
            return chars.length;

        StringBuilder compressed = new StringBuilder();
        char currentChar = chars[0];
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                count++;
            } else {
                compressed.append(currentChar);
                if (count > 1) {
                    compressed.append(count);
                }
                currentChar = chars[i];
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(currentChar);
        if (count > 1) {
            compressed.append(count);
        }

        // Copy the compressed characters back to the original array
        for (int i = 0; i < compressed.length(); i++) {
            chars[i] = compressed.charAt(i);
        }

        return compressed.length();
    }
}
