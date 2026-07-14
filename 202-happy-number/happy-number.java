class Solution {
    public int hash(int n){
            int sum = 0;
            while(n != 0){
                int rem = n%10;
                sum += rem*rem;
                n /= 10;
            }
            return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        int temp = n;
        
        while(temp>1 && !seen.contains(temp)){
            seen.add(temp);
            temp = hash(temp);
        }
        return temp == 1;
    }
}