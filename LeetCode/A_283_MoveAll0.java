import java.util.Arrays;

public class A_283_MoveAll0 {
    public static int[] moveZeroes(int[] nums) {
        int index=0;
        for (int num : nums){
            if(num != 0){
                nums[index++] = num;
            }
        }
        while(index<nums.length){
            nums[index++] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZ(nums)));
    }

    public static int[] moveZ(int[] nums) {
        int nonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[nonZero] = nums[i];
                nonZero++;
            }

        }
        while(nonZero< nums.length){
            nums[nonZero] = 0;
            nonZero++;
        }

        return nums;
    }
}
