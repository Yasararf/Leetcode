class Solution {
    public int sqr(int n){
        int ans = 0;
        while(n != 0){
            int temp = n%10;
            ans += temp*temp;
            n /= 10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        List<Integer> seen = new ArrayList<>();
        while(!seen.contains(n)){
            int ans = sqr(n);
            seen.add(n);
            if(ans == 1){
                return true;
            }
            n = ans;
            ans = 0;
        }
        return false;
    }
}