class Solution {
    public int lengthLongestPath(String input) {
     
        String[] lines = input.split("\n");
        int[] d = new int[lines.length + 1];
        int maxLen = 0;

        for (String line : lines) {
            int depth = line.lastIndexOf("\t") + 1;
  
            int nameLen = line.length() - depth;

            if (line.contains(".")) {
                int currentLen = d[depth] + nameLen;
                maxLen = Math.max(maxLen, currentLen);
            } else {
                d[depth + 1] = d[depth] + nameLen + 1;
            }
        }

        return maxLen;
    }
}
