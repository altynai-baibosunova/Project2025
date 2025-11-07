public class A_189_RotateArray {
    public void rotate(int[] nums, int k) {

        reverse(nums, 0, k);
        reverse(nums, k, nums.length-1);
        reverse(nums, 0, k);

    }

    private void reverse(int[] nums, int left, int right){

        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
