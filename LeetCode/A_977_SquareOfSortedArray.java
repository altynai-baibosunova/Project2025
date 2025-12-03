import java.util.Arrays;

public class A_977_SquareOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
}
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]