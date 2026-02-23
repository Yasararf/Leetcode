
class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int cnt = 0;
        for(int num : nums){
            if(cnt == 0){
                c = num;
            }
            if (num == c){
                cnt++;
            }
            else{
                cnt--;
            }
                
        }
        return c;
    }
}