class Solution {
    static void sort(int[] nums, int[] l, int[] r){
        int i=0,j=0,k=0;
        while(i<l.length && j<r.length){
            if(l[i]<r[j]){
                nums[k] = l[i];
                i++;
            }
            else{
                nums[k] = r[j];
                j++;
            }
            k++;
        }
        while(i<l.length){
            nums[k] = l[i];
            i++;
            k++;
        }
        while(j<r.length){
            nums[k]=r[j];
            j++;
            k++;
        }
    }


    public int[] sortArray(int[] nums) {
        if(nums.length<=1){
            return nums;
        }
        int mid = nums.length/2;
        int[] l = Arrays.copyOfRange(nums,0,mid);
        int[] r = Arrays.copyOfRange(nums,mid,nums.length);

        sortArray(l);
        sortArray(r);

        sort(nums,l,r);

        return nums;
    }
}