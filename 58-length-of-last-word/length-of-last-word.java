class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();                 // remove leading/trailing spaces
        String[] parts = s.split("\\s+");
        return parts[parts.length - 1].length();
    }
}
