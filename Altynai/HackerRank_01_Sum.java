public class HackerRank_01_Sum {
    public static int Sum(int[] nums, int target){
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp += nums[i];

            if(temp == target){

                return temp;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Sum(nums,target));
    }
}
