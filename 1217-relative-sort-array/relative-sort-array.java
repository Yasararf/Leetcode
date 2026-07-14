class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int l = 0;
        int r = 0;
        for(int i : arr2){
            
            while(r<arr1.length){
                if(i == arr1[r]){
                    int t = arr1[r];
                    arr1[r] = arr1[l];
                    arr1[l] = t;
                    l++;
                }
                r++;
            }
            r = l;

        }
        Arrays.sort(arr1, l, arr1.length);
        return arr1;
        
    }
}