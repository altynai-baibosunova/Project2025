public class A_1_Sum_ {
    public int[] twoSum(int[] nums, int target) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{};
    }
}
