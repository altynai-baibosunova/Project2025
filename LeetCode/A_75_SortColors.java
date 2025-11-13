import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_75_SortColors {
    public static int[] sortColors(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i]>nums[j]){
                    int swap = nums[i];
                    nums[i]  = nums[j];
                    nums[j] = swap;
                    list.add(nums[i]);
                }

            }

        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,0,2,2,3,1};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
}
//Example 1:
//
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
//Example 2:
//
//Input: nums = [2,0,1]
//Output: [0,1,2]