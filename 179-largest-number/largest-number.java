import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(asStrs, (a, b) -> (b + a).compareTo(a + b));
        if (asStrs[0].equals("0")) {
            return "0";
        }
        StringBuilder largestNumStr = new StringBuilder();
        for (String numAsStr : asStrs) {
            largestNumStr.append(numAsStr);
        }

        return largestNumStr.toString();
    }
}
