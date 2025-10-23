public class A_26_RemoveDupFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[1] != nums[j]){
                i++;
                nums[i] = nums[j];
            }else{

            }
            j++;
        }
        return i+1;
    }
}
