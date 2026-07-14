class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        String a = jewels;
        String b = stones;
        int sum = 0;
        for(int i = 0; i<a.length(); i++){
            for(int j = 0; j<b.length(); j++){
                if(a.charAt(i) == b.charAt(j)){
                    sum++;
                }
            }
        }
        return sum;


    }
}