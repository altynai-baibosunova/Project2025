public class A_26_RemoveDupl {
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }else{

            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(A_26_RemoveDupl.removeDuplicates(nums));
    }
}
