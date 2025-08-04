import java.util.Arrays;

public class HackerRank_27_RemoveElements {

        public int removeElement(int[] nums, int val) {
            int index = 0;

            for (int i = 0; i < nums.length; i++) { //3,2,2,3
                if ( nums[i] == val) {// index == 2
                    continue; //skip
                }else{
                    nums[index] = nums[i]; //nums
                    index++;
            }

            }
            return index;
        }

    public static void main(String[] args) {
            HackerRank_27_RemoveElements obj = new HackerRank_27_RemoveElements();
            int[] nums = {4,6,7,8,6,9};
            int result = obj.removeElement(nums,6); //


        System.out.println(result);
    }
}
//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//It does not matter what you leave beyond the returned k (hence they are underscores).