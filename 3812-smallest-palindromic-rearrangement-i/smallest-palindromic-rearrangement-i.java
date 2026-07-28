import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }
        String oddChar = "";
        for (int i = 0; i < 26; i++) {
            if (counts[i] % 2 != 0) {
                oddChar = String.valueOf((char) (i + 'a'));
                counts[i]--; 
                break;
            }
        }
        StringBuilder firstHalf = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < counts[i] / 2; j++) {
                firstHalf.append((char) (i + 'a'));
            }
        }
        StringBuilder result = new StringBuilder(firstHalf);
        result.append(oddChar);
        result.append(new StringBuilder(firstHalf).reverse());

        return result.toString();
    }
}
