class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        
        int sum = 0;
        List<Integer> ind = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                sum = nums[i] + nums[j];
                if(sum == target){
                    ind.add(i);
                    ind.add(j);
                }
            }
            
        }
        int[] arr = ind.stream().mapToInt(Integer::intValue).toArray();
        return arr;

    }
}