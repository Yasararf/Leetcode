import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean[] present = new boolean[101];

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
            present[num] = true;
        }
        for (int i = min; i <= max; i++) {
            if (!present[i]) {
                result.add(i);
            }
        }

        return result;
    }
}
