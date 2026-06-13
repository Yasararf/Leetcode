class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int l = nums1.length + nums2.length;
        int[] nums = new int[l];
        
        
        for(int i = 0; i<l; i++){
            if(i < nums1.length){
                nums[i] = nums1[i];
            }
            else{
                nums[i] = nums2[i-nums1.length];
            }
            
        }
        Arrays.sort(nums);
        if(l%2 == 0){
            median =nums[(nums.length/2)-1]+nums[(nums.length/2)];
            median = median/2;

            
        }
        else{
            median = nums[(nums.length/2)];
            
        }
        return median;
        
      
    }
}