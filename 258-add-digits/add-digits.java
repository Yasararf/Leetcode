class Solution {
    public static int add(int n){
        int sum = 0;
        while(n != 0){
            int d = n%10;
            sum += d;
            n = n/10;
        }
        if(sum <= 9){
            return sum;
        }
        else{
            sum = add(sum);
        }
        return sum;
    }
    public int addDigits(int num) {
        return add(num);
    }
}