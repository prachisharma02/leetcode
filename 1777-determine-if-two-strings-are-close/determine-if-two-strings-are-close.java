class Solution {
    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        // Count character frequencies in both strings
        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
        }

        // Check if character frequencies are the same
        if (freq1.keySet().equals(freq2.keySet())) {
            // Check if frequencies can be transformed
            HashMap<Integer, Integer> countFreq1 = new HashMap<>();
            HashMap<Integer, Integer> countFreq2 = new HashMap<>();

            for (int freq : freq1.values()) {
                countFreq1.put(freq, countFreq1.getOrDefault(freq, 0) + 1);
            }

            for (int freq : freq2.values()) {
                countFreq2.put(freq, countFreq2.getOrDefault(freq, 0) + 1);
            }

            return countFreq1.equals(countFreq2);
        }

        return false;
    }
}

        
 