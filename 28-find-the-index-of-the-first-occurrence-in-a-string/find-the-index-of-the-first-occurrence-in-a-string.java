public class Solution {

    public static int strStr(String haystack, String needle) {
        // If needle is empty, return 0
        if (needle.length() == 0) return 0;

        int n = haystack.length();
        int m = needle.length();

        // Loop through haystack
        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            // Compare characters
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If entire needle matched
            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}

    