class Solution {
    public int reverseDegree(String s) {
        int totalSum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int stringPosition = i + 1;

            int reversedAlphabetValue = 26 - (c - 'a');
            totalSum += reversedAlphabetValue * stringPosition;
        }
        
        return totalSum;
    }
}
