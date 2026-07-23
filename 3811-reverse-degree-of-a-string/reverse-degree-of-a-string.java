class Solution {
    public int reverseDegree(String s) {
        int totalSum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // Calculate the 1-indexed position in the string
            int stringPosition = i + 1;
            
            // Calculate the value in the reversed alphabet ('a' = 26, 'b' = 25, ..., 'z' = 1)
            int reversedAlphabetValue = 26 - (c - 'a');
            
            // Add the product to the total sum
            totalSum += reversedAlphabetValue * stringPosition;
        }
        
        return totalSum;
    }
}
