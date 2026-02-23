class Solution {
    public String reverseWords(String s) {

        char[] arr = s.toCharArray();
        StringBuilder res = new StringBuilder();

        int i = arr.length - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && arr[i] == ' ') i--;

            if (i < 0) break;

            int j = i;

            // Find start of word
            while (j >= 0 && arr[j] != ' ') j--;

            // Append word
            if (res.length() > 0) res.append(' ');

            for (int k = j + 1; k <= i; k++) {
                res.append(arr[k]);
            }

            i = j - 1;
        }

        return res.toString();
    }
}
