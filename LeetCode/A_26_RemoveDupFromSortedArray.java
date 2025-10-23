import java.util.Arrays;

public class A_26_RemoveDupFromSortedArray {
    public static int removeDuplicates(int[] nums) {

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

    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
}
