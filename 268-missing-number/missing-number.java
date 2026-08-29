class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int missing = 0;
        if(nums[0] != 0){
            return missing;
        }
        for(int i = 0; i<nums.length; i++){
            if(i != nums[i]){
                return i;
            }
            else{
                missing = nums.length;
            }
        }
        return missing;
    }
}